package it.univpm.ProgettoOOP.util.other;

import java.util.ArrayList;

/**
 * Rappresenta la superclasse che lavora con le stringhe
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class FilterArrayString {
	
	protected ArrayList<String> param = new ArrayList<String>();

	
	/** Costruttore 
	 * @param parameters deve essere un ArrayList String.
	 * @throws IllegalArgumentException il valore inserito non è del tipo richiesto
	*/
	public FilterArrayString(Object parameters) {
		
		if(parameters instanceof ArrayList<?>) {
			
			for(Object ele : (ArrayList<?>)parameters) {
				
				if(ele instanceof String) {
					param.add((String)ele);
				}else {
					throw new IllegalArgumentException("Type: String ");
				}
			}

		}else {			
			throw new IllegalArgumentException("Type: Array ");
		}
	}
	
	
	/** Set 
	 * @param parameters deve essere un ArrayList di stringhe
	 * @throws IllegalArgumentException il valore inserito non è del tipo richiesto 
	*/
	public void SetFilterParameters(Object parameters) {
		
		
		if(parameters instanceof ArrayList<?>) {
			
			for(Object ele : (ArrayList<?>)parameters) {
				
				if(ele instanceof String) {
					param.add((String)ele);
				}else {
					throw new IllegalArgumentException("Type: String ");
				}
			}

		}else {			
			throw new IllegalArgumentException("Type: Array ");
		}
	}
	
}
