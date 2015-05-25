package com.example.BibliotecaUCSM;

import com.example.BibliotecaUCSM.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class busqueda extends Activity {
	String[] libros =  {
			"Administración de Producción y Operaciones",
			"Dirección de Operaciones",
			"Dirección y administración de la Producción y de las Operaciones",
			"Diseño de instalaciones de manufactura y manejo de materiales",
			"Estudio del Trabajo Medición del Trabajo",
			"Ing. Industrial. Métodos, Tiempo y Movimientos",
			"Investigacion de Operaciones",
			"Investigación de Operaciones",
			"Investigación de Operaciones, Aplicaciones y Algoritmos",
			"Sistemas de Informacion Gerencial"

	};
		public void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.busqueda);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,libros);
		AutoCompleteTextView textView = (AutoCompleteTextView)
				findViewById(R.id.txtLibros);
		textView.setThreshold(3);
		textView.setAdapter(adapter);
		
		}
		

}
