package com.example.amirhosein.jalase8game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PlayGameRandom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game_random);
        Button hard1 = (Button) findViewById(R.id.hard);
        hard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(PlayGameRandom.this, Hard.class);
                startActivity(intent3);
            }
        });

        Button normal1 = (Button) findViewById(R.id.normal2);
        normal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(PlayGameRandom.this, Normal.class);
                startActivity(intent2);
            }
        });
        Button esey1 = (Button) findViewById(R.id.esey);
        esey1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PlayGameRandom.this, Esey.class);
                startActivity(intent);
            }
        });
        Intent myintent2 = getIntent();
        String myname = myintent2.getStringExtra("nameplay");
        Toast.makeText(PlayGameRandom.this, "Hello " + myname, Toast.LENGTH_SHORT).show();
    }
}
