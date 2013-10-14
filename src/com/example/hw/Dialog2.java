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
import android.widget.CheckBox;

public class Dialog2 extends DialogFragment implements OnClickListener {

	public interface EditNameDialog2Listener{
		void onFinishEditDialog2(Boolean value);
	}
  final String LOG_TAG = "myLogs";
  private CheckBox cb;
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
	  getDialog().setTitle(R.string.Dialog);
	  View v = inflater.inflate(R.layout.dialog_p3, null);
	  cb = (CheckBox)v.findViewById(R.id.checkBox1);
	  v.findViewById(R.id.button1_dialog_p1).setOnClickListener(this);
	  v.findViewById(R.id.button2_dialog_p1).setOnClickListener(this);
	  return v;
  }

  public void onClick(View v) {
	  if (v.getId()==R.id.button1_dialog_p1)
	  {
		Boolean value = cb.isChecked();
		EditNameDialog2Listener callAct  =(EditNameDialog2Listener)getActivity();
		callAct.onFinishEditDialog2(value);
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