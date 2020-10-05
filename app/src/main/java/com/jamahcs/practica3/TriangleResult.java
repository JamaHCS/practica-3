package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TriangleResult extends AppCompatActivity {

    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_result);

        tvResultado = findViewById(R.id.resultado);
        String base = getIntent().getStringExtra("base");
        String altura = getIntent().getStringExtra("altura");
        Float area;

        area = (Float.parseFloat(base) * Float.parseFloat(altura))/2;

        tvResultado.setText("A = " + area);
    }

    public void btnMenu(View v){
        startActivity(new Intent(TriangleResult.this, MainActivity.class));
    }
}