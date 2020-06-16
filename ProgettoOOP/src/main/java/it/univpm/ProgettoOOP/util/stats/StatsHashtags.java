package it.univpm.ProgettoOOP.util.stats;

import java.util.ArrayList;

import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.NumeroHashtag;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.service.JSONParse;

public class StatsHashtags {
	
	public ArrayList<NumeroHashtag> HashtagTweet(ArrayList<Tweet> tw){
		
		ArrayList<NumeroHashtag> nHash = new ArrayList<NumeroHashtag>();
		int z = 0;
		NumeroHashtag a = new NumeroHashtag();

		for(Tweet t:tw) {	
			a.setnHashtag(0);
				for(int i=0; i<t.getEntities().size(); i++) { //prende entità
					for(int j=0; j<t.getEntities().get(i).getHashtags().size();j++) { //prende gli hashtag	
						a.setHashtag(t.getEntities().get(i).getHashtags().get(j).getText());
						if(!nHash.contains(a))
							nHash.add(a);//prende il singolo hashtag	
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
