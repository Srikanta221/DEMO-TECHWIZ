package com.sample.kanta.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main23Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        Button data;
        data = (Button) findViewById(R.id.w1);
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main23Activity.this, Main25Activity.class);
                startActivity(i);
            }
        });
        Button Prog;
        Prog = (Button) findViewById(R.id.w2);
        Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main23Activity.this, Main25Activity.class);
                startActivity(i);
            }
        });
        Button others;
        others = (Button) findViewById(R.id.w3);
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main23Activity.this, Main24Activity.class);
                startActivity(i);
            }
        });

    }
}
