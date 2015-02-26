package com.technobitia.ted.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Rating {

    @JsonProperty("ratingid")
    private int ratingId;

    private int rating;

    @JsonProperty("talkid")
    private int talkId;

    @JsonProperty("ratingwordid")
    private int ratingWordId;

    private String name;

    public int getRatingId() {
        return ratingId;
    }

    public int getRating() {
        return rating;
    }

    public int getTalkId() {
        return talkId;
    }

    public int getRatingWordId() {
        return ratingWordId;
    }

    public String getName() {
        return name;
    }

}
