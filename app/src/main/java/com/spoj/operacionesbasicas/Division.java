package com.spoj.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Division extends AppCompatActivity {
    EditText edNum1,edNum2;
    TextView tvTResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
        edNum1=findViewById(R.id.txtnum8);
        edNum2=findViewById(R.id.txtnum9);
        tvTResult=findViewById(R.id.txtresultado5);
    }
    public void calcularDivision(View v){
        double num1=Double.parseDouble(edNum1.getText().toString());
        double num2=Double.parseDouble(edNum2.getText().toString());
        if (num2 != 0) {
            double resultado = num1 / num2;
            tvTResult.setText(resultado + "");
        } else {

            tvTResult.setText("Error: División por cero");
        }
    }
}