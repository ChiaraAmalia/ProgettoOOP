package it.univpm.ProgettoOOP.util.filter;

import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.util.other.Filter1Compare;

/** Questa classe controlla se il tweet che gli viene passato
 *  è stato retweettato meno di X volte. X viene passato tramite paramFilter.
 *  
 *  @see Tweet
 *  @see Filter1compare
 *  @see Filter
 *  
 *  @author Chiara Amalia Caporusso
 *  @author Piero Campitelli
*/

public class FilterRetweetCountLess extends Filter1Compare implements Filter{

	public FilterRetweetCountLess(Object paramFilter) {                                  
		super(paramFilter);
	}
	
	public boolean filter (Tweet tweet) {
		
		if(tweet.getRetweet_count()<paramFilter) {
			return true;
		}
		return false;
	}
}
