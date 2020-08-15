package com.example.android.tourguide;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class MyPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MyPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) { return new TourismAttractionFragment(); }
        else if (position == 1){ return new FoodAttractionFragment(); }
        else if (position == 2){ return new PartyAttractionFragment(); }
        else { return new MallAttractionFragment(); }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) { return mContext.getString(R.string.attraction1); }
        else if (position == 1){return mContext.getString(R.string.attraction2); }
        else if (position == 2){return mContext.getString(R.string.attraction3); }
        else { return mContext.getString(R.string.attraction4); }
    }
}
