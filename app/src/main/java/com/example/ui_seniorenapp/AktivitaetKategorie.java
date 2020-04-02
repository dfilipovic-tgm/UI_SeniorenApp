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


     Button buttonBewegung = (Button) findViewById(R.id.buttonBewegungKat);
    Button buttonMusik = (Button) findViewById(R.id.buttonMusikKat);
    Button buttonSpiel = (Button) findViewById(R.id.buttonSpielKat);
    Button buttonBildung = (Button) findViewById(R.id.buttonLernenKat);

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