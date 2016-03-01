package com.example.second;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import com.example.SettleMe.R;

public class AddGroup extends Activity implements OnClickListener {
   Button AddGroup,view;
   EditText GpName,Mem1,Mem2,Mem3,Mem4,Mem5,Mem6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addgp);
		initialize();
		
	}
	  private void initialize()
	    {   
		  
	         AddGroup=(Button)findViewById(R.id.b3);
	        // view=(Button)findViewById(R.id.b4);
	         GpName=(EditText)findViewById(R.id.et);
	         Mem1=(EditText)findViewById(R.id.et1);
	         Mem2=(EditText)findViewById(R.id.et2);
	         Mem3=(EditText)findViewById(R.id.et3);
	         Mem4=(EditText)findViewById(R.id.et4);
	         Mem5=(EditText)findViewById(R.id.et5);
	         Mem6=(EditText)findViewById(R.id.et6);
	         
	 		 AddGroup.setOnClickListener(this);
	 		// view.setOnClickListener(this);
	 		
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
			
			case R.id.b3:
				Boolean didItWork = true;
				try {
					String name = GpName.getText().toString();

					String mem1 = Mem1.getText().toString();
					String mem2 = Mem2.getText().toString();
					String mem3 = Mem3.getText().toString();
					String mem4 = Mem4.getText().toString();
					String mem5 = Mem5.getText().toString();
					String mem6 = Mem6.getText().toString();

					Data entry = new Data(AddGroup.this);
					entry.open();
					entry.createEntry(name,mem1,mem2,mem3,mem4,mem5,mem6);
					entry.close();
				} catch (Exception e) {
					didItWork = false;
					Dialog d = new Dialog(this);
					String error = e.toString();
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText(error);
					d.setContentView(tv);
					d.show();
				} finally {
					if (didItWork == true) {
						Dialog d = new Dialog(this);
						d.setTitle("Heck Yeah");
						TextView tv = new TextView(this);
						tv.setText("New Group Added");
						d.setContentView(tv);
						d.show();
					}
				}
				break;
//
//			case R.id.b4:
//				Intent i = new Intent("com.second.DATAVIEW");
//				startActivity(i);
//				break;
			
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

	


