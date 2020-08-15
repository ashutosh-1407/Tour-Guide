package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TourismAttractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_layout);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new TourismAttractionFragment()).commit();
    }
}