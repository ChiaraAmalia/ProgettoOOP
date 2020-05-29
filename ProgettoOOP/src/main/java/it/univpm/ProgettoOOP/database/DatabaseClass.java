package it.univpm.ProgettoOOP.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
//import org.json.simple.parser.ParseException;

import it.univpm.ProgettoOOP.model.*;

public class DatabaseClass {
	
	
	public static JSONArray downloadJSON() {
		
		String data = "";
		String line = "";
		String url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/home_timeline.json?count=5&include_rts=false&tweet_mode=extended";
		try {
			
			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
			try {
				
				InputStreamReader inR = new InputStreamReader( in );
				BufferedReader buf = new BufferedReader( inR );
				  
				while ( ( line = buf.readLine() ) != null ) {
					data+= line;
				}
				
			}finally {
				in.close();
			} 
			
		}catch (IOException e) {	
				e.printStackTrace();	
		}catch (Exception e) {	
			e.printStackTrace();	
		}
		
		//NON TOCCARE IL COMANDO MALEDETTO
		JSONArray json = (JSONArray) JSONValue.parse("{\"timeline\":"+data.toString()+"}");
/*		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++){
		    list.addAll((JSONArray)json.get(i));
		}*/
/*	    String[] arr=new String[json.size()];
	    for(int i=0; i<arr.length; i++) {
	        arr[i]= (String) JSONValue.parse((Reader) json.get(i));
	    }*/
//		JSONObject json=new JSONObject("{\"timeline\":"+data.toString()+"}");
		return json;
	}
	
	
	public static ArrayList<Tweet> afterDownload() throws Exception {
		
		JSONArray parse = downloadJSON();
//		String[] parse = downloadJSON();
		ArrayList<Tweet> Timeline = new ArrayList<Tweet>(); 
			for(int i=0; i<parse.size(); i++) {
				
				Tweet tw = new Tweet();
				
				JSONObject tweet = (JSONObject) JSONValue.parse((Reader) parse.get(i));
//				JSONObject tweet = (JSONObject) JSONValue.parse(parse[i]);
//				JSONArray arr1 = (JSONArray) tweet.get("timeline");
				
					tw.setDataOra((String) tweet.get("created_at"));
					tw.setIdTweet((int) tweet.get("id"));
					tw.setTesto((String) tweet.get("full_text"));
					tw.setRetweeted((boolean) tweet.get("retweeted"));
									
/*									Hashtag hashtag;
									JSONObject entities = (JSONObject) dataset.get(i);
//									JSONArray entities = (JSONArray) dataset.get("entities");
									JSONArray Hashtag = (JSONArray) entities.get("hashtags");
									
									for(int j=0; j<Hashtag.size(); j++) {
										JSONObject text = (JSONObject) Hashtag.get(j);
										hashtag = new Hashtag();
										hashtag.setTesto((String) text.get("text"));
									}*/
									
					Timeline.add(tw);					
			}

		System.out.println(Timeline);   
		return Timeline;
	}
}
	

