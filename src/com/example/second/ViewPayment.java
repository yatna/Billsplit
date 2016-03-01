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
import android.widget.TabHost;
import android.widget.TextView;

public class ViewPayment extends Activity implements OnClickListener{
	TextView Results,GpName;
	EditText GpId;
	Button View,Go,History;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewpayment);
		initialize();
	}

	
	 private void initialize()
	    {    
	         View=(Button)findViewById(R.id.b12);
	         Go=(Button)findViewById(R.id.b22);
	         History=(Button)findViewById(R.id.b32);
	       
	         GpId=(EditText)findViewById(R.id.et12);
	         Results=(TextView)findViewById(R.id.tv22);
	         GpName=(TextView)findViewById(R.id.tv12);
	 		 View.setOnClickListener(this);
	  		Go.setOnClickListener(this);
	  		History.setOnClickListener(this);
	 		
	    }
	 
	 public void manage_orders(int[] arr,String[] name)
		{
			int i,j,swap;
			String temp,result="";
			int[] input=new int[arr.length];
			for(i=0;i<arr.length;i++)
			{
				//input[0][i]=i+1;
				input[i]=arr[i];
			}
			for(i=0;i< arr.length-1;i++)
			{
				for(j=0;j<arr.length-i-1;j++)
				{
					if(input[j]>input[j+1])
					{
						swap=input[j];
						input[j]=input[j+1];
						input[j+1]=swap;
						temp=name[j];
						name[j]=name[j+1];
						name[j+1]=temp;
					}
				}
			}
			/*for(i=0;i<2;i++)
			{
				for(j=0;j<arr.length;j++)
					System.out.print(input[i][j] + "\t");
			System.out.println();
			}*/
			for(i=0,j=arr.length-1;i!=j;)
			{
				if(Math.abs(input[i])>=Math.abs(input[j]))
				{
					if(input[j]!=0)
					{
						result=result.concat(name[j]);
						result=result.concat(" pays Rs ");
						result=result.concat(String.valueOf(Math.abs(input[j])));
						result=result.concat(" to ");
						result=result.concat(name[i]);
						result=result.concat("\n");
					}
							//System.out.println(name[j] + " pays Rs " + Math.abs(input[j])+ " to " + name[i] );
							input[i]=input[i]+input[j];
							input[j]=0;
							
							j--;
				}
				else
				{
					if(input[i]!=0)
					{
					result=result.concat(name[j]);
					result=result.concat(" pays Rs ");
					result=result.concat(String.valueOf(Math.abs(input[i])));
					result=result.concat(" to ");
					result=result.concat(name[i]);
					result=result.concat("\n");
					}
					//System.out.println(name[j]+ " pays Rs " + Math.abs(input[i])+ " to " +name[i] );
					
					input[j]=input[j]+input[i];
					input[i]=0;
					i++;
				}
					
			}
			Results.setText(result);
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
			
			case R.id.b12:
				Intent i = new Intent(this, DataView.class);
				startActivity(i);
				break;
				
			case R.id.b22:
				try {
					String s = GpId.getText().toString();
					long l = Long.parseLong(s);
					Data pon = new Data(ViewPayment.this);
					pon.open();
					String returnedName = pon.getName(l);
					String returnedMem1 = pon.getMem1(l);
					String returnedMem2 = pon.getMem2(l);
					String returnedMem3 = pon.getMem3(l);
					String returnedMem4 = pon.getMem4(l);
					String returnedMem5 = pon.getMem5(l);
					String returnedMem6 = pon.getMem6(l);
					String existingDes= pon.getComment(l);
					int returnedSum1 = pon.getSum1(l);
					int returnedSum2 = pon.getSum2(l);
					int returnedSum3 = pon.getSum3(l);
					int returnedSum4 = pon.getSum4(l);
					int returnedSum5 = pon.getSum5(l);
					int returnedSum6 = pon.getSum6(l);
					pon.close();
					
					String[] name=new String[6];
					name[0]=returnedMem1;
					name[1]=returnedMem2;
					name[2]=returnedMem3;
					name[3]=returnedMem4;
					name[4]=returnedMem5;
					name[5]=returnedMem6;
					int[] a=new int[6];
					a[0]=returnedSum1;
					a[1]=returnedSum2;
					a[2]=returnedSum3;
					a[3]=returnedSum4;
					a[4]=returnedSum5;
					a[5]=returnedSum6;
					GpName.setText(returnedName);
					manage_orders(a,name);
				
					
					
				
					
					
				    
				} 
				catch (Exception o) {
					Dialog d = new Dialog(this);
					String error = o.toString();
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText(error);
					d.setContentView(tv);
					d.show();
				}
				
				break;
			case R.id.b32:
				try {
					String s = GpId.getText().toString();
					long l = Long.parseLong(s);
					Data hon = new Data(ViewPayment.this);
					hon.open();
					String history = hon.getComment(l);
					hon.close();
					
					Dialog d = new Dialog(this);
					d.setTitle("History");
					TextView tv = new TextView(this);
					tv.setText(history);
					d.setContentView(tv);
					d.show();
				    
				} 
				catch (Exception o) {
					Dialog d = new Dialog(this);
					String error = o.toString();
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText(error);
					d.setContentView(tv);
					d.show();
				}
				
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
