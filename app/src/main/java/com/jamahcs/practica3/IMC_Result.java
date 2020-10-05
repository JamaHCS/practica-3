package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IMC_Result extends AppCompatActivity {

    private TextView tvIMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_m_c__result);

        tvIMC = findViewById(R.id.imc);
        String peso = getIntent().getStringExtra("peso");
        String estatura = getIntent().getStringExtra("estatura");
        float weight = Float.parseFloat(peso);
        float height = Float.parseFloat(estatura);
        float imc;
        imc = weight / (height * height);

        if (imc < 18.5){
            tvIMC.setText("Composición corporal: Peso inferior al normal (menos de 18.5)" + "\nResultado: "+ imc);
        }
        if (imc >= 18.5 && imc <= 24.9){
            tvIMC.setText("Composión corporal: Normal (entre 18.5 y 24.9)" + "\nResultado: " + imc);
        }
        if (imc >= 25 && imc <= 29.9){
            tvIMC.setText("Composición corporal: Peso superior al normal (entre 25 y 29.9)" + "\nResultado: " + imc);
        }
        if (imc >= 30){
            tvIMC.setText("Composición corporal: Obesidad (más de 30)" + "\nResultado: " + imc);
        }
    }

    public void btnBack(View v){
        startActivity(new Intent(IMC_Result.this, MainActivity.class));
    }
}