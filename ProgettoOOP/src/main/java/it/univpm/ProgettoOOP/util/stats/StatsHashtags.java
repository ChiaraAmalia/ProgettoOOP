package it.univpm.ProgettoOOP.util.stats;

import java.util.ArrayList;

import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.NumeroHashtag;
import it.univpm.ProgettoOOP.model.Tweet;

public class StatsHashtags {
	
	public ArrayList<NumeroHashtag> HashtagTweet(ArrayList<Tweet> tw){
		
		ArrayList<NumeroHashtag> nHash = new ArrayList<NumeroHashtag>();
		int z = 0;
		NumeroHashtag a = new NumeroHashtag();
		
		for(Tweet t:tw) {
			a.setnHashtag(0);
				for(int i=0; i<t.getEntities().size(); i++) {
					for(int j=0; j<t.getEntities().get(i).getHashtags().size();j++) {
						a.setHashtag(t.getEntities().get(i).getHashtags().get(j));
					}	
				}

			if(!nHash.contains(a))
				nHash.add(a);
			
		}
		
		for(NumeroHashtag n: nHash) {
			for(int g=0; g<n.getHashtag().size();g++) {
			String b = n.getHashtag().get(g).getText();
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
			
		}
		
		return nHash;
	}
}
