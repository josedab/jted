package com.technobitia.ted.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Quote {

    private int id;
    private int talkId;
    private int speakerId;
    private String slug;
    private String quote;
    private int count;
    private String context;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("updated_at")
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public int getTalkId() {
        return talkId;
    }

    public int getSpeakerId() {
        return speakerId;
    }

    public String getSlug() {
        return slug;
    }

    public String getQuote() {
        return quote;
    }

    public int getCount() {
        return count;
    }

    public String getContext() {
        return context;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

}
