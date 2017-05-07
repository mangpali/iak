package com.unud.it.mangpali.androidkejar;

import android.app.DownloadManager;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.unud.it.mangpali.androidkejar.adapter.ListForecastAdapter;
import com.unud.it.mangpali.androidkejar.model.DummyForecast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = MainActivity.class.getSimpleName();
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
        getData();
    }

    private void getData(){
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        final String url="http://api.openweathermap.org/data/2.5/forecast/daily?lat=-8.650000&lon=115.216667&cnt=16&appid=1581396d43011345fa1f1bfbf5a22cde&units=metric";

        StringRequest stringRequest = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d(TAG,response);
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        if (error!=null){
                            Log.e(TAG,error.getMessage());
                        }else{
                            Log.e(TAG,"something error happened");
                        }
                    }
                }
        );
        requestQueue.add(stringRequest);
    }
}
