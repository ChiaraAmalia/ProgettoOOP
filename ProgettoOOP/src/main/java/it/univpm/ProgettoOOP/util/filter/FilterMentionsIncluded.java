package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.FilterArrayString;

public class FilterMentionsIncluded extends FilterArrayString implements Filter {
	
	public FilterMentionsIncluded(Object parameters) {
		super(parameters);
	}
	
	public boolean filter(Tweet tweet) {
		for(String p :param) {
			for(int i=0;i<tweet.getEntities().size();i++) {
				for(int j=0; j<tweet.getEntities().get(i).getMentions().size(); j++) {
					if(tweet.getEntities().get(i).getMentions().get(j).getScreenName().equals(p))
						return true;
				}
			}
		}
		return false;
	}

}
