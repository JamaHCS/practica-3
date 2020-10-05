package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StockInTrade extends AppCompatActivity {

    private TextView tvCapital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_in_trade);

        tvCapital = findViewById(R.id.capital);
        String capital_invertir = getIntent().getStringExtra("cantidad_invertir");
        String interes_mensual = getIntent().getStringExtra("interes_mensual");
        String numero_años = getIntent().getStringExtra("numero_años");
        Float capital_inversion = Float.parseFloat(capital_invertir);
        Float monthly_interes = Float.parseFloat(interes_mensual);
        int years = Integer.parseInt(numero_años);

        for (int i = 0; i < (years * 12); i++){
            capital_inversion += capital_inversion * (1 + monthly_interes);
        }
        tvCapital.setText("Capital obtenido en la inversión: $" + capital_inversion);
    }

    public void btnBackMenu(View v){
        startActivity(new Intent(StockInTrade.this, MainActivity.class));
    }
}