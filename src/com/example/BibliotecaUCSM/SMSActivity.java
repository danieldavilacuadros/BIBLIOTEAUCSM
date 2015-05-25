package com.example.BibliotecaUCSM;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.telephony.SmsManager;
import android.view.View;

public class SMSActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void onClick(View view)
    {
    	sendSMS("958483592","Hello my friends!");
    }
    
    public void sendSMS(String phoneNumber, String message)
    {
    	SmsManager sms = SmsManager.getDefault();
    	sms.sendTextMessage(phoneNumber, null, message, null, null);
    }
    public void onClickEmail(View view) {
		Intent i = new Intent("com.example.proyecto.emailActivity");
		startActivity(i);
	}
    
}
