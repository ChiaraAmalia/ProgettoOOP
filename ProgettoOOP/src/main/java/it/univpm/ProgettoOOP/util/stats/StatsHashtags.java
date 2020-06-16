package it.univpm.ProgettoOOP.util.stats;

import java.util.ArrayList;

import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.NumeroHashtag;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.service.JSONParse;

/**
 * Questa classe viene utilizzata per effettuare le statistiche sugli ultimi cento tweet
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */

public class StatsHashtags {
	
	/**
	 * Questo metodo permette di filtrare i tweet in base all'user che l'ha creato.
	 * Viene utilizzato per contare quante volte un hashtag compare nei tweet scritti dall'utente
	 * @param tw ArrayList di Tweet filtrato
	 * @return un ArrayList di tipo NumeroHashtag con all'interno tutti gli hashtag con il relativo conteggio.
	 * @see Tweet
	 */
	public ArrayList<NumeroHashtag> HashtagTweet(ArrayList<Tweet> tw){
		
		ArrayList<NumeroHashtag> nHash = new ArrayList<NumeroHashtag>();
		int z = 0;
		NumeroHashtag a = new NumeroHashtag();
		
		for(Tweet t:tw) {
			a.setnHashtag(0);
			for(int i=0; i<t.getEntities().size(); i++) { //prende entità
				for(int j=0; j<t.getEntities().get(i).getHashtags().size();j++) { //prende gli hashtag	
					a.setHashtag(t.getEntities().get(i).getHashtags().get(j).getText()); //prende il singolo hashtag
					if(!nHash.contains(a)) {
						nHash.add(a);
					}
				}
			}
		}

		for(NumeroHashtag n: nHash) {
			String b = n.getHashtag();
			for(Tweet t: tw) {
				for(int i=0; i<t.getEntities().size(); i++) {
					for(int j=0; j<t.getEntities().get(i).getHashtags().size();j++) {
						if(t.getEntities().get(i).getHashtags().get(j).getText().equals(b))
							z++;	
					}	
				}
			}
			n.setnHashtag(z);
		}
		return nHash;		
	}
	
	/**
	 * Questo metodo permette di contare tutti gli hashtag che sono contenuti all'interno di un tweet.
	 * Il conteggio di hashtag per ogni tweet viene poi salvato all'interno di un array che poi verrà
	 * passato al metodo all'interno della ControllerClass
	 * @return un array di interi contenente il numero di hashtag per ogni tweet
	 * @see JSONParse
	 */
	public int[] NumHashtag() {
		
		ArrayList<Tweet> tw = JSONParse.ParseInformazioni();
		int count=0;
		int nhash[] = new int[tw.size()];
		for(int i=0; i<tw.size();i++) {
			for(int j=0; j<tw.get(i).getEntities().size();j++) {
				count=tw.get(i).getEntities().get(j).getHashtags().size();
				nhash[i]=count;
			}
		}		
		return nhash;
	}
}
