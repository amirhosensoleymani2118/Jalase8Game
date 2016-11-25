package com.example.amirhosein.jalase8game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Normal extends AppCompatActivity {

    int key1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        Random Rnd = new Random();
        key1 = Rnd.nextInt(555);
        Button btn = (Button) findViewById(R.id.normalbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txt = (EditText) findViewById(R.id.normaltxt);
                String usernormal = txt.getText().toString();
                if (!usernormal.equals("")){
                    int input1 = Integer.parseInt(usernormal);
                    if (input1 == key1){
                        Toast.makeText(Normal.this, "Excellent,Guess was correct", Toast.LENGTH_SHORT).show();
                    }else if (input1 < key1 ){
                        Toast.makeText(Normal.this, "Do not joke with me,Go Higher", Toast.LENGTH_SHORT).show();
                    }else if (input1 > key1 ){
                        Toast.makeText(Normal.this, "OHHH God,Do not you tell serious,come down more", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(Normal.this, "oh,Way not entered number?", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
