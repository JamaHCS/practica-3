package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MultiplicationTable extends AppCompatActivity {

    private EditText etNumero;
    private EditText etLimite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication_table);

        etNumero = findViewById(R.id.numero);
        etLimite = findViewById(R.id.limite);
    }

    public void btnResultado(View v){
        Intent i = new Intent(MultiplicationTable.this, TableResult.class);
        i.putExtra("numero", etNumero.getText().toString());
        i.putExtra("limite", etLimite.getText().toString());
        startActivity(i);
    }
}