package com.example.moviespractice;

import com.google.gson.annotations.SerializedName;

public class Rating {

    @SerializedName("kp")
    private int kp;

    public Rating(int rating) {
        this.kp = rating;
    }

    public int getRating() {
        return kp;
    }
}
