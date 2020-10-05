package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class IMC extends AppCompatActivity {

    private EditText etPeso;
    private EditText etEstatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_m_c);

        etPeso     = findViewById(R.id.peso);
        etEstatura = findViewById(R.id.estatura);
    }

    public void btnCalcularIMC(View v){
        Intent i = new Intent(IMC.this, IMC_Result.class);
        i.putExtra("peso", etPeso.getText().toString());
        i.putExtra("estatura", etEstatura.getText().toString());
        startActivity(i);
    }
}