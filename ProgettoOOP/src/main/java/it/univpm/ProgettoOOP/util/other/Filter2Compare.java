package it.univpm.ProgettoOOP.util.other;


import java.util.ArrayList;
/* Superclasse che istanzia 2 oggetti interi passati come parametri
 */
public class Filter2Compare {

	protected int param1;
	protected int param2;
	
		
	/** Costruttore 
	 * @param parametro deve essere un ArrayList di Interi di lunghezza 2.
	 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
	*/
	public Filter2Compare(Object param){

		if(param instanceof ArrayList<?>) {
				
			if( ((ArrayList<?>) param).size() != 2) {
				throw new IndexOutOfBoundsException("2 Integer ") ;
			}//control of array length 
												
			if(((ArrayList<?>) param).get(0) instanceof Integer) {
				param1 = (int) ((ArrayList<?>) param).get(0) ;
			}else {throw new IllegalArgumentException("Type: Integer ");}
					
			if(((ArrayList<?>) param).get(1) instanceof Integer) {
				param2 = (int) ((ArrayList<?>) param).get(1) ;
			}else{throw new IllegalArgumentException("Type: Integer ");}			
					
					
		}else {
			throw new IllegalArgumentException("Type: Array of 2 Integer ");
		}
		
		if(param2 < param1) {
			throw new IllegalArgumentException("Integer two must be greater than Integer one ");
		}
	}


	
	/** Set
	 * @param parametro deve essere un ArrayList di interi di lunghezza 2.
	 * @throws IllegalArgumentException parametri non è del tipo richiesto. 
	*/
	
	public void setParameters(Object param) {
		
		if(param instanceof ArrayList<?>) {
			
			if( ((ArrayList<?>) param).size() != 2) {
				throw new IndexOutOfBoundsException("2 Integer ") ;
			}//control of array length 
												
			if(((ArrayList<?>) param).get(0) instanceof Integer) {
				param1 = (int) ((ArrayList<?>) param).get(0) ;
			}else {throw new IllegalArgumentException("Type: Integer ");}
					
			if(((ArrayList<?>) param).get(1) instanceof Integer) {
				param2 = (int) ((ArrayList<?>) param).get(1) ;
			}else{throw new IllegalArgumentException("Type: Integer ");}			
					
			
		}else {
			throw new IllegalArgumentException("Type: Array of 2 Integer ");
		}
		
		if(param2 < param1) {
			throw new IllegalArgumentException("Integer two must be greater than Integer one ");
		}
	}

	/**
	 * @return the param1
	 */
	public int getParam1() {
		return param1;
	}

	/**
	 * @param param1 the param1 to set
	 */
	public void setParam1(int param1) {
		this.param1 = param1;
	}

	/**
	 * @return the param2
	 */
	public int getParam2() {
		return param2;
	}

	/**
	 * @param param2 the param2 to set
	 */
	public void setParam2(int param2) {
		this.param2 = param2;
	}
}


