package com.example.android.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodAttractionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_layout);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FoodAttractionFragment()).commit();

    }
}