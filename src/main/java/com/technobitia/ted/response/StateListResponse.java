package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.State;

@JsonIgnoreProperties
public final class StateListResponse extends AbstractCountListResponse {

    private List<State> states;

    public List<State> getStates() {
        return states;
    }

}
