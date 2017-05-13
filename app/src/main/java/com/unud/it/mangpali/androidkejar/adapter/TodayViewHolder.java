package com.unud.it.mangpali.androidkejar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.unud.it.mangpali.androidkejar.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mangpali on 5/13/2017.
 */

public class TodayViewHolder extends RecyclerView.ViewHolder{
    @BindView(R.id.imgToday)ImageView imgToday;
    @BindView(R.id.tv_today)TextView today;
    @BindView(R.id.tv_weatherToday)TextView weathertoday;
    @BindView(R.id.tv_minTempToday)TextView minTemptoday;
    @BindView(R.id.tv_maxTempToday)TextView maxTemptoday;


    public TodayViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}
