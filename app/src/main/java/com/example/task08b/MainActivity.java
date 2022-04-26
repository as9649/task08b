package com.example.task08b;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Button btn; Switch sw; View v1; RadioButton rB1,rB2,rB3,rB4; RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        sw=findViewById(R.id.sw);
        v1=findViewById(R.id.background);
        rB1=findViewById(R.id.rB1);
        rB2=findViewById(R.id.rB2);
        rB3=findViewById(R.id.rB3);
        rB4=findViewById(R.id.rB4);
        rg=findViewById(R.id.rg);
    }
    public void go(View view){
        if (sw.isChecked()){
            if (rB1.isChecked())
                v1.setBackgroundColor(Color.YELLOW);
            else if (rB2.isChecked())
                v1.setBackgroundColor(Color.RED);
            else if (rB3.isChecked())
                v1.setBackgroundColor(Color.BLUE);
            else
                v1.setBackgroundColor(Color.GREEN);
        }
        else{
            if (rB1.isChecked())
                rg.setBackgroundColor(Color.YELLOW);
            else if (rB2.isChecked())
                rg.setBackgroundColor(Color.RED);
            else if (rB3.isChecked())
                rg.setBackgroundColor(Color.BLUE);
            else
                rg.setBackgroundColor(Color.GREEN);
        }
    }
}