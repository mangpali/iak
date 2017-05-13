package com.unud.it.mangpali.androidkejar.model;

/**
 * Created by Mangpali on 5/13/2017.
 */

public class Temp {
    private double min;
    private double max;

    public Temp(double min, double max) {
        this.min = min;
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public String getResolvedTemp(double temp){
        int result = (int)temp;
        return result+"\u00b0";
    }
}

