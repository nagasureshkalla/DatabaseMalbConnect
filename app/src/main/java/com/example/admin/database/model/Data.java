package com.example.admin.database.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


public class Data {

    @SerializedName("title")
    private  String title;
    @SerializedName("id")
    private  String id;

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Data(String title,String id) {
        this.title = title;
        this.id=id;
    }

    public String getTitle() {
        return  title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


