package it.univpm.ProgettoOOP.util.filter;


import it.univpm.ProgettoOOP.model.User;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.FilterArrayString;

public class FilterHashtagUser extends FilterArrayString implements Filter {
	
	public FilterHashtagUser (Object parameters) {
		super(parameters);
	}
	
	public boolean filter (Tweet tweet) {
		for(String p:param) {
			for(int i=0; i<tweet.getUsers().size(); i++) {
				if( tweet.getUsers().get(i).getScreenName().equals(p))
					return true;
		}
			
	}
		return false;
	}
}
