package cnu.lecture;

import java.io.IOException;

public interface InGameSummonerQuerierInterface {

	String queryGameKey(String summonerName) throws IOException;

}