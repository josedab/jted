package com.technobitia.ted.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("theme")
@JsonIgnoreProperties
public class Theme {

    private int id;
    private String name;
    private String description;

    @JsonProperty("shortsummary")
    private String shortSummmary;

    @JsonProperty("talksDescription")
    private String talksDescription;

    @JsonProperty("speakersDescription")
    private String speakersDescription;

    private String slug;

    @JsonProperty("is_featured")
    private boolean isFeatured;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getShortSummmary() {
        return shortSummmary;
    }

    public String getTalksDescription() {
        return talksDescription;
    }

    public String getSpeakersDescription() {
        return speakersDescription;
    }

    public String getSlug() {
        return slug;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

}
