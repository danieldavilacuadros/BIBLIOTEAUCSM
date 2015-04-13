package com.example.BibliotecaUCSM;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.BibliotecaUCSM.R;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.view.Menu;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
public class devolucion extends Activity{
	TimePicker timePicker;
	DatePicker datePicker;
	
	int hour,minute;
	static final int TIME_DIALOG_ID = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.devolucion);
		timePicker = (TimePicker) findViewById(R.id.timePicker);
		timePicker.setIs24HourView(true);
		
		datePicker = (DatePicker) findViewById(R.id.datePicker);

	}
	protected Dialog onCreateDialog(int id)
	{
		switch(id)
		{
		case TIME_DIALOG_ID:
			return new TimePickerDialog(this, mTimeSetListener, hour,minute, false);
		}
		return null;
	}
	private TimePickerDialog.OnTimeSetListener mTimeSetListener = new TimePickerDialog.OnTimeSetListener()
	{
		
		@Override
		public void onTimeSet(TimePicker view, int hourOfDay, int minuteOfHour) {
			// TODO Auto-generated method stub
			hour = hourOfDay;
			minute = minuteOfHour;
			
			SimpleDateFormat timeFormat = new SimpleDateFormat ("hh:mm aa");
			Date date = new Date(0,0,0, hour,minute);
			String strDate = timeFormat.format(date);
			Toast.makeText(getBaseContext(),
							"Fecha de devolucion "+ strDate,
							Toast.LENGTH_SHORT).show();
		}
	};
	public void onClick(View view)
	{
		Toast.makeText(getBaseContext(),
				"Fecha devolucion:" + (datePicker.getMonth()+1)+
				"/" + datePicker.getDayOfMonth() +
				"/" + datePicker.getYear() + "\n" +
				"Hora de devolucion:"+timePicker.getCurrentHour()+
				":"+timePicker.getCurrentMinute(),
				Toast.LENGTH_SHORT).show();
	
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
	
		return true;
	}

}
