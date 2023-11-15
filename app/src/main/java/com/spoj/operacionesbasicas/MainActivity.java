package com.spoj.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edNum1,edNum2;
    TextView tvTResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNum1=findViewById(R.id.txtnum1);
        edNum2=findViewById(R.id.txtnum2);
        tvTResult=findViewById(R.id.txtresultado);
    }
    public void calcularSuma(View v){
        double num1=Double.parseDouble(edNum1.getText().toString());
        int num2=Integer.parseInt(edNum2.getText().toString());
        double resultado=num1+num2;
        tvTResult.setText(resultado+"");
    }
}