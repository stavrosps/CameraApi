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
        map = (Button)findViewById(R.id.map);
        barco = (Button)findViewById(R.id.barco);
        landm = (Button)findViewById(R.id.landm);
        facere = (Button)findViewById(R.id.facere);
        reco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recog = new Intent(getApplicationContext(),RecActivity.class);
                startActivity(recog);
            }


        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iLabel = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(iLabel);
            }
        });

        landm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent landm = new Intent(getApplicationContext(),LandmarkActivity.class);
                startActivity(landm);
            }
        });
        facere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facere = new Intent(getApplicationContext(),LandmarkActivity.class);
                startActivity(facere);
            }
        });

    }
}
