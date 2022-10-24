package com.example.mindful_cac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeScrn extends AppCompatActivity {
    private Button anxietyBtn;
    private Button panicBtn;
    public static int p = 10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescrn);

        anxietyBtn = (Button) findViewById(R.id.anxietyAttack);
        anxietyBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                p = 10;
                openActivityA();
            }
        });

        panicBtn = (Button) findViewById(R.id.panicAttack);
        panicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                p = 0;
                openActivityA();
            }
        });
    }

    public void openActivityA()
    {
        Intent intent = new Intent(this, Breathing.class);
        startActivity(intent);
    }

}