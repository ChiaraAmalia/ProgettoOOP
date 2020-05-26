package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import it.univpm.ProgettoOOP.model.Timeline;
import it.univpm.ProgettoOOP.model.Tweet;

public class JsonParser {
	
	public static void ParseJson(JSONObject json) throws Exception {
		
		if(json != null) {
				try {
					JSONArray dataset = (JSONArray) json.get("timeline");
					 int length =  (int) dataset.size();
					if(dataset != null) {
						Timeline timeline = new Timeline();
							for(int i=0; i<length; i++) {
								try {
								JSONObject tweet = (JSONObject) dataset.get(i);
								
								Tweet tw = new Tweet();
								
								tw.setDataOra((String) tweet.get("created_at"));
								tw.setIdTweet((int) tweet.get("id"));
								tw.setTesto((String)tweet.get("full_text"));
//								tw.setEntities();
								}catch(Exception e){
									throw new Exception("Error in creation object tweet");
								}
						}
					}
				}catch (SecurityException e) {
					 throw new Exception("Error in parsing I/O operation");
				}

		}
	}
}

