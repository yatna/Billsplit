package com.example.second;

import com.example.SettleMe.R;

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

public class DeleteGrp extends Activity implements OnClickListener{

	Button DeleteGroup,View;
	EditText GpId;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.deletegrp);
		initialize();
	}
    
	 private void initialize()
	    {   
		 DeleteGroup=(Button)findViewById(R.id.b1);
		 //Go=(Button)findViewById(R.id.bGo);
		 View=(Button)findViewById(R.id.b2);
         GpId=(EditText)findViewById(R.id.et);
         DeleteGroup.setOnClickListener(this);
         //Go.setOnClickListener(this);
         View.setOnClickListener(this);
	 		
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
			
			case R.id.b1:
				try {
					String sRow1 = GpId.getText().toString();
					long lRow1 = Long.parseLong(sRow1);
					Data ex1 = new Data(DeleteGrp.this);
					ex1.open();
					ex1.deleteEntry(lRow1);
					ex1.close();
					Dialog d = new Dialog(this);
					d.setTitle("Heck Yeah");
					TextView tv = new TextView(this);
					tv.setText("Group Deleted");
					d.setContentView(tv);
					d.show();
				} catch (Exception e) {
					Dialog d = new Dialog(this);
					String error = e.toString();
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText(error);
					d.setContentView(tv);
					d.show();
				}
				break;
			case R.id.b2:
				Intent i = new Intent(this, DataView.class);
				startActivity(i);
				break;
				
			
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
