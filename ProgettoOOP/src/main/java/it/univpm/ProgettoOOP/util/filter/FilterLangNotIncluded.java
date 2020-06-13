package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.FilterArrayString;

public class FilterLangNotIncluded extends FilterArrayString implements Filter{
	
	public FilterLangNotIncluded(Object parameters) {                                  
		super(parameters);
	}
	
	public boolean filter(Tweet tweet) {
		for(String p: param) {
			if(tweet.getLang().equals(p)) {
				return false;
			}
		}
		return true;
	}
}
