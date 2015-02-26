package com.technobitia.ted.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Talk {
    
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    
    private int id;
    
    @JsonProperty("event_id")
    private int eventId;
    
    private String name;
    private String description;
    private String slug;
    
    @JsonProperty("native_language_code")
    private String nativeLanguageCode;
    
    @JsonProperty("published_at")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=DATE_FORMAT)
    private Date publishedAt;
    
    @JsonProperty("recorded_at")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=DATE_FORMAT)
    private Date recordedAt;
    
    @JsonProperty("updated_at")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=DATE_FORMAT)
    private Date updatedAt;
    
    @JsonProperty("released_at")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=DATE_FORMAT)
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
