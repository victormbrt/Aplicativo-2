package com.example.trabajo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity  {

    private Button btn_llamar;
    private EditText et1, et2, et3,edt_numero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_llamar = findViewById(R.id.btn_llamar);
        edt_numero = findViewById(R.id.edt_numero);
        et1 = (EditText) findViewById(R.id.edt_Nombre);
        et2 = (EditText) findViewById(R.id.edt_Apellido);
        et3 = (EditText) findViewById(R.id.edt_numero1);


        btn_llamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+edt_numero.getText().toString()));
                startActivity(intent);
            }
        });


    }

            public void Enviar (View view){
            Intent i = new Intent(this, Ventana2.class);
            i.putExtra("eNombre", et1.getText().toString());
            i.putExtra("2pellido",et2.getText().toString());
            i.putExtra("numero", et3.getText().toString());
            startActivity(i);

        }


    }

