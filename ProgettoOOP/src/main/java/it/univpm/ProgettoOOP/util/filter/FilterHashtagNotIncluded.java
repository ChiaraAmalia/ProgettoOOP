package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;

public class FilterHashtagNotIncluded extends Filter1Compare implements Filter{
	
	public FilterHashtagNotIncluded(Object paramCompare) {
		super(paramCompare);
	}
	
	public boolean filter(Tweet tweet) {
		for(int i=0; i<tweet.getEntities().size(); i++) {
			for(int j=0; j<tweet.getEntities().get(i).getHashtags().size(); j++) {
				if((tweet.getEntities().get(i).getHashtags().get(j).getText()).equals(paramCompare))
					return false;
			}
	}
		return true;
		
	}
}
