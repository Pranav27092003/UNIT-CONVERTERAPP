package com.example.unitconverter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2;
    EditText e1;
    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        e1=findViewById(R.id.e1);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a;
                float p1 = Float.parseFloat(e1.getText().toString());
                a=p1*1000;
                t2.setText("Result = " +a+"G");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a;
                float p1 = Float.parseFloat(e1.getText().toString());
                a=p1/1000;
                t2.setText("Result = " +a+"KG");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a;
                float p1 = Float.parseFloat(e1.getText().toString());
                a=p1*1000;
                t2.setText("Result = " +a+"ML");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a;
                float p1 = Float.parseFloat(e1.getText().toString());
                a=p1/1000;
                t2.setText("Result = " +a+"ML");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a;
                float p1 = Float.parseFloat(e1.getText().toString());
                a=p1*100;
                t2.setText("Result = " +a+"CM");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a;
                float p1 = Float.parseFloat(e1.getText().toString());
                a=p1/100;
                t2.setText("Result = " +a+"M");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a;
                float p1 = Float.parseFloat(e1.getText().toString());
                a=p1/1000;
                t2.setText("Result = " +a+"KM");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a;
                float p1 = Float.parseFloat(e1.getText().toString());
                a=p1*1000;
                t2.setText("Result = " +a+"M");
            }
        });
    }
}