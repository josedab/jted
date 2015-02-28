package com.technobitia.ted.example;

import java.util.List;

import com.technobitia.ted.client.TedClient;
import com.technobitia.ted.model.Talk;
import com.technobitia.ted.response.TalkListResponse;

public class TalkListByPlaylistApp {

    public static void main(String[] args) {
        String apiKey = "INSERT_API_KEY_HERE";
        TedClient tedClient = new TedClient(apiKey);
        TalkListResponse talkListResponse = tedClient.getTalkListByPlaylistId(171);
        List<Talk> talks = talkListResponse.getTalks();
        System.out.println(talks);
    }

}
