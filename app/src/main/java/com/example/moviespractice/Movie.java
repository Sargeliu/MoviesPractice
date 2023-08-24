package com.example.moviespractice;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("id")
    private int id;
    @SerializedName("year")
    private int year;
    @SerializedName("name")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("poster")
    private Poster poster;
    @SerializedName("rating")
    private Rating rating;

    public Movie(int id, int year, String name, String description, Poster poster, Rating rating) {
        this.id = id;
        this.year = year;
        this.name = name;
        this.description = description;
        this.poster = poster;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Poster getPoster() {
        return poster;
    }

    public Rating getRating() {
        return rating;
    }
}
