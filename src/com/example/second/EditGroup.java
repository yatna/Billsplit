package com.example.second;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.SettleMe.R;

public class EditGroup extends Activity implements OnClickListener{
 
	 Button EditGroup,ViewGroup,Go;
	   EditText GpId,Mem1,Mem2,Mem3,Mem4,Mem5,Mem6;
	   TextView GpName;
	   int counter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.editgp);
		initialize();
	}
    
	 private void initialize()
	    {  Go=(Button)findViewById(R.id.bGo); 
	    ViewGroup=(Button)findViewById(R.id.b2); 
		 EditGroup=(Button)findViewById(R.id.b3);
		 GpName=(TextView)findViewById(R.id.tv1);
         GpId=(EditText)findViewById(R.id.et);
         Mem1=(EditText)findViewById(R.id.et1);
         Mem2=(EditText)findViewById(R.id.et2);
         Mem3=(EditText)findViewById(R.id.et3);
         Mem4=(EditText)findViewById(R.id.et4);
         Mem5=(EditText)findViewById(R.id.et5);
         Mem6=(EditText)findViewById(R.id.et6);
         
 		 EditGroup.setOnClickListener(this);
 		ViewGroup.setOnClickListener(this);
 	    Go.setOnClickListener(this);
	 		
	    }
	 public boolean onCreateOptionsMenu(Menu menu) {
		    
	        super.onCreateOptionsMenu(menu);
	        MenuInflater blowup=getMenuInflater();
	        blowup.inflate(R.menu.cool_menu,menu);
	        
	        return true;
	    }
	
	  public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			switch(arg0.getId()){
			
			case R.id.b2:
				Intent i = new Intent(this, DataView.class);
				startActivity(i);
				break;

			case R.id.bGo:
				try {
					String s = GpId.getText().toString();
					long l = Long.parseLong(s);
					Data hon = new Data(EditGroup.this);
					hon.open();
					String returnedName = hon.getName(l);
					String returnedMem1 = hon.getMem1(l);
					String returnedMem2 = hon.getMem2(l);
					String returnedMem3 = hon.getMem3(l);
					String returnedMem4 = hon.getMem4(l);
					String returnedMem5 = hon.getMem5(l);
					String returnedMem6 = hon.getMem6(l);
					hon.close();
				    GpName.setText(returnedName);
					Mem1.setText(returnedMem1);
					Mem2.setText(returnedMem2);
					Mem3.setText(returnedMem3);
					Mem4.setText(returnedMem4);
					Mem5.setText(returnedMem5);
					Mem6.setText(returnedMem6);
				} catch (Exception e) {
					Dialog d = new Dialog(this);
					String error = e.toString();
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText("Enter a valid group Id");
					d.setContentView(tv);
					d.show();
				}
				break;
			case R.id.b3:
				try {
					String s = GpId.getText().toString();
					long lRow = Long.parseLong(s);
					String mMem1 = Mem1.getText().toString();
					String mMem2 = Mem2.getText().toString();
					String mMem3 = Mem3.getText().toString();
					String mMem4 = Mem4.getText().toString();
					String mMem5 = Mem5.getText().toString();
					String mMem6 = Mem6.getText().toString();
					

					Data ex = new Data(EditGroup.this);
					ex.open();
					ex.updateEntry(lRow, mMem1, mMem2, mMem3, mMem4, mMem5, mMem6);
					ex.close();
					if(counter!=1)
					{
					Dialog d = new Dialog(this);
					d.setTitle("Heck Yeah");
					TextView tv = new TextView(this);
					tv.setText("Group Edited");
					d.setContentView(tv);
					d.show();}
					break;
				} catch (Exception e) {
					Dialog d = new Dialog(this);
					String error = e.toString();
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText("Enter a Valid Group Id");
					d.setContentView(tv);
					d.show();
				}
				
			
			}
			
		}
	  
	  public boolean onOptionsItemSelected(MenuItem item) {
	        
	    	switch(item.getItemId()){
	    	case R.id.setting:
	    		Intent b=new Intent("com.second.SETTINGS");
	    		startActivity(b);
	    		break;
	    	case R.id.help:
	    		Intent n=new Intent("com.second.HELP");
	    		startActivity(n);
	    		break;
	    	case R.id.credits:
	    		Intent m=new Intent("com.second.CREDITS");
	    		startActivity(m);
	    		break;
	    		
	    	case R.id.exit:
	    		finish();
	    		break;
	    	}
	    	return false;
	    }
	    
	
	
	

	
}
