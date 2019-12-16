package com.example.salvandoelsemestre2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText contenidoDeLaCaja;
    Button enviarcontenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contenidoDeLaCaja = findViewById(R.id.Contenido);
        enviarcontenido = findViewById(R.id.BotonEnviar);

        enviarcontenido.setOnClickListener(v -> {
            String mensaje = contenidoDeLaCaja.getText().toString();
            contenidoDeLaCaja.setText("");
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
        });

    }



}
