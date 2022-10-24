package com.example.mindful_cac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
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

//        public void ShowGif(View view) {
//            ImageView imageView = findViewById(R.id.imageView);
//            Glide.with(this).load(R.drawable.breathing).into(imageView);
//        }
        // 
    }

    public void openActivityH()
    {
        Intent intent = new Intent(this, homeScrn.class);
        startActivity(intent);
    }
    public void openActivityN()
    {
        Log.i(null, homeScrn.p + " ");
        if(homeScrn.p == 10)
        {

            Intent intent = new Intent(this, Anxiety1.class);
            startActivity(intent);
        }
        else if(homeScrn.p == 0)
        {

            Intent intent = new Intent(this, Panic1.class);
            startActivity(intent);
        }

    }
}