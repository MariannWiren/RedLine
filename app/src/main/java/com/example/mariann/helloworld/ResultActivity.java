package com.example.mariann.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Mariann on 2016-04-08.
 */
public class ResultActivity extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    TextView Textv;
    Button newGuess;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Textv = (TextView)findViewById(R.id.textResult);
        newGuess = (Button)findViewById(R.id.newGuess);

        Intent iin= getIntent();
        Bundle extras = iin.getExtras();
        if(extras != null) {
            int vinst= (int) extras.get("vinst");

            String data = (String) extras.get("counter");
            String numberData= (String) extras.get("number");

            if(vinst==1) {
                Textv.setText("Du gissade " + data + " gånger för att gissa rätt tal som var " + numberData);
            }else if(vinst==0){
                Textv.setText("Inga gissningar kvar! Talet var " + numberData);
            }
        }

        newGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }


    }
