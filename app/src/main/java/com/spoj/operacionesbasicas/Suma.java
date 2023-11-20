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
   
}