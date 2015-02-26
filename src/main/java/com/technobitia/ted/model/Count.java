package com.technobitia.ted.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Count {
    
    @JsonProperty("this")
    private int numberOfResultsOnCall;
    
    @JsonProperty("total")
    private int numberOfTotalResults;

    public int getNumberOfResultsOnCall() {
        return numberOfResultsOnCall;
    }

    public int getNumberOfTotalResults() {
        return numberOfTotalResults;
    }

}
