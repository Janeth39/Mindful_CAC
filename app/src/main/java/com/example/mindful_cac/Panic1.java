package com.example.mindful_cac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Panic1 extends AppCompatActivity {
    private int num = 100;
    private int decrement = (int) Math.random() * 10;
    private Button homeBtn;

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

        while(num != 0 || (num-decrement < 0))
        {
            TextView textView = (TextView) findViewById(R.id.count);
            editText.setText(num-decrement + "");
        }
    }

    public void openActivityH()
    {
        Intent intent = new Intent(this, homeScrn.class);
        startActivity(intent);
    }
}