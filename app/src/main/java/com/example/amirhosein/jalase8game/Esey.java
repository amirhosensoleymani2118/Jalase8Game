package com.example.amirhosein.jalase8game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class Esey extends AppCompatActivity {

    int key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esey);
        Random Rnd = new Random();
        key = Rnd.nextInt(99);
        Button buttonesey = (Button) findViewById(R.id.Buttonesey);
        buttonesey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editTextesey = (EditText) findViewById(R.id.EditTextesey);
                String useresey = editTextesey.getText().toString();
                if (!useresey.equals("")){
                    int input = Integer.parseInt(useresey);
                    if (input == key){
                        Toast.makeText(Esey.this, "Excellent,Guess was correct", Toast.LENGTH_LONG).show();
                        editTextesey.setVisibility(View.GONE);
                    }else if (input < key ){
                        Toast.makeText(Esey.this, "Do not joke with me,Go Higher", Toast.LENGTH_LONG).show();
                    }else if (input > key){
                        Toast.makeText(Esey.this, "OHHH God,Do not you tell serious,come down more", Toast.LENGTH_LONG).show();
                    }

                }else{
                    Toast.makeText(Esey.this, "oh,Way not entered number? ", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
