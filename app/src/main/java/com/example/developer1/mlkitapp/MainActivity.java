package com.example.developer1.mlkitapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button reco;
    Button map;
    Button barco;
    Button landm;
    Button facere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reco = (Button)findViewById(R.id.reco);


        reco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recog = new Intent(getApplicationContext(),RecActivity.class);
                startActivity(recog);
            }


        });



    }
}
