package com.example.myluckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textWelcome);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.inputName);


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();

                // Explicit intent
                Intent i = new Intent(
                        getApplicationContext(),
                        SecondActivity.class);

                // Passing data to the second activity

                i.putExtra("name",name);

                startActivity(i);
            }
        });
    }
}