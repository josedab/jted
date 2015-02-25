package com.technobitia.ted.client;

import static com.google.common.base.Preconditions.checkArgument;

import com.technobitia.ted.response.TalkListResponse;

public class TedClient {

    public TalkListResponse getTalkListByPlaylistId(int playlistId) {
        checkArgument(playlistId > 0, "Playlist Id should be possitive");

        TalkListResponse talkListResponse = null;

        return talkListResponse;
    }
}
