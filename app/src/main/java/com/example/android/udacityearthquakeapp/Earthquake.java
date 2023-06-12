package com.example.android.udacityearthquakeapp;

public class Earthquake {
    private Double mMagnitude;
    private String mLocation;
//    private String mDate;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    /** Website URL of the earthquake */
    private String mUrl;

    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String Url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = Url;
    }

    public Double getmMagnitude(){return mMagnitude;}
    public String getmLocation(){return mLocation;}
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getmUrl(){
        return mUrl;
    }
}
