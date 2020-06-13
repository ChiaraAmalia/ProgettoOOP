package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;
import it.univpm.ProgettoOOP.util.other.Filter2Compare;

public class FilterHashtagGreater extends Filter1Compare implements Filter { 

	public FilterHashtagGreater(Object parametroFiltro) {                                  
		super(parametroFiltro);
	}
	
	public boolean filter (Tweet tweet) {
		for(int i=0; i<tweet.getEntities().size(); i++) {
			if( tweet.getEntities().get(i).getHashtags().size()> parametroFiltro) {
				return true;
			}
		}
		return false;
	}

}		
	
	

//}
