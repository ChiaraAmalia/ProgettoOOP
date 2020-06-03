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
	
	public boolean filter(Hashtag hash) {
		Hashtag hashtag = new Hashtag();
		if((hashtag.getText()).equals(hash.getText())) {
			return true;
	}
		return false;
		
	}
	
	

}
