package it.univpm.ProgettoOOP.util.other;

import it.univpm.ProgettoOOP.model.Tweet;

/**
 * Rappresenta l'interfaccia per i filtri
 * 
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public interface Filter {
	
	/**
	 * Questo metodo restituisce True se il tweet rispetta le caratteristiche 
	 * richeste del filtro che implementa l'interfaccia.
	 * @param tweet su cui si vuole eseguire la modifica
	 * @return risposta
	 */
	public boolean filter(Tweet tweet);
	
}
