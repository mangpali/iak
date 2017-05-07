package com.unud.it.mangpali.androidkejar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.unud.it.mangpali.androidkejar.R;
import com.unud.it.mangpali.androidkejar.model.DummyForecast;


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
    public void bind(DummyForecast data){

        day.setText(data.getDay());
        weather.setText(data.getWeather());
        maxtemp.setText(String.valueOf(data.getMaxTemp()));
        mintemp.setText(String.valueOf(data.getMinTemp()));

    }
}
