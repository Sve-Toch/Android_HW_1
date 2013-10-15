package com.example.hw;


import com.example.hw.Dialog1.EditNameDialog1Listener;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends Activity implements EditNameDialog1Listener {
	  EditText editTextMain;
	     EditText editText;
	     Button buttonOk;
	     Button buttonCancel;
	     AlertDialog dialog ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageButton btn1 = (ImageButton) findViewById(R.id.ImageButton1);
	    editTextMain= (EditText) findViewById(R.id.EditText);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, Page1.class);
				i.putExtra("text",editTextMain.getText().toString());
				startActivity(i);
			}
		});
		ImageButton btn2 = (ImageButton) findViewById(R.id.ImageButton2);
		btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, Page2.class);
				startActivity(i);
			}
		});
		
		ImageButton btn3 = (ImageButton) findViewById(R.id.ImageButton3);
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, Page3.class);
				startActivity(i);
			}
		});
	   
	   
		Button btn4 = (Button) findViewById(R.id.buttonDialog);
		btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				 DialogFragment dlg1 = new Dialog1();
			      dlg1.show(getFragmentManager(), "dlg1");
			}	
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public void onFinishEditDialog(String inputText) {
		editTextMain.setText(editTextMain.getText()+inputText);

	}

}
