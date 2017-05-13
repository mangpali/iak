package com.unud.it.mangpali.androidkejar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.unud.it.mangpali.androidkejar.R;
import com.unud.it.mangpali.androidkejar.model.DummyForecast;
import com.unud.it.mangpali.androidkejar.model.WeatherItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mangpali on 5/7/2017.
 */

public class ListForecastAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<WeatherItem>list = new ArrayList<>();

    public ListForecastAdapter(List<WeatherItem> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ForecastItemViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.row_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ForecastItemViewHolder)holder).bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
