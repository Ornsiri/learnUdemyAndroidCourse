package com.example.myluckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView headTxtView, resultTxtView, welcomeTxtView;
    Button shareBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        welcomeTxtView = findViewById(R.id.welcomeResultText);
        headTxtView = findViewById(R.id.headTextview);
        shareBtn = findViewById(R.id.shareResultBtn);
        resultTxtView = findViewById(R.id.resultTextView);



//      Get data from the Main Activity
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        welcomeTxtView.setText("Hey, " + name + "!");

//        Get random number
        int randNum = generateRandomNumber();
        resultTxtView.setText(""+randNum);
        shareBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                shareData(name, randNum);
            }
        });

    }

//    Generate random number
    public int generateRandomNumber() {
        Random random = new Random();
        int upperLimit = 1000;
        int numGen = random.nextInt(upperLimit);
        return numGen;
    }

    public void shareData(String name, int rand) {
        // Implicit Intent
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        i.putExtra(Intent.EXTRA_SUBJECT,name + " got lucky today!");
        i.putExtra(Intent.EXTRA_TEXT,"Choose a platform");

        startActivity(Intent.createChooser(i,"Choose a Platform"));
    }
}