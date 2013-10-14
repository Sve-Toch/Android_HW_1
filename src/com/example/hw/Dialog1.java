package com.example.hw;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Dialog1 extends DialogFragment implements OnClickListener {

	public interface EditNameDialog1Listener{
		void onFinishEditDialog(String inputText);
	}
	final String LOG_TAG = "myLogs";
	private EditText et;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
		getDialog().setTitle(R.string.Dialog);
		View v = inflater.inflate(R.layout.dialog_main, null);
		et = (EditText)v.findViewById(R.id.editText1_dialog_p1);
		v.findViewById(R.id.button1_dialog_p1).setOnClickListener(this);
		v.findViewById(R.id.button2_dialog_p1).setOnClickListener(this);
		return v;
	}

	public void onClick(View v) {
		if (v.getId()==R.id.button1_dialog_p1)
		{
			String value = et.getText().toString();
			EditNameDialog1Listener callAct  =(EditNameDialog1Listener)getActivity();
			callAct.onFinishEditDialog(value);
		}
		Log.d(LOG_TAG, "Dialog 1: " + ((Button) v).getText());
		this.dismiss();
	}

	  public void onDismiss(DialogInterface dialog) {
	    super.onDismiss(dialog);
	    Log.d(LOG_TAG, "Dialog 1: onDismiss");
	  }
	
	  public void onCancel(DialogInterface dialog) {
	    super.onCancel(dialog);
	    Log.d(LOG_TAG, "Dialog 1: onCancel");
	  }
}