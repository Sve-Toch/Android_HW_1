package com.example.hw;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;


public class Page1 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		  requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		  
		  setContentView(R.layout.page1);
		  String text =getIntent().getStringExtra("text");
		  if (text.equals("")==false){
			TextView tv1 =(TextView)findViewById(R.id.textView1_page1);
			TextView tv2 =(TextView)findViewById(R.id.textView2_page1);
			int l=text.length()/2;
			tv1.setText(text.substring(0,l));
			tv2.setText(text.substring(l));}

	        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.window_title);
	}
	
	

}