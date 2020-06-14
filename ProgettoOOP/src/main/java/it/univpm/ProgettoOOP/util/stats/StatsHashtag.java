package it.univpm.ProgettoOOP.util.stats;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.StringStatistics;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.util.other.Statistics;
import it.univpm.ProgettoOOP.util.other.StatsCalculator;

public class StatsHashtag  extends Statistics implements StatsCalculator{
	
	public StatsHashtag(ArrayList<Tweet> TweetList) {
		super(TweetList);
	}
	
	public StringStatistics run(){
		
		int count = (int) tweets.stream().count();
		Map<String, Long>  countForHashtag = null;
		for(int i=0; i<tweets.size();i++) {
			for(int j=0; j<tweets.get(i).getEntities().size(); j++) {
				for(int k=0; k<tweets.get(i).getEntities().get(j).getHashtags().size();k++) {
					
					countForHashtag= tweets.get(i).getEntities().get(j).getHashtags().stream().collect(Collectors.groupingBy(Hashtag::getText, Collectors.counting()));
				}
			}
		}
		
	    int uniqElem = countForHashtag.size();
	    
	    return new StringStatistics("Hashtag", count, uniqElem, countForHashtag);
	}

}
