package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Investment extends AppCompatActivity {

    private EditText etCantidadInvertir;
    private EditText etInteresMensual;
    private EditText etNumeroAños;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investment);

        etCantidadInvertir = findViewById(R.id.cantidad_invertir);
        etInteresMensual   = findViewById(R.id.interes_mensual);
        etNumeroAños       = findViewById(R.id.numero_años);
    }

    public void btnCalcularCapital(View v){
        Intent i = new Intent(Investment.this, StockInTrade.class);
        i.putExtra("cantidad_invertir", etCantidadInvertir.getText().toString());
        i.putExtra("interes_mensual", etInteresMensual.getText().toString());
        i.putExtra("numero_años", etNumeroAños.getText().toString());
        startActivity(i);
    }

}