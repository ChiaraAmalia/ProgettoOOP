package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;

public class FilterRetweetCountLess extends Filter1Compare implements Filter{

	public FilterRetweetCountLess(Object parametroFiltro) {                                  
		super(parametroFiltro);
	}
	
	public boolean filter (Tweet tweet) {
		
		if(tweet.getRetweet_count()<parametroFiltro) {
			return true;
		}
		return false;
	}
}
