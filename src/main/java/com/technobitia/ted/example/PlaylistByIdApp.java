package com.technobitia.ted.example;

import com.technobitia.ted.client.TedClient;
import com.technobitia.ted.model.Playlist;

public class PlaylistByIdApp {

    public static void main(String[] args) {
        String apiKey = "INSERT_KEY_HERE";
        TedClient tedClient = new TedClient(apiKey);
        Playlist playlist = tedClient.getPlaylistById(171);
        System.out.println(playlist);
    }

}
