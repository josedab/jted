package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Talk;

@JsonIgnoreProperties
public final class TalkListResponse extends AbstractCountListResponse {

	private List<Talk> talks;

	public List<Talk> getTalks() {
		return talks;
	}

}
