package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class PartyAttractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_layout);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PartyAttractionFragment()).commit();
    }
}