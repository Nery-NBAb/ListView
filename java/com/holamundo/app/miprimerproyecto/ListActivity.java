package com.holamundo.app.miprimerproyecto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class ListActivity extends Activity {

    EditText etPalabra;
    ListView lvLista;
    Button btnAgregar;
    ArrayList<Tweet> valores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        etPalabra = (EditText)findViewById(R.id.editText3);
        lvLista = (ListView) findViewById(R.id.listView);
        btnAgregar = (Button) findViewById(R.id.button7);

        valores = new ArrayList<>();
        Tweet valor = new Tweet("Hola","Mundo","09-06-16");
        valores.add(valor);

        valor = new Tweet("Hola","Mundo","09-06-16");
        valores.add(valor);
        valor = new Tweet("Hola","Mundo","09-06-16");
        valores.add(valor);
        valor = new Tweet("Hola","Mundo","09-06-16");
        valores.add(valor);
        valor = new Tweet("Hola","Mundo","09-06-16");
        valores.add(valor);
        valor = new Tweet("Hola","Mundo","09-06-16");
        valores.add(valor);

        valor = new Tweet("Hola","Mundo","09-06-16");
        valores.add(valor);


        valor = new Tweet("Hola","Mundo","09-06-16");
        valores.add(valor);
        valor = new Tweet("Hola","Mundo","09-06-16");
        valores.add(valor);



        TweetAdapter adaptador = new TweetAdapter(this, valores);

        lvLista.setAdapter(adaptador);

    }
}


