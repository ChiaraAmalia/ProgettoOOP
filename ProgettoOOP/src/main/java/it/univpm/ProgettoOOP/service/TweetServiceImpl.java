package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import it.univpm.ProgettoOOP.database.DatabaseClass;
import it.univpm.ProgettoOOP.model.Tweet;

@Service
public class TweetServiceImpl implements TweetService{

//	private static Map<Integer, Tweet> timeline=new HashMap<>();
	private Map<String, ArrayList<Tweet>> timeline=new HashMap<>();
/*	private ArrayList<Tweet> timeline = new ArrayList<Tweet>();
	private DatabaseClass data = new DatabaseClass();*/
	
	public TweetServiceImpl(){
		super();
		try {
			ArrayList<Tweet> tmln = JSONParse.ParseInformazioni();
//			timeline = data.ParseInformazioni();
			timeline.put(tmln.toString(),tmln);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public Collection<ArrayList<Tweet>> getTweet() {
//	public ArrayList<Tweet> getTweet() {
		// TODO Auto-generated method stub
		return timeline.values();
//		return this.timeline;
	}
}
