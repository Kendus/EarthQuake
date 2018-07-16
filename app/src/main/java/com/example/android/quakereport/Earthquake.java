package com.example.android.quakereport;

public class Earthquake {

    private String magnitude;
    private String location;
    private long date;

    public Earthquake(String mag, String local, long dat){
        this.magnitude = mag;
        this.location = local;
        this.date = dat;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public Long getDate() {
        return date;
    }

    public void setMagnitude(String mag){
        magnitude = mag;
    }

    public void setLocation(String local){
        location = local;
    }

    public void setDate(long dat){
        date = dat;
    }
}
