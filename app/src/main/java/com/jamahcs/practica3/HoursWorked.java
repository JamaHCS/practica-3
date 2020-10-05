package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class HoursWorked extends AppCompatActivity {

    private EditText etHorasTrabajadas;
    private EditText etCostoHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hours_worked);

        etHorasTrabajadas = findViewById(R.id.horas_trabajadas);
        etCostoHora       = findViewById(R.id.costo_hora);
    }

    public void btnSueldo(View v){
        Intent i = new Intent(HoursWorked.this, CorrespondingSalary.class);
        i.putExtra("horas_trabajadas", etHorasTrabajadas.getText().toString());
        i.putExtra("costo_hora", etCostoHora.getText().toString());
        startActivity(i);
    }
}