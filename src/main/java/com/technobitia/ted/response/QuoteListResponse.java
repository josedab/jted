package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Quote;

@JsonIgnoreProperties
public final class QuoteListResponse extends AbstractCountListResponse {

    private List<Quote> quotes;

    public List<Quote> getQuotes() {
        return quotes;
    }

}
