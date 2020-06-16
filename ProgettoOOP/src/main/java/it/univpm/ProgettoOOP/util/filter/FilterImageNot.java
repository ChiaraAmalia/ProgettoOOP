package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.FilterArrayString;

/** Questa classe controlla se il tweet che gli viene passato
 *  non contiene un'immagine.
 *  
 *  @see Tweet
 *  @see FilterArrayString
 *  @see Filter
 *  
 *  @author Chiara Amalia Caporusso
 *  @author Piero Campitelli
*/

public class FilterImageNot extends FilterArrayString implements Filter{
	
	public FilterImageNot(Object parameters) {
		super(parameters);
	}
	public boolean filter(Tweet tweet) {
		for(int i=0;i<tweet.getEntities().size();i++) {
			for(int j=0; j<tweet.getEntities().get(i).getImages().size(); j++)
				if(!(tweet.getEntities().get(i).getImages().get(j).equals(null)))
					return false;
	}
	return true;
}
}
