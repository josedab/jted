package com.technobitia.ted.response;

import java.util.List;

import jersey.repackaged.com.google.common.collect.Lists;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.technobitia.ted.model.Playlist;
import com.technobitia.ted.model.WrapperPlaylist;

@JsonIgnoreProperties
public final class PlaylistListResponse extends AbstractCountListResponse {

    private List<WrapperPlaylist> playlists;

    public List<Playlist> getPlaylists() {
        List<Playlist> result = Lists.newLinkedList();
        for (WrapperPlaylist wplaylist : playlists) {
            result.add(wplaylist.getPlaylist());
        }
        return result;
    }

}
