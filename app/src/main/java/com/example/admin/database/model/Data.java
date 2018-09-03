package com.example.admin.database.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Data {
    @SerializedName("id")
    private List<Data> id;
    @SerializedName("title")
    private String title;
    @SerializedName("by")
    private String by;
    @SerializedName("likes")
    private int likes;

    public Data(List<Data> id, String title, String by, int likes) {
        this.id = id;
        this.title = title;
        this.by = by;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Data> getId() {
        return id;
    }

    public void setId(List<Data> id) {
        this.id = id;
    }
}


