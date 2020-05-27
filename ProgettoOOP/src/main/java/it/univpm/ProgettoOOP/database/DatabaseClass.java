package it.univpm.ProgettoOOP.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import it.univpm.ProgettoOOP.model.*;

public class DatabaseClass {
	
	public static JSONObject downloadJSON(String url) {
		
		String data = "";
		String line = "";
//		String url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/home_timeline.json?count=5&include_rts=false&tweet_mode=extended";
		
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
		JSONObject json = (JSONObject) JSONValue.parse("{\"timeline\":"+data.toString()+"}");
//		JSONObject json=new JSONObject("{\"timeline\":"+data.toString()+"}");
		return json;

	}
	
	public static void InformazioniSalvate(JSONObject json) throws Exception {
		
		if(json != null) {
				try {
					JSONArray dataset = (JSONArray) json.get("timeline");
					 int length =  (int) dataset.size();
					if(dataset != null) {
						Timeline timeline = new Timeline();
							for(int i=0; i<length; i++) {
									JSONObject tweet = (JSONObject) dataset.get(i);
								
									Tweet tw = new Tweet();
								
									tw.setDataOra((String) tweet.get("created_at"));
									tw.setIdTweet((int) tweet.get("id"));
									tw.setTesto((String)tweet.get("full_text"));
									tw.setRetweeted((boolean)tweet.get("retweeted"));
									
									Hashtag hashtag;
									JSONObject entities = (JSONObject) dataset.get(i);
									JSONObject obj = (JSONObject) entities.get("entities");
									JSONArray Hashtag = (JSONArray) obj.get("hashtags");
									
									for(int j=0; j<Hashtag.size(); j++) {
										JSONObject text = (JSONObject) entities.get(j);
										hashtag = new Hashtag();
										hashtag.setTesto((String) text.get("text"));
									}
									
									
							}

					}
					
				}catch (SecurityException e) {
					 throw new Exception("Error in parsing I/O operation");
				}

		}
	}
	
}
	

