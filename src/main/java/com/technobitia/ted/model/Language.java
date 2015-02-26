package com.technobitia.ted.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Language {

    @JsonProperty("language_code")
    private String languageCode;

    private String name;
    private String description;

    @JsonProperty("is_rtl")
    private String isRtl;

    @JsonProperty("iso_639_1")
    private String iso639Part1;

    @JsonProperty("iso_639_3")
    private String iso639Part3;

    @JsonProperty("hostname_prefix")
    private String hostnamePrefix;

    public String getLanguageCode() {
        return languageCode;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getIsRtl() {
        return isRtl;
    }

    public String getIso639Part1() {
        return iso639Part1;
    }

    public String getIso639Part3() {
        return iso639Part3;
    }

    public String getHostnamePrefix() {
        return hostnamePrefix;
    }

}
