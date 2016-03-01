
package com.example.second;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
import com.example.SettleMe.R;

public class MainActivity extends Activity implements OnClickListener {
	TabHost th;
	TextView showRes;
	
	Button Add,Edit,MakePayment,Delete,ViewPayment;
	TabSpec specs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        initialize();
        th.setup();
		specs = th.newTabSpec("tag1");
		specs.setContent(R.id.tab1);
		specs.setIndicator("Home");
		th.addTab(specs);
		 specs = th.newTabSpec("tag2");
		specs.setContent(R.id.tab2);
		specs.setIndicator("About");
		th.addTab(specs);
       
    }
    
    private void initialize()
    {    th=(TabHost)findViewById(R.id.tabhost);
    	 Add=(Button)findViewById(R.id.b1);
         Edit=(Button)findViewById(R.id.b2);
         Delete=(Button)findViewById(R.id.b3);
         MakePayment=(Button)findViewById(R.id.b4);
         ViewPayment=(Button)findViewById(R.id.b5);
         showRes=(TextView)findViewById(R.id.tv1);
         Add.setOnClickListener(this);
 		Edit.setOnClickListener(this);
 		Delete.setOnClickListener(this);
 		MakePayment.setOnClickListener(this);
 		ViewPayment.setOnClickListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
    
        super.onCreateOptionsMenu(menu);
        MenuInflater blowup=getMenuInflater();
        blowup.inflate(R.menu.cool_menu,menu);
        
        return true;
    }

   

    @Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
    	switch(arg0.getId()){
		case R.id.b1:
			Intent q=new Intent("com.second.ADDGROUP");
			startActivity(q);
			break;
		case R.id.b2:
			Intent w=new Intent("com.second.EDITGROUP");
    		startActivity(w);
			break;
		case R.id.b3:
			Intent e=new Intent("com.second.DELETEGRP");
			startActivity(e);
			break;
		case R.id.b4:
			Intent r=new Intent("com.second.MAKEPAYMENT");
			startActivity(r);
			break;
		case R.id.b5:
			Intent i = new Intent("com.second.VIEWPAYMENT");
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
    		System.exit(0);
    		break;
    	}
    	return false;
    }
    
}
