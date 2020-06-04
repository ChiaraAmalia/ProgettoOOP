package it.univpm.ProgettoOOP.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.other.Filter;
import it.univpm.ProgettoOOP.other.Filter1Compare;

public class FilterImageNotIncluded extends Filter1Compare implements Filter {

	public FilterImageNotIncluded(Object paramCompare) {
		super(paramCompare);
	}
	
	public boolean filter(Tweet tweet) {
		for(int i=0; i<tweet.getEntities().size(); i++) {
			if(tweet.getEntities().get(i).getImages()==null)
				return true;
		}
		return false;
	}
}
