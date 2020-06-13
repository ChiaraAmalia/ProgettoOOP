package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter2Compare;

public class FilterHashtagGreater extends Filter1Compare implements Filter {      //Filter2Comapre è una superclasse che serve
	public FilterHashtagGreater (Object parmeters) {                                   //per inizializzare l'oggetto filtro con un numero
		super(parameters);
	}
	
	public boolean filter (Tweet tweet) {
			for(int i=0; i<tweet.getEntities().size(); i++) {
				for(int j=0; j<tweet.getEntities().get(i).getHashtags().size(); j++) {
					if(tweet.getEntities().get(i).getHashtags().get(j).getText()!=null)
						int count++;
				}
			}
		if(count>parameters)
			return true;
		else
		return false;
	}
}

