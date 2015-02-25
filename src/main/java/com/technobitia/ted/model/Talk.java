package com.technobitia.ted.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Talk {
    
    private int id;
    
    @JsonProperty("event_id")
    private int eventId;
    
    private String name;
    private String description;
    private String slug;
    
    @JsonProperty("native_language_code")
    private String nativeLanguageCode;
    
    @JsonProperty("published_at")
    private Date publishedAt;
    
    @JsonProperty("recorded_at")
    private Date recordedAt;
    
    @JsonProperty("updated_at")
    private Date updatedAt;
    
    @JsonProperty("released_at")
    private Date releasedAt;

    public int getId() {
        return id;
    }

    public int getEventId() {
        return eventId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSlug() {
        return slug;
    }

    public String getNativeLanguageCode() {
        return nativeLanguageCode;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public Date getRecordedAt() {
        return recordedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Date getReleasedAt() {
        return releasedAt;
    }

}
