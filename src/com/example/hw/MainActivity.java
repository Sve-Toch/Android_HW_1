package com.example.hw;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends Activity {
	  EditText et_m;
	     EditText et;
	     Button b_ok;
	     Button b_c;
	     AlertDialog dialog ;
	     boolean first=true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageButton btn1 = (ImageButton) findViewById(R.id.ImageButton1);
		 et_m= (EditText) findViewById(R.id.EditText);
		btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this, page1.class);
				i.putExtra("first",first);
				if( first==false)
				{i.putExtra("text",et_m.getText().toString());}

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
			
			
				   dialog = Dialog.getDialog(MainActivity.this, Dialog.IDD_PAGE_1);
			        dialog.show();
			      et= (EditText)dialog.findViewById(R.id.editText1_dialog_p1);
			      b_ok= (Button)dialog.findViewById(R.id.button1_dialog_p1);
			      b_c =(Button)dialog.findViewById(R.id.button2_dialog_p1);
			      			        
			      b_ok.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							String s;
							if (first==false ){
							 s =et_m.getText().toString(); 
							} else {first=false; s="";}
							et_m.setText(s+et.getText());
							 dialog.dismiss();
						}
						});
			      b_c.setOnClickListener(new View.OnClickListener() {
						
						@Override
						public void onClick(View v) {
							 dialog.dismiss();
						}
						});
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
