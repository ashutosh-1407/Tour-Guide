package com.example.android.tourguide;

import android.hardware.camera2.CameraManager;

public class AttractionItem {

    private int mPlaceName;
    private int mPlaceImageId;
    private int mPlaceLocation;
    private int mPlaceDescription;
    private double mLatitude;
    private double mLongitude;

    public AttractionItem(int PlaceName, int PlaceImageId, int PlaceLocation, int PlaceDescription, double Latitude, double Longitude) {
        mPlaceName = PlaceName;
        mPlaceImageId = PlaceImageId;
        mPlaceLocation = PlaceLocation;
        mPlaceDescription = PlaceDescription;
        mLatitude = Latitude;
        mLongitude = Longitude;
    }

    public int getPlaceName() { return mPlaceName; }

    public int getPlaceImageId() { return mPlaceImageId; }

    public int getPlaceLocation() { return mPlaceLocation; }

    public int getPlaceDescription() { return mPlaceDescription; }

    public double getLatitude() { return mLatitude; }

    public double getLongitude() { return mLongitude; }

}
