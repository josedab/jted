package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.technobitia.ted.model.Event;

@JsonIgnoreProperties
public final class RatingWordListResponse extends AbstractCountListResponse {

    @JsonProperty("rating_words")
    private List<Event> ratingWords;

    public List<Event> getRatingWords() {
        return ratingWords;
    }

}
