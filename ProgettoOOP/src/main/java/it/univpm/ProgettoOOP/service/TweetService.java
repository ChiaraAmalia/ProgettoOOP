package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;
import java.util.Collection;

import it.univpm.ProgettoOOP.model.Tweet;

public interface TweetService {
	
	public abstract Collection<ArrayList<Tweet>> getTweet();
//	public abstract ArrayList<Tweet> getTweet();
}
