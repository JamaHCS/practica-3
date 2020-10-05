package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TriangleArea extends AppCompatActivity {

    private EditText etBase;
    private EditText etAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_area);

        etBase   = findViewById(R.id.base);
        etAltura = findViewById(R.id.altura);

    }

    public void btnCalcular(View v){
        Intent i = new Intent(TriangleArea.this, TriangleResult.class);
        i.putExtra("base", etBase.getText().toString());
        i.putExtra("altura", etAltura.getText().toString());
        startActivity(i);
    }
}