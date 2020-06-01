package it.univpm.ProgettoOOP.service;

import java.io.Reader;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import it.univpm.ProgettoOOP.database.DatabaseClass;
import it.univpm.ProgettoOOP.model.Entities;
import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.Tweet;

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
					tw.setDataOra((String) obj1.get("created_at"));
					tw.setId((long) obj1.get("id"));
					tw.setTesto((String) obj1.get("full_text"));
					tw.setRetweeted((boolean) obj1.get("retweeted"));
					
					Hashtag hashtag;
					Entities en = new Entities();
						JSONObject entities = (JSONObject) obj1.get("entities");
						JSONArray Hashtag = (JSONArray) entities.get("hashtags");
						
						for(int j=0; j<Hashtag.size(); j++) {
							JSONObject text = (JSONObject) Hashtag.get(j);
							hashtag = new Hashtag();
							hashtag.setTesto((String) text.get("text"));
							en.setHashtags(hashtag);
						}
					
					tw.setEntities(en);
					Timeline.add(tw);
					}			
			return  Timeline;	
		}
}
