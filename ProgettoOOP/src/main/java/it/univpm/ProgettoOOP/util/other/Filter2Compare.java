package it.univpm.ProgettoOOP.util.other;

import java.util.ArrayList;

/**
 * Rappresenta la superclasse che istanzia 2 oggetti interi passati come parametri
 * 
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Filter2Compare {

	protected int param1;
	protected int param2;
	
		
	/** Costruttore 
	 * @param param deve essere un ArrayList di Interi di lunghezza 2.
	 * @throws IllegalArgumentException il valore passato non è del tipo richiesto
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
	 * @param param deve essere un ArrayList di interi di lunghezza 2.
	 * @throws IllegalArgumentException il valore passato non è del tipo richiesto
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
	 * @return il primo parametro passato
	 */
	public int getParam1() {
		return param1;
	}

	/**
	 * @param param1 
	 * viene settato il primo parametro a un nuovo valore
	 */
	public void setParam1(int param1) {
		this.param1 = param1;
	}

	/**
	 * @return il secondo parametro
	 */
	public int getParam2() {
		return param2;
	}

	/**
	 * @param param2 
	 * viene settato il secondo parametro a un nuovo valore
	 */
	public void setParam2(int param2) {
		this.param2 = param2;
	}
}


