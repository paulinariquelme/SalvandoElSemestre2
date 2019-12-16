package com.example.salvandoelsemestre2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Ingresar extends AppCompatActivity {

    EditText email;
    EditText contraseña;
    Button ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        email=findViewById(R.id.Email);
        contraseña=findViewById(R.id.Pass);
        ingresar=findViewById(R.id.ingreso);

        ingresar.setOnClickListener(v->{
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
