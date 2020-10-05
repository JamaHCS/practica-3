package com.jamahcs.practica3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnAreaTriangulo(View v){
        startActivity(new Intent(MainActivity.this, TriangleArea.class));
    }

    public void btnTablaMultiplicar(View v){
        startActivity(new Intent(MainActivity.this, MultiplicationTable.class));
    }

    public void btnSueldoCorrespondiente(View v){
        startActivity(new Intent(MainActivity.this, HoursWorked.class));
    }

    public void btnInversion(View v){
        startActivity(new Intent(MainActivity.this, Investment.class));
    }

    public void btnIMC(View v){
        startActivity(new Intent(MainActivity.this, IMC.class));
    }
}