package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import it.univpm.ProgettoOOP.database.DatabaseClass;
import it.univpm.ProgettoOOP.service.JSONParse;
import it.univpm.ProgettoOOP.model.Tweet;

@Service
public class TweetServiceImpl implements TweetService{

	private Map<String, Tweet> timeline=new HashMap<>();
	
	public TweetServiceImpl(){
		super();
		try {
			ArrayList<Tweet> tmln = JSONParse.ParseInformazioni();
			for(int i=0; i<tmln.size(); i++) {
			Tweet tmln1 = tmln.get(i);
			timeline.put(tmln1.Visualizza(),tmln1);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public Collection<Tweet> getTweet() {
		return timeline.values();
	}
}
