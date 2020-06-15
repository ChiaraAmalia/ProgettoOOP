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

/**
 * Questa classe permette di creare dapprima due HashMap dove all'interno vengono istanziati
 * due ArrayList di tipo Tweet e metadata. In seguito, vengono istanziati i due metodi di TweetService
 * per visualizzare la collezione dove all'interno sono contenuti i relativi tweet/metadati
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
@Service
public class TweetServiceImpl implements TweetService{

	private Map<Long, Tweet> timeline=new HashMap<>();
	private Map<String, Metadata> metadata=new HashMap<>();
	
	//Qui vengono popolate le HashMap
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
	
	/**
	 * @return una collezione di Tweet
	 */
	@Override
	public Collection<Tweet> getTweet() {
		return timeline.values();
	}
	
	/**
	 * @return una collezione di Metadata
	 */
	@Override
	public Collection<Metadata> getMetada(){
		return metadata.values();
	}
	
}
