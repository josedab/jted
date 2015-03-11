package com.technobitia.ted.example;

import com.technobitia.ted.client.TedClient;
import com.technobitia.ted.model.Speaker;

public class SpeakerByIdApp {

    private static final int ALGORE_SPEAKER_ID = 2;
    
    public static void main(String[] args) {
        String apiKey = "INSERT_KEY_HERE";
        TedClient tedClient = new TedClient(apiKey);
        Speaker speaker = tedClient.getSpeakerById(ALGORE_SPEAKER_ID);
        System.out.println(speaker);
    }

}
