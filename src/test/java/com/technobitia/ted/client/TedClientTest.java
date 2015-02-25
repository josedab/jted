package com.technobitia.ted.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TedClientTest {

    private static int INVALID_ID = -1;

    @InjectMocks
    private TedClient tedClient;

    @Test(expected = IllegalArgumentException.class)
    public void whenRequestingTalksByPlaylistId_givenNegativeId_thenThrowIAE() {
        tedClient.getTalkListByPlaylistId(INVALID_ID);
    }
}
