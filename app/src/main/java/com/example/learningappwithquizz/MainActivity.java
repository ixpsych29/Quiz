package com.example.learningappwithquizz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1, b2;
    Button a, b, c, d, e, f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.learnBTN);
        b2=(Button) findViewById(R.id.quizBTN);
        a = (Button)findViewById(R.id.Abtn);
        a.setOnClickListener(this);
        b = (Button)findViewById(R.id.Bbtn);
        c = (Button)findViewById(R.id.Cbtn);
        d = (Button)findViewById(R.id.Dbtn);
        e = (Button)findViewById(R.id.Ebtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(MainActivity.this, LearningApp.class);
                startActivity(in1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(MainActivity.this,Quiz.class);
                startActivity(in2);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(MainActivity.this, AlphaA.class);
                startActivity(in1);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(MainActivity.this, AlphaB.class);
                startActivity(in1);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(MainActivity.this, AlphaC.class);
                startActivity(in1);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(MainActivity.this, AlphaD.class);
                startActivity(in1);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(MainActivity.this, AlphaE.class);
                startActivity(in1);
            }
        });
    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        btn.setText("clicked");
//        switch (view.getId())
//        case a

    }
}