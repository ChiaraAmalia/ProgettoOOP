 package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;
import it.univpm.ProgettoOOP.util.other.FilterArrayStringParent;

public class FilterImageIncluded extends FilterArrayStringParent implements Filter {
	
	public FilterImageIncluded(Object parametri) {
		super(parametri);
	}
	
	public boolean filter(Tweet tweet) {
		
		for(String p : param) {
			for(int i=0; i<tweet.getEntities().size(); i++) {
				for(int j=0; j<tweet.getEntities().get(i).getImages().size(); j++) {
					if((tweet.getEntities().get(i).getImages().get(j).getType()).equals(p))
						return true;
				}
			}
		}
		return false;
	}

}
