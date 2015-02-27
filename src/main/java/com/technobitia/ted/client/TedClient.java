package com.technobitia.ted.client;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.technobitia.ted.mapper.TedObjectMapper;
import com.technobitia.ted.response.PlaylistListResponse;
import com.technobitia.ted.response.TalkListResponse;

public class TedClient {
    private static final String TED_TALKS_API_BASE = "https://api.ted.com";
    private static final String TED_API_VERSION = "v1";
    
    private static final String PLAYLISTS_ENDPOINT = "playlists";
    
    private Client restClient;
    private WebTarget baseTargetApi;
    private String apiKey;
    
    private ObjectMapper unwrapObjectMapper = new TedObjectMapper(); 
    
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
//        String jsonData = endpointTarget.request().get(String.class);
//        TalkListResponse talkListResponse = null;
//        try {
//            talkListResponse = unwrapObjectMapper.readValue(jsonData, TalkListResponse.class);
//        } catch (JsonParseException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (JsonMappingException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        
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
}
