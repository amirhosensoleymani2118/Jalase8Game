package com.example.amirhosein.jalase8game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Hard extends AppCompatActivity {

    int key2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard);
        Random Rnd = new Random();
        key2 = Rnd.nextInt(1000);
        Button btn2 = (Button) findViewById(R.id.hardbtn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText txt2 = (EditText) findViewById(R.id.hardtxt);
                String userhard = txt2.getText().toString();
                if (!userhard.equals("")){
                    int input3 = Integer.parseInt(userhard);
                    if (input3 == key2){
                        Toast.makeText(Hard.this, "oh you're very smart", Toast.LENGTH_SHORT).show();
                    }else if (input3 < key2){
                        Toast.makeText(Hard.this, "oh i know very hard but,Go Higher", Toast.LENGTH_SHORT).show();
                    }else if (input3 > key2){
                        Toast.makeText(Hard.this, "i know,i know that is hard but,come down more", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(Hard.this, "oh,Way not entered number?", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
