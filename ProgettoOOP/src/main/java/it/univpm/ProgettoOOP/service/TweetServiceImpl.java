package it.univpm.ProgettoOOP.service;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import it.univpm.ProgettoOOP.model.Timeline;
import it.univpm.ProgettoOOP.model.Tweet;

@Service
public class TweetServiceImpl implements TweetService{

	private static Map<Integer, Tweet> timeline=new HashMap<>();
	
	@Override
	public Collection<Tweet> getTweet() {
		// TODO Auto-generated method stub
		return timeline.values();
	}
}
