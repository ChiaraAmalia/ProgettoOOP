package it.univpm.ProgettoOOP.util.filter;


import it.univpm.ProgettoOOP.model.User;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.FilterArrayString;

/** Questa classe controlla se il tweet che gli viene passato
 *  non è stato creato da un determinato utente,l'utente viene passato tramite paramFilter
 *  
 *  @see Tweet
 *  @see FilterArrayString
 *  @see Filter
 *  
 *  @author Chiara Amalia Caporusso
 *  @author Piero Campitelli
*/

public class FilterUserNotCreated extends FilterArrayString implements Filter {
	
	public FilterUserNotCreated (Object parameters) {
		super(parameters);
	}
	
	public boolean filter (Tweet tweet) {
		for(String p:param) {
			for(int i=0; i<tweet.getUsers().size(); i++) {
				if( tweet.getUsers().get(i).getScreenName().equals(p))
					return false;
		}
			
	}
		return true;
	}
}
