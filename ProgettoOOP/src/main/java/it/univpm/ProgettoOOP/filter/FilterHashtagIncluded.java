package it.univpm.ProgettoOOP.filter;

import com.fasterxml.classmate.Filter;

import it.univpm.ProgettoOOP.model.Entities;
import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.other.Filter1Compare;

public class FilterHashtagIncluded extends Filter1Compare implements Filter{
	public FilterHashtagIncluded(Object paramCompare) {
		super(paramCompare);
	}
	
	public boolean filter(Hashtag hashtag) {
		Hashtag hashtags = new Hashtag();
		if((hashtags.getText()).equals(hashtag.getText())) {
			return true;
	}
		return false;
		
	}
}
