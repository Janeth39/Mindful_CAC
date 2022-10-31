package com.example.mindful_cac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;


public class Panic1 extends AppCompatActivity {
    private int num = 100;
    private int decrement = 5;
    private Button homeBtn;
    private Button startBtn;
    private TextView CDText;

    private CountDownTimer countDownTimer;
    private long time = 100000;
    private boolean timerrunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panic1);

        homeBtn = (Button) findViewById(R.id.home);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityH();
            }
        });


        TextView editText = (TextView) findViewById(R.id.countingInfo);
        editText.setText("Starting at 100 count down in decrements of " + decrement);


        startBtn = (Button) findViewById(R.id.startBtn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 100; i >= 0; i = i - 5) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Log.i(null, i + "");
                    TextView countTV = (TextView) findViewById(R.id.count);
                    countTV.setText(" " + i);

                }
            }
        });

    }

    public void openActivityH() {
        Intent intent = new Intent(this, homeScrn.class);
        startActivity(intent);
    }
}
