package com.example.second;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.example.SettleMe.R;

public class Splash extends Activity{
     MediaPlayer song;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		song=MediaPlayer.create(Splash.this, R.raw.music);
		SharedPreferences getPrefs=PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		boolean music=getPrefs.getBoolean("checkbox", true);
		if(music==true)
		song.start();
		
		Thread timer=new Thread(){
			
			public void run(){
				try{ sleep(1500);
			        }
				catch(InterruptedException e){
					e.printStackTrace();
		         }
				finally{ 
					Intent openStartingPoint=new Intent("com.second.START");
					startActivity(openStartingPoint);}
	           }
	
		};
		timer.start();
          }

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		song.release();
		finish();
	}
	}


