package com.technobitia.ted.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Playlist;

@JsonIgnoreProperties
public final class PlaylistListResponse extends AbstractCountListResponse {

    private List<Playlist> playlists;

    public List<Playlist> getPlaylists() {
        return playlists;
    }

}
