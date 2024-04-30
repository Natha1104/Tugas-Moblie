package com.example.latihan_2201020086;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Latihan6a extends AppCompatActivity {
    Button button3;
    Button button4;
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan6a);

        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                switchActivity();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivity();
            }
        });
        button5.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switchActivity();
            }
        }));

    }
    private void switchActivity() {
        Intent intent3a = new Intent(this, Latihan_Activity.class);
        startActivity(intent3a);

    }
}