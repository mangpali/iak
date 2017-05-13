package com.unud.it.mangpali.androidkejar.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Mangpali on 5/13/2017.
 */

public class WeatherItem {
    private Long dt;
    private Temp temp;
    private List<Weathers> weather;

    public WeatherItem(Long dt, Temp temp, List<Weathers> weather) {
        this.dt = dt;
        this.temp = temp;
        this.weather = weather;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public List<Weathers> getWeather() {
        return weather;
    }

    public void setWeather(List<Weathers> weather) {
        this.weather = weather;
    }
    public String getReadableDay(){
        Date date = new Date(dt*1000L);
//        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        DateFormat format = new SimpleDateFormat("EEEE");
        return format.format(date);
    }
}
