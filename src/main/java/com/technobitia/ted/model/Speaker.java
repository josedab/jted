package com.technobitia.ted.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("speaker")
@JsonIgnoreProperties
public class Speaker {
    
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    private int id;
    private String title;
    
    @JsonProperty("firstname")
    private String firstName;
    
    @JsonProperty("middleinitial")
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
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=DATE_FORMAT)
    private Date publishedAt;
    
    @JsonProperty("updated_at")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=DATE_FORMAT)
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
