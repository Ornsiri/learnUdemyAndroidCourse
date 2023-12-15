
/*
 * Copyright (c) 2023.
 * Created On : 12/15/23, 11:46 AM
 * Originally Created By : Ornsiripim Kasiprong
 */

package com.example.mygreetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        EditText inputName = findViewById(R.id.inputName);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Hello " + inputName.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}