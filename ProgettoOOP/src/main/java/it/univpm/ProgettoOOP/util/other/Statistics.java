package it.univpm.ProgettoOOP.util.other;

import java.util.ArrayList;

import it.univpm.ProgettoOOP.model.Tweet;

public class Statistics {

	protected ArrayList<Tweet> tweets;
	
	/** Costruttore 
	 * @param RecordList array su cui si vuol calcolare la statistica 
	*/
	public Statistics(ArrayList<Tweet> tweetList) {
		this.tweets = tweetList;
	}
}
