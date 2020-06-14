package it.univpm.ProgettoOOP.service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import it.univpm.ProgettoOOP.Exception.FilterIllegalArgumentException;
import it.univpm.ProgettoOOP.Exception.FilterNotFoundException;
import it.univpm.ProgettoOOP.Exception.InternalGeneralException;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.service.JSONParse;
import it.univpm.ProgettoOOP.util.other.Filter;
                                                                        
 public class FilterService {
	 
	private final static String path = "it.univpm.ProgettoOOP.util.filter.";
	
    private static ArrayList<Tweet> tweets = JSONParse.ParseInformazioni();

	public static Filter instanceFilter(String column,String operator,Object param) 
		   throws FilterNotFoundException, FilterIllegalArgumentException,InternalGeneralException{
		
		Filter filtro;
		String filterName = new String("Filter"+column+operator);
		String ClassFilterName = path.concat(filterName);
	    
		try {
			
			Class<?> cls = Class.forName(ClassFilterName); //seleziono la classe
		
			Constructor<?> ct = cls.getDeclaredConstructor(Object.class); //seleziono il costruttore
	    
			filtro =(Filter)ct.newInstance(param);  //istanzo oggetto filtro
		}
		
	    //entra qui se il nome filtro non è corretto 
	    catch(ClassNotFoundException e){
	    	throw new FilterNotFoundException("The filter in field: '"+column+"' with operator: '"+
	                                            operator +"' does not exist");
	    }
		
		//entra qui se sbagliate maiuscole e minuscole
	    catch(NoClassDefFoundError e){
	    	throw new FilterNotFoundException(
	    			"Error typing: '"+filterName+"' uppercase and lowercase error");
	    }

	    //entra qui se il costruttore chiamato da newInstance lancia un eccezione 
	   	catch (InvocationTargetException e) {  
	   		//genero una nuova eccezione 
	   		 throw new FilterIllegalArgumentException(e.getTargetException().getMessage()
	   				+ " Expected in '"+column+"'");
	   	}

	    catch (LinkageError | NoSuchMethodException | SecurityException 
	    		| InstantiationException | IllegalAccessException e ) {
		       e.printStackTrace();
		    	throw new InternalGeneralException("try later");
		    }

		
	    return filtro;
	    
	}
		
	
	public static ArrayList<Tweet> runFilterAND(Filter filtro, ArrayList<Tweet> previousArray){

		ArrayList<Tweet> filteredArray = new ArrayList<Tweet>();
		
		for(Tweet tweet :  previousArray) {

			if(filtro.filter(tweet))
				filteredArray.add(tweet);
		}				

		return filteredArray;
	}

	
	public static  ArrayList<Tweet> runFilterOR(Filter filtro, ArrayList<Tweet> previousArray){

		ArrayList<Tweet> filteredArray = new ArrayList<Tweet>();
		
		for(Tweet tweet : tweets) {

			if(filtro.filter(tweet))
				filteredArray.add(tweet);
		}	
		
		previousArray.removeAll(filteredArray);
		previousArray.addAll(filteredArray);
		return previousArray;
	}
	
}




