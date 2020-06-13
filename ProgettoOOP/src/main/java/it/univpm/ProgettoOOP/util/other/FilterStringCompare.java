package it.univpm.ProgettoOOP.util.other;

public class FilterStringCompare {
	protected String paramcompare;
	
	
	/** Costruttore 
	 * @param paramFilter deve essere una Stringa.
	 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
	*/
	public FilterStringCompare(Object paramFilter){
		
		
		if(paramFilter instanceof String ) { 
			this.paramFilter =(String)paramFilter;
		}else {
			throw new IllegalArgumentException("Type: String");
		}
		
	}



}
