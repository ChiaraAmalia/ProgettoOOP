package it.univpm.ProgettoOOP.filter;

public class FilterHashtagIncluded extends Filter1Compare implements Filter{
	public FilterHashtagIncluded(Object paramCompare) {
		super(paramCompare);
	}
	
	public boolean filter(Tweet tweet) {
		if(Tweet.getHashtag().equals(tweet)) {
			return true;
	}
		return false;
		
	}
	
	

}
