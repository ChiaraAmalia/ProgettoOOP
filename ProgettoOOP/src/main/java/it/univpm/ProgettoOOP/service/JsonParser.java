package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.univpm.ProgettoOOP.model.Tweet;

public class JsonParser {
	
	/**Effettua il parsing dei dati esterni (Campo da analizzare)
	  @param filtro da applicare
	  @return ArrayList di Tweet filtrati
	 */
	public static ArrayList<Tweet> JsonPArserColumn(Object filter){
		throws InternalGeneralException, FilterNotFoundException, FilterIllegalArgumentException{
			ArrayList<Tweet> previousArray= new ArrayList<Tweet>();                     
			ArrayList<Tweet> filteredArray= new ArrayList<Tweet>(); //vedere se posso anche non istanziarlo quì
			HashMap<String,Object> result= new ObjectMapper().convertValue(filter,HashMap.getClass());
			
			//Itera con tutti gli elementi dell'ArrayList
			for(Map.Entry<String, Object> entry: result.entrySet()) {
				ArrayList<Tweet> previousArray=new ArrayList<Tweet>();
				Object filterParam=entry.getValue();
				Object column=entry.getKey();
				try {
					filteredArray=jsonParserOperator(column,filterParam,previousArray);
				}catch (Security Exception e)
				throw new InternalGeneralException ("Error in I/O parsing information");
				
			}
		}
		
	}
	public static ArrayList<Tweet> jsonParserOperator (String column,Object filterParam,ArrayList<Tweet> previousArray)
			throws InternalGeneralException, FilterNotFoundException, FilterIllegalArgumentException{
		
		
	}

}
