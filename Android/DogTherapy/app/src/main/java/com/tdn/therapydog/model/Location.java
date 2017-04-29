package com.tdn.therapydog.model;

/**
 * Created by sabri on 4/29/2017.
 */
public class Location {

    private double lattitude;
    private double longitude;

    public Location(double lattitude, double longitude) {
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
