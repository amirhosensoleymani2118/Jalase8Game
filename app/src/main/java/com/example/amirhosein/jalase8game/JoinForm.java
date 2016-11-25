package com.example.amirhosein.jalase8game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class JoinForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_form);
        Button play = (Button) findViewById(R.id.gameplay);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText namejoin1 = (EditText) findViewById(R.id.namejoin);

                String name1 = namejoin1.getText().toString();
                if (!name1.equals("")){
                    Intent myintent = new Intent(JoinForm.this, PlayGameRandom.class);
                    myintent.putExtra("nameplay",name1);
                    startActivity(myintent);

                }else{
                    Toast.makeText(JoinForm.this, "Please Enter your name", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}
