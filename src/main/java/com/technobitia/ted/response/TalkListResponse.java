package com.technobitia.ted.response;

import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Talk;
import com.technobitia.ted.model.WrapperTalk;

@JsonIgnoreProperties
public final class TalkListResponse extends AbstractCountListResponse {
    
    private List<WrapperTalk> talks;

    public List<Talk> getTalks() {
        List<Talk> result = Lists.newLinkedList();
        for (WrapperTalk wtalk : talks) {
            result.add(wtalk.getTalk());
        }
        return result;
    }

}
