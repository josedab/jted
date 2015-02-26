package com.technobitia.ted.client;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

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
        restClient = ClientBuilder.newClient();
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
}
