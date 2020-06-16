package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.FilterArrayString;

/** Questa classe controlla se il tweet che gli viene passato
 *  è scritto in una lingua richiesta dal client. 
 *  La lingua selezionata viene passata con parameters
 *  
 *  @see Tweet
 *  @see FilterArrayString
 *  @see Filter
 *  
 *  @author Chiara Amalia Caporusso
 *  @author Piero Campitelli
*/

public class FilterLangIncluded extends FilterArrayString implements Filter {

	public FilterLangIncluded(Object parameters) {                                  
		super(parameters);
	}
	
	public boolean filter(Tweet tweet) {
		for(String p: param) {
			if(tweet.getLang().equals(p)) {
				return true;
			}
		}
		return false;
	}
}
