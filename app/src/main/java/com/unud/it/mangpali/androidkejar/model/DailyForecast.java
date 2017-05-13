package com.unud.it.mangpali.androidkejar.model;

import java.util.List;

/**
 * Created by Mangpali on 5/13/2017.
 */

public class DailyForecast {
    private City city;
    private List<WeatherItem>list;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<WeatherItem> getList() {
        return list;
    }

    public void setList(List<WeatherItem> list) {
        this.list = list;
    }

    public DailyForecast(City city, List<WeatherItem> list) {

        this.city = city;
        this.list = list;
    }

    @Override
    public String toString() {
        return "DailyForecast{" +
                "city=" + city +
                ", list=" + list +
                '}';
    }
}
