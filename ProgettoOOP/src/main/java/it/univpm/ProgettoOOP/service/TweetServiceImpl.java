package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;

import it.univpm.ProgettoOOP.service.JSONParse;
import it.univpm.ProgettoOOP.model.Metadata;
import it.univpm.ProgettoOOP.model.Tweet;

@Service
public class TweetServiceImpl implements TweetService{

	private Map<Long, Tweet> timeline=new HashMap<>();
	private Map<String, Metadata> metadata=new HashMap<>();
	
	public TweetServiceImpl(){
		super();
		try {
			ArrayList<Tweet> tmln = JSONParse.ParseInformazioni();
			for(int i=0; i<tmln.size(); i++) {
			Tweet tmln1 = tmln.get(i);
			timeline.put(tmln1.getId(),tmln1);
			}
			
			ArrayList<Metadata> mt = ArrayMetadata.getArrayMetadata();
			for(int i=0; i<mt.size(); i++) {
			Metadata mt1 = mt.get(i);
			metadata.put(mt1.getAlias(), mt1);
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
	
	@Override
	public Collection<Metadata> getMetada(){
		return metadata.values();
	}
	
}
