package it.univpm.ProgettoOOP.other;

import it.univpm.ProgettoOOP.model.Tweet;

public interface Filter {

	public abstract boolean filter(Tweet tweet);
}
