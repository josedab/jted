package com.technobitia.ted.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Speaker {

    private int id;
    private String title;
    
    @JsonProperty("firstname")
    private String firstName;
    
    @JsonProperty("midleinitial")
    private String middleInitial;
    
    @JsonProperty("lastname")
    private String lastName;
    
    private String description;
    
    @JsonProperty("whotheyare")
    private String whoTheyAre;
    
    @JsonProperty("whylisten")
    private String whyListen;
    
    private String slug;
    
    @JsonProperty("published_at")
    private Date publishedAt;
    
    @JsonProperty("updated_at")
    private Date updatedAt;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDescription() {
        return description;
    }

    public String getWhoTheyAre() {
        return whoTheyAre;
    }

    public String getWhyListen() {
        return whyListen;
    }

    public String getSlug() {
        return slug;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

}
