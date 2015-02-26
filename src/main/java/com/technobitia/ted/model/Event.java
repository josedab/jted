package com.technobitia.ted.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Event {

    private int id;
    private String name;
    private String description;

    @JsonProperty("header_text")
    private String headerText;

    private String slug;
    private String url;

    @JsonProperty("starts_at")
    private Date startsAt;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getHeaderText() {
        return headerText;
    }

    public String getSlug() {
        return slug;
    }

    public String getUrl() {
        return url;
    }

    public Date getStartsAt() {
        return startsAt;
    }

}
