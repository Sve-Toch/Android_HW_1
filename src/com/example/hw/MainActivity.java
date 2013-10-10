package com.example.hw;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageButton btn1 = (ImageButton) findViewById(R.id.ImageButton1);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, page1.class);
				startActivity(i);
			}
		});
		ImageButton btn2 = (ImageButton) findViewById(R.id.ImageButton2);
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, page2.class);
				startActivity(i);
			}
		});
		
		ImageButton btn3 = (ImageButton) findViewById(R.id.ImageButton3);
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, page3.class);
				startActivity(i);
			}
		});
		Button btn4 = (Button) findViewById(R.id.buttonDialog);
		btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				  AlertDialog dialog = Dialog.getDialog(MainActivity.this, Dialog.IDD_PAGE_1);
			        dialog.show();
			}	
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
