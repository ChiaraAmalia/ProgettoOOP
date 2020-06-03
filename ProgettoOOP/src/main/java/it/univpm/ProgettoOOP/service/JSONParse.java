package it.univpm.ProgettoOOP.service;

import java.io.Reader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import it.univpm.ProgettoOOP.database.DatabaseClass;
import it.univpm.ProgettoOOP.model.Dimensions;
import it.univpm.ProgettoOOP.model.Entities;
import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.Image;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.model.User;
import it.univpm.ProgettoOOP.model.UserMentions;
import it.univpm.ProgettoOOP.model.urls;

/**
 * Questa classe permette di parsare di dati del file JSON che vengono scaricati nella DatabaseClass
 * @see DatabaseClass
 * @see Tweet
 * 
 * @author Chiara Amalia Caporusso
 *
 */

public class JSONParse {
	
	/**
	 * Questo metodo permette di ritornare un arraylist che contiene tutte le informazioni
	 * riguardanti la classe
	 * @see Tweet
	 * @return Timeline
	 */
	public static  ArrayList<Tweet> ParseInformazioni(){

			JSONArray parse = DatabaseClass.downloadJSON();
			ArrayList<Tweet> Timeline = new ArrayList<Tweet>(); 
				for(int i=0; i<parse.size(); i++) {
					
					Tweet tw = new Tweet();

					JSONObject obj1 = (JSONObject)  parse.get(i);
					tw.setCreated_at((String) obj1.get("created_at"));
					tw.setId((long) obj1.get("id"));
					tw.setText((String) obj1.get("full_text"));
					tw.setRetweet_count((long) obj1.get("retweet_count"));
					tw.setLang((String) obj1.get("lang"));
					
					Hashtag hashtag;
					Entities en = new Entities();
					JSONObject entities = (JSONObject) obj1.get("entities");
					JSONArray Hashtag = (JSONArray) entities.get("hashtags");
						
					for(int j=0; j<Hashtag.size(); j++) {
						hashtag = new Hashtag();
						JSONObject obj2 = (JSONObject) Hashtag.get(j);
						hashtag.setText((String) obj2.get("text"));
						en.setHashtags(hashtag);
					}
					
					UserMentions userMentions;
					JSONArray UserMentions = (JSONArray) entities.get("user_mentions");
						
					for(int j=0; j<UserMentions.size(); j++) {					
						userMentions = new UserMentions();
						JSONObject obj3 = (JSONObject) UserMentions.get(j);
						userMentions.setScreenName((String) obj3.get("screen_name"));
						userMentions.setName((String) obj3.get("name"));
						userMentions.setId((long) obj3.get("id"));
						en.setMentions(userMentions);
					}
					
					urls url;
					JSONArray URL = (JSONArray) entities.get("urls");
					
					for(int j=0; j<URL.size(); j++) {					
						url = new urls();
						JSONObject obj4 = (JSONObject) URL.get(j);
						url.setUrl((String) obj4.get("url"));
						url.setExpandedUrl((String) obj4.get("expanded_url"));
						en.setUrl(url);
					}
					
					Image image;
					if(entities.containsKey("media")) {
						JSONArray media = (JSONArray) entities.get("media");
						for(int j = 0; j<media.size(); j++) {
							image = new Image();
		 					JSONObject obj5 = (JSONObject) media.get(j);
							image.setId((long) obj5.get("id"));
							image.setMedia_url((String) obj5.get("media_url"));
							image.setType((String) obj5.get("type"));
							
							Dimensions dimensions;
							JSONObject Size = (JSONObject) obj5.get("sizes");
							JSONObject dim = (JSONObject) Size.get("medium");
							dimensions = new Dimensions();
							dimensions.setWidth((long) dim.get("w"));
							dimensions.setHeight((long) dim.get("h"));
							dimensions.setResize((String) dim.get("resize"));
							image.setSize(dimensions);
							en.setImages(image);
						}
					}

					tw.setEntities(en);
					
					User user = new User();
					JSONObject USER = (JSONObject) obj1.get("user");
					user.setId((long) USER.get("id"));
					user.setName((String) USER.get("name"));
					user.setScreenName((String) USER.get("screen_name"));
					user.setDescription((String) USER.get("description"));
					user.setFollowerCount((long) USER.get("followers_count"));
					tw.setUsers(user);	
					
					
					Timeline.add(tw);
	
			}			
			return  Timeline;	
		}
}
