package com.spoj.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resta extends AppCompatActivity {
    EditText edNum1,edNum2;
    TextView tvTResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        edNum1=findViewById(R.id.txtnum4);
        edNum2=findViewById(R.id.txtnum5);
        tvTResult=findViewById(R.id.txtresultado3);
    }
    public void calcularResta(View v){
        double num1=Double.parseDouble(edNum1.getText().toString());
        double num2=Double.parseDouble(edNum2.getText().toString());
        double resultado=num1-num2;
        tvTResult.setText(resultado+"");
    }
}