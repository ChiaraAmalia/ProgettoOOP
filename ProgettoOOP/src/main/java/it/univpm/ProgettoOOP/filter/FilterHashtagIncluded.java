package it.univpm.ProgettoOOP.filter;

import it.univpm.ProgettoOOP.model.Entities;
import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.other.Filter1Compare;
import it.univpm.ProgettoOOP.other.Filter2Compare;
import it.univpm.ProgettoOOP.other.Filter;

public class FilterHashtagIncluded extends Filter1Compare implements Filter{
	public FilterHashtagIncluded(Object paramCompare) {
		super(paramCompare);
	}
	
	public boolean filter(Tweet tweet) {

		for(int i=0; i<tweet.getEntities().size(); i++) {
			for(int j=0; j<tweet.getEntities().get(i).getHashtags().size(); j++) {
				if((tweet.getEntities().get(i).getHashtags().get(j).getText()).equals(tweet.getEntities().get(i).getHashtags().get(j).getText()))
					return true;
			}
		}
		return false;
	}
}
