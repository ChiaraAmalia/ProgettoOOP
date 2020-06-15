package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;

public class FilterHashtagLess extends Filter1Compare implements Filter{
	
	public FilterHashtagLess(Object paramFilter) {                                  
		super(paramFilter);
	}
	
	public boolean filter (Tweet tweet) {
		for(int i=0; i<tweet.getEntities().size(); i++) {
			if( tweet.getEntities().get(i).getHashtags().size()< paramFilter) {
				return true;
			}
		}
		return false;
	}
}
