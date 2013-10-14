package com.example.hw;

import com.example.hw.Dialog1.EditNameDialog1Listener;
import com.example.hw.Dialog2.EditNameDialog2Listener;

import android.R.bool;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class page3 extends Activity implements EditNameDialog2Listener {
	CheckBox ch;
	Button buttonOk;
	Button buttonCancel;
	Boolean mg=false;
	  AlertDialog dialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page3);
		
		Button btn3 = (Button) findViewById(R.id.buttonDialog2);
		
		btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				   dialog = Dialog.getDialog(page3.this, Dialog.IDD_PAGE_3);
				   if (mg==false){
					   DialogFragment dlg2 = new Dialog2();
					      dlg2.show(getFragmentManager(), "dlg1");
			   //     ch= (CheckBox)dialog.findViewById(R.id.checkBox1);
			   //     ch.setChecked(mg);
				//      buttonOk= (Button)dialog.findViewById(R.id.button1_dialog_p1);
				//      buttonCancel =(Button)dialog.findViewById(R.id.button2_dialog_p1);
				     			        
				//      buttonOk.setOnClickListener(new View.OnClickListener() {
							
				//			@Override
				//			public void onClick(View v) {
				//				Resources res = getResources();
				//				boolean  meg=res.getBoolean(R.bool.mg);
				//			if (ch.isChecked())
				//				
				//			{	mg=true;	ch.setChecked(true);} else
				//				{mg=false;	ch.setChecked(false);
				//				}
							
							
				//				 dialog.dismiss();
				//			}
				//			});
				 //     buttonCancel.setOnClickListener(new View.OnClickListener() {
							
				//			@Override
				//			public void onClick(View v) {
				//				 dialog.dismiss();
				//			}
				//			});
			        
			        
				}	}
			});
			}
	@Override
	public void onFinishEditDialog2(Boolean value) {
		// TODO Auto-generated method stub
		mg=value;
	}	
}
		
		
		

