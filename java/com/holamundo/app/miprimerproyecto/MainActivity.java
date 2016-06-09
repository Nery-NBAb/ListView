package com.holamundo.app.miprimerproyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText etNumero1, etNumero2;
    Button btnSuma, btnResta, btnMultiplicacion, btnDivision, btnResiduo, btnListado;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumero1 = (EditText) findViewById(R.id.editText);
        etNumero2 = (EditText) findViewById(R.id.editText2);

        btnSuma = (Button) findViewById(R.id.button);
        btnResta= (Button) findViewById(R.id.button2);
        btnMultiplicacion = (Button) findViewById(R.id.button3);
        btnDivision = (Button) findViewById(R.id.button4);
        btnResiduo = (Button) findViewById(R.id.button5);
        btnListado = (Button) findViewById(R.id.button6);

        tvResultado = (TextView) findViewById(R.id.textView);

        btnSuma.setOnClickListener(new OnClickListenerSuma());
        btnResta.setOnClickListener(new OnClickListenerResta());
        btnMultiplicacion.setOnClickListener(new OnClickListenerMultiplicacion());
        btnDivision.setOnClickListener(new OnClickListenerDivision());
        btnResiduo.setOnClickListener(new OnClickListenerResiduo());
        btnListado.setOnClickListener(new OnClickListenerListado());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private class OnClickListenerSuma implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int numero1 = Integer.parseInt(etNumero1.getText().toString() );
            int numero2 = Integer.parseInt(etNumero2.getText().toString() );
            int res = numero1 % numero2;
            tvResultado.setText("Resultado: "+ String.valueOf(res));
        }
    }

    private class OnClickListenerResta implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }

    private class OnClickListenerMultiplicacion implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }

    private class OnClickListenerResiduo implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }

    private class OnClickListenerDivision implements View.OnClickListener {
        @Override
        public void onClick(View v) {

        }
    }

    private class OnClickListenerListado implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent in = new Intent(MainActivity.this, ListActivity.class);
            startActivity(in);
        }
    }
}
