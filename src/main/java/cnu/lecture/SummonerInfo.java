package cnu.lecture;

import lombok.Getter;
import lombok.Setter;


/**
 * Created by tchi on 2016. 4. 25..
 */
public class SummonerInfo {
    @Getter @Setter
    private String id;
    
    @Getter @Setter
    private String name;
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
