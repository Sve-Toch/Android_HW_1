package com.example.hw;

import android.R.bool;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class Dialog {	
	    public static final int IDD_PAGE_1 = 1; // Идентификаторы диалоговых окон
	    public static final int IDD_PAGE_3 = 3;
	    
	    public static AlertDialog getDialog(Activity activity, int ID) {
	        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(activity,R.style.DialogTheme ));

	        switch(ID) {
	        case IDD_PAGE_1: // Диалоговое окно About
	            builder.setTitle(R.string.Dialog);
	           //activity.setTheme(R.style.DialogTheme);
	            builder.setCancelable(true);
	            LayoutInflater inflater = activity.getLayoutInflater();

	            builder.setView(inflater.inflate(R.layout.dialog_main, null));
	          
	    /*       builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
	                @Override
	                public void onClick(DialogInterface dialog, int which) {	                    
	                	dialog.dismiss(); // Отпускает диалоговое окно					
	                }
	            });
	            builder.setNeutralButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // Cancel
	                @Override
	                public void onClick(DialogInterface dialog, int which) {
	                    dialog.dismiss(); // Отпускает диалоговое окно
	                }
	            });
	            */
	            
	            
	            return builder.create();
	        case IDD_PAGE_3: // Диалоговое окно page3
	        	 final boolean[] mCheckedItems = { false };
		            final String[] checkCatsName = { "Больше не показывать это окно" };
	        	builder.setTitle(R.string.Dialog);
	            builder.setCancelable(true);
	            LayoutInflater inflater2 = activity.getLayoutInflater();

	            builder.setView(inflater2.inflate(R.layout.dialog_p3, null));
	      /*      builder.setMultiChoiceItems(checkCatsName, mCheckedItems,
	                    new DialogInterface.OnMultiChoiceClickListener() {
	                        @Override
	                        public void onClick(DialogInterface dialog,
	                                int which, boolean isChecked) {
	                            mCheckedItems[which] = isChecked;
	                        }
	                    });
	            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // Кнопка ОК
	                @Override
	                public void onClick(DialogInterface dialog, int which) {
	                    dialog.dismiss(); // Отпускает диалоговое окно					
	                }
	            });
	            builder.setNeutralButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // Cancel
	                @Override
	                public void onClick(DialogInterface dialog, int which) {
	                    dialog.dismiss(); // Отпускает диалоговое окно
	                }
	            });
	            */
	            return builder.create();
	        
	       
	        default:
	            return null;
	        }		
	    }
	}

