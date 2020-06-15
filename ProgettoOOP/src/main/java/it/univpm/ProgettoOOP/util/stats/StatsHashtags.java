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
//		ArrayList<NumeroHashtag> a = new ArrayList<NumeroHashtag>();
		NumeroHashtag a = new NumeroHashtag();
//		ArrayList<String> hstg = new ArrayList<String>();
		
//		for(int k=0; k<nHash.size();k++) {
		for(Tweet t:tw) {
//			for(int k=0; k<a.size();k++) {
//			a.get(k).setnHashtag(0);
			a.setnHashtag(0);
				for(int i=0; i<t.getEntities().size(); i++) {
					for(int j=0; j<t.getEntities().get(i).getHashtags().size();j++) {
						a.setHashtag(t.getEntities().get(i).getHashtags().get(j));
//						a.setHashtag(t.getEntities().get(i).getHashtags().get(j).getText());
//						a.get(k).setHashtag(t.getEntities().get(i).getHashtags().get(j).getText());
//						if(!nHash.contains(t.getEntities().get(i).getHashtags().get(j).getText()))
//						if(!nHash.contains(a))
//						nHash.add(a);
//						if(nHash.contains(a.get(k)))
//						nHash.add(a.get(k));
//						if(!nHash.contains(a)) {
//							nHash.get(k).setHashtag(t.getEntities().get(i).getHashtags().get(j).getText());
//							nHash.get(k).setnHashtag(j);
//						}
//						if(!hstg.contains(t.getEntities().get(i).getHashtags().get(j).getText()))
//							hstg.add(t.getEntities().get(i).getHashtags().get(j).getText());
						if(!nHash.contains(a))
							nHash.add(a);
					}
//					if(!nHash.contains(a))
//						nHash.add(a);
				
				}
//			if(!nHash.contains(a))
//				nHash.add(a);	
		}
		
		for(NumeroHashtag n: nHash) {
//		for(int l=0; l<nHash.size(); l++) {
			for(int g=0; g<n.getHashtag().size();g++) {
			String b = n.getHashtag().get(g).getText();
//			String b = nHash.get(l).getHashtag();
//		String b = a.get(k).getHashtag();
				for(Tweet t: tw) {
					for(int i=0; i<t.getEntities().size(); i++) {
						for(int j=0; j<t.getEntities().get(i).getHashtags().size();j++) {
							if(t.getEntities().get(i).getHashtags().get(j).getText().equals(b))
								z++;	
						}	
					}
				}
//			nHash.get(l).setnHashtag(z);
			n.setnHashtag(z);
//			a.get(k).setnHashtag(z);		
			}
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
