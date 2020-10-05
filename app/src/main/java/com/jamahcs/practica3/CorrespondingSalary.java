package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CorrespondingSalary extends AppCompatActivity {

    private TextView tvSalario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corresponding_salary);

        tvSalario = findViewById(R.id.salario);
        String horas_trabajadas = getIntent().getStringExtra("horas_trabajadas");
        String costo_hora = getIntent().getStringExtra("costo_hora");
        Float hours_worked = Float.parseFloat(horas_trabajadas);
        Float hour_cost = Float.parseFloat(costo_hora);
        double salary;

        salary =  ((hours_worked * hour_cost * 30)/7) - ((hours_worked * hour_cost * 30 * 0.18)/7);

        tvSalario.setText("La paga que le corresponde por 30 días de trabajo con un impuesto de 18% es de: $" + salary);

    }

    public void btnMenu(View v){
        startActivity(new Intent(CorrespondingSalary.this, MainActivity.class));
    }
}