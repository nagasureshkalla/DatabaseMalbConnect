package com.example.admin.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.admin.database.adapter.Adapter;
import com.example.admin.database.model.Data;
import com.example.admin.database.rest.ApiClient;
import com.example.admin.database.rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    // TODO - insert your themoviedb.org API KEY here
    private final static String API_KEY = "FMibbCik-KXxI0-l8EQtCcqf6fHm2kct";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY", Toast.LENGTH_LONG).show();
            return;
        }

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<Data> call = apiService.getId(API_KEY);
        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data>call, Response<Data> response) {
                List<Data> id = response.body().getId();
                recyclerView.setAdapter(new Adapter(id, R.layout.list_item_movie, getApplicationContext()));
                Toast.makeText(MainActivity.this, "Succesfully Loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                // Log error here since request failed
                Toast.makeText(MainActivity.this, "Failed to Load data", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

