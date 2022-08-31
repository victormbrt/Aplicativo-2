package com.example.trabajo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {

    private TextView tv1,tv2,tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        tv1 = (TextView) findViewById(R.id.edt_nombrec);
        tv2 = (TextView) findViewById(R.id.edt_apellido);
        tv3 = (TextView) findViewById(R.id.edt_numerocelular);

        String dato = getIntent().getStringExtra("eNombre");
        tv1.setText("Hola " + dato);

        String app = getIntent().getStringExtra("2pellido");
        tv2.setText(app);

        String cel = getIntent().getStringExtra("numero");
        tv3.setText(cel);


    }


    public void Regresar(View view){
        Intent i = new Intent(this, MainActivity.class);
          startActivity(i);

    }


}