package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;
import java.util.Collection;

import it.univpm.ProgettoOOP.model.Metadata;
import it.univpm.ProgettoOOP.model.Tweet;

/**
 * Questa interfaccia viene poi utilizzata nella classe TweetServiceImpl
 * Viene utilizzata per istaziare due metodi che permettono la visualizzazione della timeline e dei metadata
 * @see TweetServiceImpl
 * @see Tweet
 * @see Metadata
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public interface TweetService {
	
	public abstract Collection<Tweet> getTweet();
	public abstract Collection<Metadata> getMetada();
}
