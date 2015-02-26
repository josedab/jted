package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Rating;

@JsonIgnoreProperties
public final class RatingListResponse extends AbstractCountListResponse {

    private List<Rating> ratings;

    public List<Rating> getRatings() {
        return ratings;
    }

}
