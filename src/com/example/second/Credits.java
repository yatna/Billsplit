package com.example.second;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.SettleMe.R;

public class Credits extends Activity{
 TextView display;
 String s="1) Yatna Verma \n    Electronics Engineering \n    Part - II \n    IIT(BHU) \n    yatnavermaa@gmail.com\n \n2) Urishita Puri \n    Electronics Engineering\n     Part - II \n    IIT(BHU)     urishita.puri.ece13@itbhu.ac.in";
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.credits);
		display=(TextView)findViewById(R.id.tv1);
		display.setText(s);
	}
	
	

}
