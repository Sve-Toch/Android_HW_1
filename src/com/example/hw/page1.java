package com.example.hw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;


public class page1 extends Activity {
	View header1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		  requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		  
		  setContentView(R.layout.page1);
	 
	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.window_title);
	}
	
	

}