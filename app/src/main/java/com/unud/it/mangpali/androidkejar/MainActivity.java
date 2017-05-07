package com.unud.it.mangpali.androidkejar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.unud.it.mangpali.androidkejar.adapter.ListForecastAdapter;
import com.unud.it.mangpali.androidkejar.model.DummyForecast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.rv_forecast)RecyclerView recycler;

    private ListForecastAdapter adapter;
    private List<DummyForecast> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setupRecyclerView();
    }

    private void setupRecyclerView(){
        adapter = new ListForecastAdapter(list);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setAdapter(adapter);

        populateData();
    }

    private void populateData(){
        for(int i=0;i<20;i++){
            DummyForecast dummy = new DummyForecast("Sunday","Rainy",23,18,123);
            list.add(dummy);
        }
        adapter.notifyDataSetChanged();
    }
}
