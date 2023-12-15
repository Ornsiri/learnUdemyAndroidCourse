package com.example.myconvetorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText inputWeight;
    Button btn;

    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputWeight = findViewById(R.id.editTextWeight);
        btn = findViewById(R.id.button);
        resultText = findViewById(R.id.textViewResult);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double kg = Double.parseDouble(inputWeight.getText().toString());
                double pound = kgToPound(kg);
                resultText.setText("" + pound);
            }
        });

    }

    public double kgToPound(double kg) {
        return kg * 2.20462;
    }
}