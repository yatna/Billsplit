package com.example.second;

import com.example.SettleMe.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preference extends PreferenceActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preference);
	}
	
	

}
