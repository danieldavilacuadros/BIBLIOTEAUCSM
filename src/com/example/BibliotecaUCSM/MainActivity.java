package com.example.BibliotecaUCSM;

import com.example.BibliotecaUCSM.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends Activity {

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
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void clicDevolucion(View view) {
		startActivity(new Intent("com.example.proyecto.devolucion"));
	}
	public void ClicManejador(View view) {
		
			RadioButton busquedaButton = (RadioButton) findViewById(R.id.radio0);
			RadioButton prestamosButton = (RadioButton) findViewById(R.id.radio1);
			if (busquedaButton.isChecked()) {
				startActivity(new Intent("com.example.proyecto.Busqueda"));
			}
			
			if (prestamosButton.isChecked()) {
				startActivity(new Intent("com.example.proyecto.Prestamos"));
			}
		
	}

}
