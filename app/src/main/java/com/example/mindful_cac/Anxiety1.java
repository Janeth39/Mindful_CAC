package com.example.mindful_cac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anxiety1 extends AppCompatActivity {
    private Button homeBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxiety1);
        homeBtn = (Button) findViewById(R.id.home);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityH();
            }
        });
    }
    public void openActivityH()
    {
        Intent intent = new Intent(this, homeScrn.class);
        startActivity(intent);
    }
}