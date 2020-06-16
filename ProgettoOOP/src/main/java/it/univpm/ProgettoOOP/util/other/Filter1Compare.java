package it.univpm.ProgettoOOP.util.other;

/**
 * Rappresenta la superclasse per i filtri che lavorano su un intero.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Filter1Compare{
	
	protected int paramFilter;
	
	/** Costruttore 
	 * @param paramFilter deve essere un Int.
	 * @throws IllegalArgumentException viene lanciata se non si inserisce il tipo richiesto. 
	*/
	public Filter1Compare(Object paramFilter){
		
		if(paramFilter instanceof Integer ) { 
			this.paramFilter =(Integer)paramFilter;
		}else {
			throw new IllegalArgumentException("Type: Interger ");
		}
		
	}
		
	/** Set
	 * @param paramFilter deve essere un Int.
	 * @throws IllegalArgumentException viene lanciata se non si inserisce il tipo richiesto.
	*/
	public void setParamFilter(Object paramFilter) {
		
		if(paramFilter instanceof Integer ) { 
			this.paramFilter =(Integer)paramFilter;
		}else {
			throw new IllegalArgumentException("Type: Interger ");
		}
	}

	/**Set Overloading
	 * 
	 * @param paramFilter
	 */
	public void setParamFilter(int paramFilter) {
		this.paramFilter = paramFilter;
	}

	public int getParamFilter() {
		return paramFilter;
	}
}
