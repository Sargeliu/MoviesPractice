package com.example.moviespractice;

import com.google.gson.annotations.SerializedName;

public class Poster {

    @SerializedName("url")
    private String url;

    public Poster(String url) {
        url = url;
    }

    public String getUrl() {
        return url;
    }
}
