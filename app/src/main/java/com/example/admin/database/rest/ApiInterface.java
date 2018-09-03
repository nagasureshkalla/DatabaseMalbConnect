package com.example.admin.database.rest;


import com.example.admin.database.R;
import com.example.admin.database.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {


    @GET("name")
    Call<Data> getId(@Query("api_key") String apiKey);
}