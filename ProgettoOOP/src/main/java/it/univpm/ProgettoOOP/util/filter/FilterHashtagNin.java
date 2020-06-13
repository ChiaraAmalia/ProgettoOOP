package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter2Compare;

public class FilterHashtagNin extends Filter2Compare implements Filter{
	
	public FilterHashtagNin(Object parametri) {
		super(parametri);
	}
	
	public boolean filter(Tweet tweet) {
		for(int i=0; i<tweet.getEntities().size(); i++) {
			if(tweet.getEntities().get(i).getHashtags().size()>= parametro1 & tweet.getEntities().get(i).getHashtags().size()<= parametro2)
				return false;
		}
		return true;
	}
}
