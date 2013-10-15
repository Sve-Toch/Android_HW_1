package com.example.hw;

import com.example.hw.Dialog2.EditNameDialog2Listener;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class Page3 extends Activity implements EditNameDialog2Listener {
	CheckBox ch;
	Button buttonOk;
	Button buttonCancel;
	Boolean mgs=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page3);
		
		Button btn3 = (Button) findViewById(R.id.buttonDialog2);
		
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				   if (mgs==false){
					   
					   DialogFragment dlg2 = new Dialog2();
					      dlg2.show(getFragmentManager(), "dlg1");
				   }
				}	
			});
			}
	@Override
	public void onFinishEditDialog2(Boolean value) {
		// TODO Auto-generated method stub
		mgs=value;
		}	
	@Override
	public void onSaveInstanceState(Bundle savednstanceState)
	{
		super.onSaveInstanceState(savednstanceState);
		savednstanceState.putBoolean("mgs1", mgs);
	}
	@Override
	public void onRestoreInstanceState(Bundle savednstanceState)
	{
		super.onRestoreInstanceState(savednstanceState);
		 mgs= savednstanceState.getBoolean("mgs1");
	}

	
}
		
		
		

