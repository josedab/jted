package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Language;

@JsonIgnoreProperties
public final class LanguageListResponse extends AbstractCountListResponse {

    private List<Language> languages;

    public List<Language> getLanguages() {
        return languages;
    }

}
