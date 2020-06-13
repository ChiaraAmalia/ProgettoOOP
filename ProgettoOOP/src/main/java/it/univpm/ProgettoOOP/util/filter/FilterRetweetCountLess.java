package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;

public class FilterRetweetCountLess extends Filter1Compare implements Filter{

	public FilterRetweetCountLess(Object paramFilter) {                                  
		super(paramFilter);
	}
	
	public boolean filter (Tweet tweet) {
		
		if(tweet.getRetweet_count()<paramFilter) {
			return true;
		}
		return false;
	}
}
