package com.example.mariann.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Mariann on 2016-04-08.
 */
public class EasyActivity extends Activity {

    int counter=0;

    Random random=new Random();
    int number = random.nextInt(10)+1;
    Button btnGuess;
    private EditText editGuess;
    private TextView numberLow;
    private TextView numberHigh;
    private TextView txtLow;
    private TextView txtHigh;
    int vinst;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);

        btnGuess=(Button)findViewById(R.id.btnGuess);


        editGuess=(EditText)findViewById(R.id.numberGuess);
        numberLow=(TextView)findViewById(R.id.numberLow);
        numberHigh=(TextView)findViewById(R.id.numberHigh);
        txtLow= (TextView)findViewById(R.id.textLow);
        txtHigh= (TextView)findViewById(R.id.textHigh);

        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                int guess = Integer.parseInt(editGuess.getText().toString());
                if (guess < number) {
                    if(counter>4){
                        vinst=0;
                        String str=counter+"";
                        String str2=number+"";
                        Intent intent=new Intent(EasyActivity.this,ResultActivity.class);
                        intent.putExtra("counter",str);
                        intent.putExtra("number",str2);
                        intent.putExtra("vinst",vinst);
                        startActivity(intent);
                    }
                    numberLow.setText(editGuess.getText().toString());
                } else if (guess > number) {
                    if(counter>4){
                        vinst=0;
                        String str=counter+"";
                        String str2=number+"";
                        Intent intent=new Intent(EasyActivity.this,ResultActivity.class);
                        intent.putExtra("counter",str);
                        intent.putExtra("number",str2);
                        intent.putExtra("vinst",vinst);
                        startActivity(intent);
                    }
                    numberHigh.setText(editGuess.getText().toString());
                } else if(guess==number) {
                    vinst=1;
                    String str=counter+"";
                    String str2=number+"";
                    Intent intent = new Intent(EasyActivity.this,ResultActivity.class);
                    intent.putExtra("counter",str);
                    intent.putExtra("number",str2);
                    intent.putExtra("vinst",vinst);
                    startActivity(intent);
                }


            }
        });


    }
}