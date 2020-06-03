package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;
import java.util.Collection;

import it.univpm.ProgettoOOP.model.Metadata;
import it.univpm.ProgettoOOP.model.Tweet;

public interface TweetService {
	
	public abstract Collection<Tweet> getTweet();
	public abstract Collection<Metadata> getMetada();
}
