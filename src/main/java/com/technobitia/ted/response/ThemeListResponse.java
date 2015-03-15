package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Theme;

@JsonIgnoreProperties
public final class ThemeListResponse extends AbstractCountListResponse {

    private List<Theme> themes;

    public List<Theme> getThemes() {
        return themes;
    }

}
