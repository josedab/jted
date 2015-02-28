package com.technobitia.ted.example;

import java.util.List;

import com.technobitia.ted.client.TedClient;
import com.technobitia.ted.model.Playlist;
import com.technobitia.ted.response.PlaylistListResponse;

public class PlaylistExtractorApp {

    public static void main(String[] args) {
        String apiKey = "INSERT_API_KEY_HERE";
        TedClient tedClient = new TedClient(apiKey);
        PlaylistListResponse playlistResponse = tedClient.getPlaylists();
        List<Playlist> playlists = playlistResponse.getPlaylists();
        System.out.println(playlists);
    }

}
