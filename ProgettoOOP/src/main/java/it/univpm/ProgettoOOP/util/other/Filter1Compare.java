package it.univpm.ProgettoOOP.util.other;

public class Filter1Compare{
	
	protected int paramFilter;
	
	
	/** Costruttore 
	 * @param parametroFiltro deve essere un Int.
	 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
	*/
	public Filter1Compare(Object paramFilter){
		
		if(paramFilter instanceof Integer ) { 
			this.paramFilter =(Integer)paramFilter;
		}else {
			throw new IllegalArgumentException("Type: Interger ");
		}
		
	}
		
	/** Set
	 * @param parametroFiltro deve essere un Int.
	 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
	*/
	public void setParamFilter(Object paramFilter) {
		
		if(paramFilter instanceof Integer ) { 
			this.paramFilter =(Integer)paramFilter;
		}else {
			throw new IllegalArgumentException("Type: Interger ");
		}
	}

	/** Set Overloading
	 *  
	*/
	public void setParamFilter(int paramFilter) {
		this.paramFilter = paramFilter;
	}

	public int getParamFilter() {
		return paramFilter;
	}
}
