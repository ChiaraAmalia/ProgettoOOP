 package it.univpm.ProgettoOOP.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.other.Filter;
import it.univpm.ProgettoOOP.other.Filter1Compare;

public class FilterImageIncluded extends Filter1Compare implements Filter {
	
	public FilterImageIncluded(Object paramCompare) {
		super(paramCompare);
	}
	
	public boolean filter(Tweet tweet) {
		
		for(int i=0; i<tweet.getEntities().size(); i++) {
			for(int j=0; j<tweet.getEntities().get(i).getImages().size(); j++)
				if((tweet.getEntities().get(i).getImages().get(j).getType()).equals(paramCompare))
					return true;
		}
		return false;
	}

}
