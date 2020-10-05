package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TableResult extends AppCompatActivity {

    private TextView tvTabla;
    private TextView tvTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_result);

        tvTabla  = findViewById(R.id.tabla);
        tvTitulo = findViewById(R.id.titulo);
        String numero = getIntent().getStringExtra("numero");
        String limite = getIntent().getStringExtra("limite");
        Float number = Float.parseFloat(numero);
        Float limit = Float.parseFloat(limite);
        Float result;
        String tabla = "";

        for (int i = 0; i <= limit; i++) {
            result = number * i;
            tabla += number + " * " + i + " = " + result + "\n";
            tvTabla.setText(tabla);
        }
        tvTitulo.setText("TABLA DEL " + numero);
    }

    public void btnMenu(View v){
        startActivity(new Intent(TableResult.this, MainActivity.class));
    }
}