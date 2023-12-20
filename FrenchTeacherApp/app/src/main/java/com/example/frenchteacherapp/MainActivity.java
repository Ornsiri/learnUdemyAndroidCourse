package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button blackBtn, greenBtn, purpleBtn,redBtn,yellowBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blackBtn = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int btnId = v.getId();

        if (btnId == R.id.blackBtn) {
            playSounds(R.raw.black);
        }
        else if (btnId == R.id.greenBtn) {
            playSounds(R.raw.green);
        }
        else if (btnId == R.id.purpleBtn) {
            playSounds(R.raw.purple);
        }
        else if (btnId == R.id.redBtn) {
            playSounds(R.raw.red);
        }
        else if (btnId == R.id.yellowBtn) {
            playSounds(R.raw.yellow);
        }

    }

    public void playSounds(int id) {
        MediaPlayer mediaPLayer = MediaPlayer.create(
                this,
                id
        );
        mediaPLayer.start();
    }
}