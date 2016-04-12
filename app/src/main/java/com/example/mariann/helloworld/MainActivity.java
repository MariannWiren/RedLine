package com.example.mariann.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    Button btnEasy,btnNormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEasy=(Button)findViewById(R.id.btn1);
        btnNormal=(Button)findViewById(R.id.btn2);

        btnEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, EasyActivity.class);
                startActivity(intent);
            }
        });

        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });


    }
}
