package com.example.admin.database.rest;


import com.example.admin.database.model.Data;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiInterface {


    @GET("collections/name/")
    Call<List<Data>> getData(@Query("apiKey") String apiKey);
}