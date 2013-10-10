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
		  String text =getIntent().getStringExtra("text");
		  if (getIntent().getBooleanExtra("first",true)==false){
			TextView tv1 =(TextView)findViewById(R.id.textView1_page1);
			TextView tv2 =(TextView)findViewById(R.id.textView2_page1);
			int l=text.length()/2;
			tv1.setText(text.substring(0,l));
			tv2.setText(text.substring(l));}

	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.window_title);
	}
	
	

}