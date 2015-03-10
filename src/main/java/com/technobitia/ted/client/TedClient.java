package com.technobitia.ted.client;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.technobitia.ted.model.Playlist;
import com.technobitia.ted.response.PlaylistListResponse;
import com.technobitia.ted.response.TalkListResponse;

public class TedClient {
    private static final String TED_TALKS_API_BASE = "https://api.ted.com";
    private static final String TED_API_VERSION = "v1";
    
    private static final String PLAYLISTS_ENDPOINT = "playlists";
    
    private Client restClient;
    private WebTarget baseTargetApi;
    private String apiKey;
    
    public TedClient(String apiKey) {
        checkNotNull(apiKey);
        
        JacksonJsonProvider jacksonProvider = 
        		new JacksonJsonProvider()
					    .configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        
        restClient = ClientBuilder.newClient().register(jacksonProvider);
        baseTargetApi = restClient.target(TED_TALKS_API_BASE)
                                  .path(TED_API_VERSION);
        this.apiKey = apiKey; 
    }

    public TalkListResponse getTalkListByPlaylistId(int playlistId) {
        checkArgument(playlistId > 0, "Playlist Id should be possitive");

        WebTarget endpointTarget =
                baseTargetApi.path(PLAYLISTS_ENDPOINT)
                     .path(String.valueOf(playlistId))
                     .path("talks.json")
                     .queryParam("api-key", apiKey);
        TalkListResponse talkListResponse = endpointTarget.request().get(TalkListResponse.class);
        return talkListResponse;
    }
    
    public PlaylistListResponse getPlaylists() {

        WebTarget endpointTarget =
                baseTargetApi
                     .path("playlists.json")
                     .queryParam("api-key", apiKey);
        PlaylistListResponse playlistListResponse = endpointTarget.request().get(PlaylistListResponse.class);
        return playlistListResponse;
    }
    
    public Playlist getPlaylistById(int id) {

        WebTarget endpointTarget =
                baseTargetApi
                     .path(PLAYLISTS_ENDPOINT)
                     .path(String.valueOf(id) + ".json")
                     .queryParam("api-key", apiKey);
        Playlist playlist = endpointTarget.request().get(Playlist.class);
        return playlist;
    }
}
