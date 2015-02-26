package com.technobitia.ted.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.technobitia.ted.model.Count;

public class AbstractCountListResponse {

    @JsonProperty("counts")
    protected Count countInformation;

    public Count getCountInformation() {
        return countInformation;
    }
}
