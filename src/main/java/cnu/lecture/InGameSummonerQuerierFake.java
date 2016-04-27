package cnu.lecture;

import java.io.IOException;

public class InGameSummonerQuerierFake implements InGameSummonerQuerierInterface{

	@Override
	public String queryGameKey(String summonerName) throws IOException {
		return "4/bl4DC8HBir8w7bGHq6hvuHluBd+3xM";
	}

}
