package com.sample.kanta.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Main22Activity extends AppCompatActivity {
    Button car;
    Button paint;
    Button other;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Button car;
        car = (Button) findViewById(R.id.s20);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main22Activity.this, LoginActivity.class);
                startActivity(i);
            }
        });
        Button paint;
        paint = (Button) findViewById(R.id.s21);
        paint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main22Activity.this, Main25Activity.class);
                startActivity(i);
            }
        });
        Button others;
        others = (Button) findViewById(R.id.s22);
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main22Activity.this, Main24Activity.class);
                startActivity(i);
            }
        });



    }


    }

