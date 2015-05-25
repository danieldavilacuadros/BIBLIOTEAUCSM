package com.example.BibliotecaUCSM;
import android.os.Bundle;
import android.preference.PreferenceActivity;
public class AppPreferenceActivity extends PreferenceActivity {
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
//---Carga las preferencias de un archivo XML ---
addPreferencesFromResource(R.xml.myapppreferences);
}
}
