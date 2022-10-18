package com.example.mindful_cac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Breathing extends AppCompatActivity {
    private Button homeBtn;
    private Button nextBtn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing);

        homeBtn = (Button) findViewById(R.id.home);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityH();
            }
        });

        nextBtn = (Button) findViewById(R.id.next);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityN();
            }
        });
    }

    public void openActivityH()
    {
        Intent intent = new Intent(this, homeScrn.class);
        startActivity(intent);
    }
    public void openActivityN()
    {
        if(homeScrn.p > 9)
        {

            Intent intent = new Intent(this, Panic1.class);
            startActivity(intent);
        }
        else if(homeScrn.p < 9)
        {

            Intent intent = new Intent(this, Anxiety1.class);
            startActivity(intent);
        }

    }
}