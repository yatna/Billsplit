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
import android.widget.*;

import com.example.SettleMe.R;

public class MakePayment extends Activity implements OnClickListener{
   Button View,Go,Submit;
   int counter;
   EditText GroupId,From,Ratio1,Ratio2,Ratio3,Ratio4,Ratio5,Comment,Amount; 
   TextView GpName,Mem1,Mem2,Mem3,Mem4,Mem5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.makepay);
		initialize();
	}
      
	
	private void initialize()
    {  Go=(Button)findViewById(R.id.b1);
    View=(Button)findViewById(R.id.b2);
	  Submit=(Button)findViewById(R.id.b3);
	  GpName=(TextView)findViewById(R.id.tv);
	  Mem1=(TextView)findViewById(R.id.tv1);
	  Mem2=(TextView)findViewById(R.id.tv2);
	  Mem3=(TextView)findViewById(R.id.tv3);
	  Mem4=(TextView)findViewById(R.id.tv4);
	  Mem5=(TextView)findViewById(R.id.tv5);
	  Amount=(EditText)findViewById(R.id.et);
        GroupId=(EditText)findViewById(R.id.et1);
        From=(EditText)findViewById(R.id.et2);
        Ratio1=(EditText)findViewById(R.id.et3);
       Ratio2=(EditText)findViewById(R.id.et4);
       Ratio3=(EditText)findViewById(R.id.et5);
       Ratio4=(EditText)findViewById(R.id.et6);
       Ratio5=(EditText)findViewById(R.id.et7);
       Comment=(EditText)findViewById(R.id.et8);
        Submit.setOnClickListener(this);
        Go.setOnClickListener(this);
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
				//int sum=0, div1=0 ,div2=0, div3=0, div4=0, div5=0;
				String s = GroupId.getText().toString();
				
//				String a = Amount.getText().toString();
//				String r1 = Ratio1.getText().toString();
//				String r2 = Ratio1.getText().toString();
//				String r3 = Ratio1.getText().toString();
//				String r4 = Ratio1.getText().toString();
//				String r5 = Ratio1.getText().toString();
				String f = From.getText().toString();
				long l = Long.parseLong(s);
//				int A =Integer.parseInt(a);
//				int R1 = Integer.parseInt(r1);
//				int R2 = Integer.parseInt(r2);
//				int R3= Integer.parseInt(r3);
//				int R4= Integer.parseInt(r4);
//				int R5= Integer.parseInt(r5);
//				
//				sum= R1 + R2 + R3 + R4 + R5;
//				if(sum!=0)
//				{
//				div1=(A/sum)*R1;
//				div2=(A/sum)*R2;
//				div3=(A/sum)*R3;
//				div4=(A/sum)*R4;
//				div5=(A/sum)*R5;
//				}
//				else {
//			    	Dialog d = new Dialog(this);
//					d.setTitle("Dang !!");
//					TextView tv = new TextView(this);
//					tv.setText("Enter valid Ratio");
//					d.setContentView(tv);
//					d.show();
//			    }
//				
					
				
				
				Data hon = new Data(MakePayment.this);
				hon.open();
				String returnedName = hon.getName(l);
				String returnedMem1 = hon.getMem1(l);
				String returnedMem2 = hon.getMem2(l);
				String returnedMem3 = hon.getMem3(l);
				String returnedMem4 = hon.getMem4(l);
				String returnedMem5 = hon.getMem5(l);
				String returnedMem6 = hon.getMem6(l);
//				int returnedSum1 = hon.getSum1(l);
//				int returnedSum2 = hon.getSum2(l);
//				int returnedSum3 = hon.getSum3(l);
//				int returnedSum4 = hon.getSum4(l);
//				int returnedSum5 = hon.getSum5(l);
//				int returnedSum6 = hon.getSum6(l);
				hon.close();
			    GpName.setText(returnedName);
			    
			    if(f.equals(returnedMem1))
			    {Mem1.setText(returnedMem2);
				Mem2.setText(returnedMem3);
				Mem3.setText(returnedMem4);
				Mem4.setText(returnedMem5);
				Mem5.setText(returnedMem6);
//				returnedSum1=returnedSum1-A;
//				returnedSum2=returnedSum2+div1;
//				returnedSum3=returnedSum3+div2;
//				returnedSum4=returnedSum4+div3;
//				returnedSum5=returnedSum5+div4;
//				returnedSum6=returnedSum6+div5;
				
			    }
			    else if(f.equals(returnedMem2))
			    {Mem1.setText(returnedMem1);
				Mem2.setText(returnedMem3);
				Mem3.setText(returnedMem4);
				Mem4.setText(returnedMem5);
				Mem5.setText(returnedMem6);
//				returnedSum2=returnedSum2-A;
//				returnedSum1=returnedSum1+div1;
//				returnedSum3=returnedSum3+div2;
//				returnedSum4=returnedSum4+div3;
//				returnedSum5=returnedSum5+div4;
//				returnedSum6=returnedSum6+div5;
			    }
			    else if(f.equals(returnedMem3))
			    {Mem1.setText(returnedMem1);
				Mem2.setText(returnedMem2);
				Mem3.setText(returnedMem4);
				Mem4.setText(returnedMem5);
				Mem5.setText(returnedMem6);
//				returnedSum3=returnedSum3-A;
//				returnedSum1=returnedSum1+div1;
//				returnedSum2=returnedSum2+div2;
//				returnedSum4=returnedSum4+div3;
//				returnedSum5=returnedSum5+div4;
//				returnedSum6=returnedSum6+div5;
			    	
			    }
			    else if(f.equals(returnedMem4))
			    {Mem1.setText(returnedMem1);
				Mem2.setText(returnedMem2);
				Mem3.setText(returnedMem3);
				Mem4.setText(returnedMem5);
				Mem5.setText(returnedMem6);
//				returnedSum4=returnedSum4-A;
//				returnedSum1=returnedSum1+div1;
//				returnedSum2=returnedSum2+div2;
//				returnedSum3=returnedSum3+div3;
//				returnedSum5=returnedSum5+div4;
//				returnedSum6=returnedSum6+div5;
			    }
			    else if(f.equals(returnedMem5))
			    {Mem1.setText(returnedMem1);
				Mem2.setText(returnedMem2);
				Mem3.setText(returnedMem3);
				Mem4.setText(returnedMem4);
				Mem5.setText(returnedMem6);
//				returnedSum5=returnedSum5-A;
//				returnedSum1=returnedSum1+div1;
//				returnedSum2=returnedSum2+div2;
//				returnedSum3=returnedSum3+div3;
//				returnedSum4=returnedSum4+div4;
//				returnedSum6=returnedSum6+div5;
			    }
			    else if(f.equals(returnedMem6))
			    {Mem1.setText(returnedMem1);
				Mem2.setText(returnedMem2);
				Mem3.setText(returnedMem3);
				Mem4.setText(returnedMem4);
				Mem5.setText(returnedMem5);
//				returnedSum6=returnedSum6-A;
//				returnedSum1=returnedSum1+div1;
//				returnedSum2=returnedSum2+div2;
//				returnedSum3=returnedSum3+div3;
//				returnedSum4=returnedSum4+div4;
//				returnedSum5=returnedSum5+div5;
			    }
			    else
			    {
			    	Dialog d = new Dialog(this);
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText("Enter a valid Group Member");
					d.setContentView(tv);
					d.show();
			    }
				
				
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
		case R.id.b3:
			try {
				int sum=0, div1=0 ,div2=0, div3=0, div4=0, div5=0;
				counter=0;
				String s = GroupId.getText().toString();
				if(s.equals(""))
				{ counter=1;
					Dialog d = new Dialog(this);
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText("Enter a Group Id");
					d.setContentView(tv);
					d.show();	
				}
			
				
				String a = Amount.getText().toString();
				String c= Comment.getText().toString();
				String r1 = Ratio1.getText().toString();
				String r2 = Ratio2.getText().toString();
				String r3 = Ratio3.getText().toString();
				String r4 = Ratio4.getText().toString();
				String r5 = Ratio5.getText().toString();
				String f = From.getText().toString();
				long l = Long.parseLong(s);
				int A =Integer.parseInt(a);
				int R1 = Integer.parseInt(r1);
				int R2 = Integer.parseInt(r2);
				int R3= Integer.parseInt(r3);
				int R4= Integer.parseInt(r4);
				int R5= Integer.parseInt(r5);
				if(A==0)
				{
					Dialog p = new Dialog(this);
					p.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText("Enter a value for Amount");
					p.setContentView(tv);
					p.show();
					
				}
				sum= R1 + R2 + R3 + R4 + R5;
				if(sum!=0)
				{
				div1=(A/sum)*R1;
				div2=(A/sum)*R2;
				div3=(A/sum)*R3;
				div4=(A/sum)*R4;
				div5=(A/sum)*R5;
				String temp=""+A +" "+ div1 + " "+div2+" "+div3+" "+div4+" "+div5;
				Dialog t=new Dialog(this);
				t.setTitle("check");
				TextView tv1 = new TextView(this);
				tv1.setText(temp);
				t.setContentView(tv1);
				}
				else {
					
			    	Dialog d = new Dialog(this);
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText("Enter valid Ratio");
					d.setContentView(tv);
					d.show();
			    }
				
					
				
				
				Data pon = new Data(MakePayment.this);
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
			    //GpName.setText(returnedName);
				
				String newDes=existingDes;
			    
			    if(f.equals(returnedMem1))
			    {
//			    Mem1.setText(returnedMem2);
//				Mem2.setText(returnedMem3);
//				Mem3.setText(returnedMem4);
//				Mem4.setText(returnedMem5);
//				Mem5.setText(returnedMem6);
				returnedSum1=returnedSum1-A;
				returnedSum2=returnedSum2+div1;
				returnedSum3=returnedSum3+div2;
				returnedSum4=returnedSum4+div3;
				returnedSum5=returnedSum5+div4;
				returnedSum6=returnedSum6+div5;
				if(div1!=0)
				 newDes= newDes+ " " + returnedMem1 + "->" + returnedMem2 + "("+ div1 + ")";
				if(div2!=0)
					 newDes= newDes + " " + returnedMem1 + "->" + returnedMem3 + "("+ div2 + ")";
				if(div3!=0)
					 newDes= newDes + " " + returnedMem1 + "->" + returnedMem4 + "("+ div3 + ")";
				if(div4!=0)
					 newDes= newDes + " " + returnedMem1 + "->" + returnedMem5 + "("+ div4 + ")";
				if(div5!=0)
					 newDes= newDes + " " + returnedMem1 + "->" + returnedMem6 + "("+ div5 + ")";
				
				newDes=newDes + "@" +c + "\n";
				
			    }
			    else if(f.equals(returnedMem2))
			    {
//			    Mem1.setText(returnedMem1);
//				Mem2.setText(returnedMem3);
//				Mem3.setText(returnedMem4);
//				Mem4.setText(returnedMem5);
//				Mem5.setText(returnedMem6);
				returnedSum2=returnedSum2-A;
				returnedSum1=returnedSum1+div1;
				returnedSum3=returnedSum3+div2;
				returnedSum4=returnedSum4+div3;
				returnedSum5=returnedSum5+div4;
				returnedSum6=returnedSum6+div5;
				
				if(div1!=0)
					 newDes= newDes+ " " + returnedMem2 + "->" + returnedMem1 + "("+ div1 + ")";
					if(div2!=0)
						 newDes= newDes + " " + returnedMem2 + "->" + returnedMem3 + "("+ div2 + ")";
					if(div3!=0)
						 newDes= newDes + " " + returnedMem2 + "->" + returnedMem4 + "("+ div3 + ")";
					if(div4!=0)
						 newDes= newDes + " " + returnedMem2 + "->" + returnedMem5 + "("+ div4 + ")";
					if(div5!=0)
						 newDes= newDes + " " + returnedMem2 + "->" + returnedMem6 + "("+ div5 + ")";
					
					newDes=newDes + "@" +c + "\n";
			    }
			    else if(f.equals(returnedMem3))
			    {
//			    Mem1.setText(returnedMem1);
//				Mem2.setText(returnedMem2);
//				Mem3.setText(returnedMem4);
//				Mem4.setText(returnedMem5);
//				Mem5.setText(returnedMem6);
     			returnedSum3=returnedSum3-A;
				returnedSum1=returnedSum1+div1;
				returnedSum2=returnedSum2+div2;
				returnedSum4=returnedSum4+div3;
				returnedSum5=returnedSum5+div4;
				returnedSum6=returnedSum6+div5;
				
				if(div1!=0)
					 newDes= newDes+ " " + returnedMem3 + "->" + returnedMem1 + "("+ div1 + ")";
					if(div2!=0)
						 newDes= newDes + " " + returnedMem3 + "->" + returnedMem2 + "("+ div2 + ")";
					if(div3!=0)
						 newDes= newDes + " " + returnedMem3 + "->" + returnedMem4 + "("+ div3 + ")";
					if(div4!=0)
						 newDes= newDes + " " + returnedMem3 + "->" + returnedMem5 + "("+ div4 + ")";
					if(div5!=0)
						 newDes= newDes + " " + returnedMem3 + "->" + returnedMem6 + "("+ div5 + ")";
					
					newDes=newDes + "@" +c + "\n";
			    
			    	
			    }
			    else if(f.equals(returnedMem4))
			    {
//			    Mem1.setText(returnedMem1);
//				Mem2.setText(returnedMem2);
//				Mem3.setText(returnedMem3);
//				Mem4.setText(returnedMem5);
//				Mem5.setText(returnedMem6);
				returnedSum4=returnedSum4-A;
				returnedSum1=returnedSum1+div1;
				returnedSum2=returnedSum2+div2;
				returnedSum3=returnedSum3+div3;
				returnedSum5=returnedSum5+div4;
				returnedSum6=returnedSum6+div5;
				

				    if(div1!=0)
					 newDes= newDes+ " " + returnedMem4 + "->" + returnedMem1 + "("+ div1 + ")";
					if(div2!=0)
						 newDes= newDes + " " + returnedMem4 + "->" + returnedMem2 + "("+ div2 + ")";
					if(div3!=0)
						 newDes= newDes + " " + returnedMem4 + "->" + returnedMem3 + "("+ div3 + ")";
					if(div4!=0)
						 newDes= newDes + " " + returnedMem4 + "->" + returnedMem5 + "("+ div4 + ")";
					if(div5!=0)
						 newDes= newDes + " " + returnedMem4 + "->" + returnedMem6 + "("+ div5 + ")";
					
					newDes=newDes + "@" +c + "\n";
			    }
			    else if(f.equals(returnedMem5))
			    {
//			    Mem1.setText(returnedMem1);
//				Mem2.setText(returnedMem2);
//				Mem3.setText(returnedMem3);
//				Mem4.setText(returnedMem4);
//				Mem5.setText(returnedMem6);
				returnedSum5=returnedSum5-A;
				returnedSum1=returnedSum1+div1;
				returnedSum2=returnedSum2+div2;
				returnedSum3=returnedSum3+div3;
				returnedSum4=returnedSum4+div4;
				returnedSum6=returnedSum6+div5;
				
				 if(div1!=0)
					 newDes= newDes+ " " + returnedMem5 + "->" + returnedMem1 + "("+ div1 + ")";
					if(div2!=0)
						 newDes= newDes + " " + returnedMem5 + "->" + returnedMem2 + "("+ div2 + ")";
					if(div3!=0)
						 newDes= newDes + " " + returnedMem5 + "->" + returnedMem3 + "("+ div3 + ")";
					if(div4!=0)
						 newDes= newDes + " " + returnedMem5 + "->" + returnedMem4 + "("+ div4 + ")";
					if(div5!=0)
						 newDes= newDes + " " + returnedMem5 + "->" + returnedMem6 + "("+ div5 + ")";
					
					newDes=newDes + "@" +c + "\n";
			    }
			    else if(f.equals(returnedMem6))
			    {
//			    Mem1.setText(returnedMem1);
//				Mem2.setText(returnedMem2);
//				Mem3.setText(returnedMem3);
//				Mem4.setText(returnedMem4);
//				Mem5.setText(returnedMem5);
				returnedSum6=returnedSum6-A;
				returnedSum1=returnedSum1+div1;
				returnedSum2=returnedSum2+div2;
				returnedSum3=returnedSum3+div3;
				returnedSum4=returnedSum4+div4;
				returnedSum5=returnedSum5+div5;
				
				 if(div1!=0)
					 newDes= newDes+ " " + returnedMem6 + "->" + returnedMem1 + "("+ div1 + ")";
					if(div2!=0)
						 newDes= newDes + " " + returnedMem6 + "->" + returnedMem2 + "("+ div2 + ")";
					if(div3!=0)
						 newDes= newDes + " " + returnedMem6 + "->" + returnedMem3 + "("+ div3 + ")";
					if(div4!=0)
						 newDes= newDes + " " + returnedMem6 + "->" + returnedMem4 + "("+ div4 + ")";
					if(div5!=0)
						 newDes= newDes + " " + returnedMem6 + "->" + returnedMem5 + "("+ div5 + ")";
					
					newDes=newDes + "@" +c + "\n";
			    }
			    else
			    {
			    	Dialog d = new Dialog(this);
					d.setTitle("Dang !!");
					TextView tv = new TextView(this);
					tv.setText("Enter a valid Group Member");
					d.setContentView(tv);
					d.show();
			    }
			    
			    Data ex = new Data(MakePayment.this);
				ex.open();
				ex.updateSum(l, returnedSum1, returnedSum2, returnedSum3, returnedSum4, returnedSum5, returnedSum6, newDes);

				ex.close();
				
				
			} catch (Exception e) {
//				Dialog d = new Dialog(this);
//				String error = e.toString();
//				d.setTitle("Dang !!");
//				TextView tv = new TextView(this);
//				tv.setText(error);
//				d.setContentView(tv);
//				d.show();
			}
			
			if(counter!=1)
			{
			Dialog d = new Dialog(this);
			d.setTitle("Heck Yeah");
			TextView tv = new TextView(this);
			tv.setText("Payment Recoreded");
			d.setContentView(tv);
			d.show();}
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
