package it.univpm.ProgettoOOP.util.other;

public class Filter1Compare{
	
	protected int parametroFiltro;
	
	
	/** Costruttore 
	 * @param parametroFiltro deve essere un Int.
	 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
	*/
	public Filter1Compare(Object parametroFiltro){
		
		if(parametroFiltro instanceof Integer ) { 
			this.parametroFiltro =(Integer)parametroFiltro;
		}else {
			throw new IllegalArgumentException("Type: Interger ");
		}
		
	}
		
	/** Set
	 * @param parametroFiltro deve essere un Int.
	 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
	*/
	public void setParametroFiltro(Object parametroFiltro) {
		
		if(parametroFiltro instanceof Integer ) { 
			this.parametroFiltro =(Integer)parametroFiltro;
		}else {
			throw new IllegalArgumentException("Type: Interger ");
		}
	}

	/** Set Overloading
	 *  
	*/
	public void setParametroFiltro(int parametroFiltro) {
		this.parametroFiltro = parametroFiltro;
	}

	public int getParametroFiltro() {
		return parametroFiltro;
	}
}
