package com.tutorial.firstbelajarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView iconPicture;
    ImageView blue;
    TextView contine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // menargetkan component pada XML
        iconPicture = findViewById(R.id.iconPicture);
        blue = findViewById(R.id.blue);
        contine = findViewById(R.id.contine);
        contine.setText("by Continue");

        // merubah warna
        iconPicture.setBackgroundColor(Color.parseColor("#e74c3c"));
        blue.setBackgroundColor(Color.parseColor("#FF3700B3"));
    }
}