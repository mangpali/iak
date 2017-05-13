package com.unud.it.mangpali.androidkejar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.unud.it.mangpali.androidkejar.R;
import com.unud.it.mangpali.androidkejar.model.DummyForecast;
import com.unud.it.mangpali.androidkejar.model.WeatherItem;
import com.unud.it.mangpali.androidkejar.utilities.Utils;


import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mangpali on 5/7/2017.
 */

public class ForecastItemViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.img_weather)ImageView img;
    @BindView(R.id.tv_day)TextView day;
    @BindView(R.id.tv_weather)TextView weather;
    @BindView(R.id.tv_maxTemp)TextView maxtemp;
    @BindView(R.id.tv_minTemp)TextView mintemp;


    public ForecastItemViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
    public void bind(WeatherItem data){

        img.setImageResource(Utils.getSmallArtResourceIdForWeatherCondition(data.getWeather().get(0).getId()));

        day.setText(data.getReadableDay());
        weather.setText(data.getWeather().get(0).getMain());
        maxtemp.setText(data.getTemp().getResolvedTemp(data.getTemp().getMax()));
        mintemp.setText(data.getTemp().getResolvedTemp(data.getTemp().getMin()));

    }
}
