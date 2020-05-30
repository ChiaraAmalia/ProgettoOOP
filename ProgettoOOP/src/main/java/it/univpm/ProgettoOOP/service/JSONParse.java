package it.univpm.ProgettoOOP.service;

import java.io.Reader;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import it.univpm.ProgettoOOP.database.DatabaseClass;
import it.univpm.ProgettoOOP.model.Tweet;

public class JSONParse {
	
	public static  ArrayList<Tweet> ParseInformazioni(){
//		public static JSONArray ParseInformazioni(){
//		public static JSONObject ParseInformazioni(){	
			
//			String[] parse = downloadJSON("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/home_timeline.json?count=5&include_rts=false&tweet_mode=extended");
//			String[] parse = downloadJSON();
//			JSONArray parse = downloadJSON();
			JSONObject parse = DatabaseClass.downloadJSON();
			ArrayList<Tweet> Timeline = new ArrayList<Tweet>(); 
				for(int i=0; i<parse.size(); i++) {
//				for(int i=0; i<parse.length; i++) {	
					
					Tweet tw = new Tweet();
					
					JSONObject tweet = (JSONObject) JSONValue.parse((Reader) parse.get(i));
//					JSONObject tweet = (JSONObject) JSONValue.parse(parse[i]);
//					JSONArray arr1 = (JSONArray) tweet.get("timeline");
					
						tw.setDataOra((String) tweet.get("created_at"));
						tw.setId((int) tweet.get("id"));
						tw.setTesto((String) tweet.get("full_text"));
						tw.setRetweeted((boolean) tweet.get("retweeted"));

	/*									Hashtag hashtag;
										JSONObject entities = (JSONObject) dataset.get(i);
//										JSONArray entities = (JSONArray) dataset.get("entities");
										JSONArray Hashtag = (JSONArray) entities.get("hashtags");
										
										for(int j=0; j<Hashtag.size(); j++) {
											JSONObject text = (JSONObject) Hashtag.get(j);
											hashtag = new Hashtag();
											hashtag.setTesto((String) text.get("text"));
										}*/
										
						Timeline.add(tw);					
				}

//			System.out.println(Timeline);   
//			return  Timeline;
			return Timeline;	
		}
}
