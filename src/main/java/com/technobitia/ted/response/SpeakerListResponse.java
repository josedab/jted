package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Speaker;

@JsonIgnoreProperties
public final class SpeakerListResponse extends AbstractCountListResponse {

    private List<Speaker> speakers;

    public List<Speaker> getSpeakers() {
        return speakers;
    }

}
