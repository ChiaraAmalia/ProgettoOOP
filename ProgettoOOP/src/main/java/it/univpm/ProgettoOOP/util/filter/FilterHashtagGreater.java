package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;

public class FilterHashtagGreater extends Filter1Compare implements Filter { 
	public int count=0;
	public FilterHashtagGreater (Object parameters) {
		super(parameters);
	}
	
	public boolean filter (Tweet tweet) {
			for(int i=0; i<tweet.getEntities().size(); i++) {
				for(int j=0; j<tweet.getEntities().get(i).getHashtags().size(); j++) {
					if(tweet.getEntities().get(i).getHashtags().get(j).getText()!=null)
					count++;
					
				}
				if(count>getParamFilter())
					return true;
				return false;
			}
		
	}
}

