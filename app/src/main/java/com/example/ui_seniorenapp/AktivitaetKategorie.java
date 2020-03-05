package com.example.ui_seniorenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AktivitaetKategorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivitaet_kategorie);


    Button buttonBewegung = (Button) findViewById(R.id.buttonBewegung);
    Button buttonMusik = (Button) findViewById(R.id.buttonMusik);
    Button buttonSpiel = (Button) findViewById(R.id.buttonSpiel);
    Button buttonBildung = (Button) findViewById(R.id.buttonBildung);

    buttonBewegung.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick (View v){
        Intent intent = new Intent(AktivitaetKategorie.this, Bewegung.class);
        startActivity(intent);
    }
    });
        buttonMusik.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(AktivitaetKategorie.this, MusikTanz.class);
                startActivity(intent);
            }
        });
        buttonSpiel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(AktivitaetKategorie.this, SpielSpass.class);
                startActivity(intent);
            }
        });
        buttonBildung.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(AktivitaetKategorie.this, BildungLernen.class);
                startActivity(intent);
            }
        });
}
}