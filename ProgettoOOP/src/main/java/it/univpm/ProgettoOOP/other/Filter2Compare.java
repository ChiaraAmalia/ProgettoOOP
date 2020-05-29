package it.univpm.ProgettoOOP.other;


import java.util.ArrayList;
/* Superclasse che istanzia 1 o 2 oggetti Stringa passati come parametri
 */
public class Filter2Compare {

	protected String paramCompare1;
	protected String paramCompare2;
	

	public Filter2Compare(Object paramCompare){

		if(paramCompare instanceof ArrayList<?>) {
				
			if( ((ArrayList<?>) paramCompare).size() != 2) {
				throw new IndexOutOfBoundsException("2 String ") ;
			}
				if(((ArrayList<?>) paramCompare).get(0) instanceof String) {
					paramCompare1 = (String) ((ArrayList<?>) paramCompare).get(0);
				}
				else{
					throw new IllegalArgumentException("Unexpected type:String");
					}
				
	if(((ArrayList<?>) paramCompare).get(1) instanceof String) 
				paramCompare2 = (String) ((ArrayList<?>) paramCompare).get(1);
				else {
					throw new IllegalArgumentException("Unexpected type:String");
					}
	}
		}
	
	public void setParamToCompare (Object paramCompare) {
		
		if(paramCompare instanceof ArrayList<?>) {
			
			if( ((ArrayList<?>) paramCompare).size() != 2) {
				throw new IndexOutOfBoundsException("2 String") ;
			}//control of array length 
												
			if(((ArrayList<?>) paramCompare).get(0) instanceof String) {
			paramCompare1 = (String) ((ArrayList<?>) paramCompare).get(0) ;
			}
			else {throw new IllegalArgumentException("Unexpected type:String");}
			}
					
			if(((ArrayList<?>) paramCompare).get(1) instanceof String) {
				paramCompare2 = (String) ((ArrayList<?>) paramCompare).get(1) ;
			}
            else{throw new IllegalArgumentException("Unexpected type:String");}			
       }
	
	public String getParamCompare1() {
		return paramCompare1;
	}


	public void setParametro1(String paramCompare1) {
		this.paramCompare1 = paramCompare1;
	}


	public String getParamComapre2() {
		return paramCompare2;
	}


	public void setParamComapre2(String paramCompare2) {
		this.paramCompare2 = paramCompare2;
	}
	
	



}


