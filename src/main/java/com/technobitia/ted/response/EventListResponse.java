package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Event;

@JsonIgnoreProperties
public final class EventListResponse extends AbstractCountListResponse {

    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

}
