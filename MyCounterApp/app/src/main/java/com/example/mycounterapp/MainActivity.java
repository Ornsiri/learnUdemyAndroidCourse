/*
 * Copyright (c) 2023.
 * Created On : 12/15/23, 2:09 PM
 * Originally Created By : Ornsiripim Kasiprong
 */

package com.example.mycounterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView counter_text;
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        counter_text = findViewById(R.id.textView);

//        Adding functionalities
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_text.setText("" + addCounter());

            }
        });

    }

    public int addCounter() {
        return ++counter;

    }
}