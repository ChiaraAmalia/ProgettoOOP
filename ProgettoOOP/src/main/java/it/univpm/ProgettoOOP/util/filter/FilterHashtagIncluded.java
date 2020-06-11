package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Entities;
import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;
import it.univpm.ProgettoOOP.util.other.Filter2Compare;
import it.univpm.ProgettoOOP.util.other.FilterArrayStringParent;

public class FilterHashtagIncluded extends FilterArrayStringParent implements Filter{
	
	public FilterHashtagIncluded(Object parametri) {
		super(parametri);
	}
	 
	public boolean filter(Tweet tweet) {

		for(String p : param) {
			for(int i=0; i<tweet.getEntities().size(); i++) {
				for(int j=0; j<tweet.getEntities().get(i).getHashtags().size(); j++) {
					if(tweet.getEntities().get(i).getHashtags().get(j).getText().equals(p))
						return true;
				}
			}
		}
		return false;
	}
}
