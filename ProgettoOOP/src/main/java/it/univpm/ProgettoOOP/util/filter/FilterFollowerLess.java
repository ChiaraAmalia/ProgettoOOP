package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;

public class FilterFollowerLess extends Filter1Compare implements Filter {
	public FilterFollowerLess(Object paramFilter) {
		super(paramFilter);
	}
	
	public boolean filter(Tweet tweet) {
			for(int i=0; i<tweet.getUsers().size(); i++) {
				if( tweet.getUsers().get(i).getFollowerCount()<paramFilter)
					return true;
	}
			return false;
	}
	

}
