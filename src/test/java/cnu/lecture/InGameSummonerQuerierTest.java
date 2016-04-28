package cnu.lecture;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mock.*;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.HashMap;

/**
 * Created by tchi on 2016. 4. 25..
 */
public class InGameSummonerQuerierTest {
    private InGameSummonerQuerier querier;

    @Before
    public void setup() {
    	final String apiKey = "8242f154-342d-4b86-9642-dfa78cdb9d9c";
        GameParticipantListener dontCareListener = mock(GameParticipantListener.class);

        querier = new InGameSummonerQuerier(apiKey, dontCareListener);

        querier = mock(InGameSummonerQuerier.class);
    }

    
    @Test
    public void shouldQuerierIdentifyGameKeyWhenSpecificSummonerNameIsGiven() throws Exception {
        final String summonerName;

        GIVEN: {
            summonerName = "heeseong";
            when(querier.queryGameKey(summonerName)).thenReturn("4/bl4DC8HBir8w7bGHq6hvuHluBd+3xM");
        }

        final String actualGameKey;
        WHEN: {
            actualGameKey = querier.queryGameKey(summonerName);
            
        }

        final String expectedGameKey = "4/bl4DC8HBir8w7bGHq6hvuHluBd+3xM";
        THEN: {
            assertThat(actualGameKey, is(expectedGameKey));
        }
    }
    
    
    @Test
    public void shouldQuerierReportMoreThan5Summoners() throws Exception {
        final int actualsummonerNumber;

        GIVEN: {            
            when(querier.queryGamesummonernumber()).thenReturn(10);
        }
        
        WHEN: {
        	actualsummonerNumber = querier.queryGamesummonernumber();
            
        }
        final int expectedSummonernumber = 4;
        THEN: {
            assertTrue(actualsummonerNumber>expectedSummonernumber);
        }
    }

}
