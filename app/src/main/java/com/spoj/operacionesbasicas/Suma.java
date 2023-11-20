package com.spoj.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Suma extends AppCompatActivity {
    EditText edNum1,edNum2;
    TextView tvTResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        edNum1=findViewById(R.id.txtnum);
        edNum2=findViewById(R.id.txtnum3);
        tvTResult=findViewById(R.id.txtresultado2);
    }
    public void calcularSuma(View v){
        double num1=Double.parseDouble(edNum1.getText().toString());
        double num2=Double.parseDouble(edNum2.getText().toString());
        double resultado=num1+num2;
        tvTResult.setText(resultado+"");
    }
}