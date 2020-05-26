package it.univpm.ProgettoOOP.service;

import java.security.Security;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.fasterxml.jackson.databind.ObjectMapper;

import ch.qos.logback.core.filter.Filter;
import it.univpm.ProgettoOOP.model.Entities;
import it.univpm.ProgettoOOP.model.Hashtag;
import it.univpm.ProgettoOOP.model.Timeline;
import it.univpm.ProgettoOOP.model.Tweet;

public class JsonParser {
	
	
	/**Effettua il parsing dei dati esterni (Campo da analizzare)
	  @param filtro da applicare
	  @return ArrayList di Tweet filtrati
	 */
	public static ArrayList<Tweet> JsonParserColumn(Object filter)
			throws Exception{ 
				ArrayList<Tweet> previousArray= new ArrayList<Tweet>();
				ArrayList<Tweet> filteredArray= new ArrayList<Tweet>();
			//vedere se posso anche non istanziarlo quì
				HashMap<String,Object> result= new ObjectMapper().convertValue(filter,HashMap.class);

			//Itera con tutti gli elementi dell'ArrayList
				for(Map.Entry<String, Object> entry: result.entrySet()) {
					filteredArray= new ArrayList<Tweet>();
					Object filterParam=entry.getValue();
					Object column=entry.getKey();
					try {
						filteredArray=jsonParserOperator(column,filterParam,previousArray);
					}catch (SecurityException e) {
						throw new Exception ("Error in I/O parsing information");
					}
				}
//				previousArray= new ArrayList<Tweet>();
				previousArray.addAll(filteredArray);
				return filteredArray;
			}
		
	public static ArrayList<Tweet> jsonParserOperator (Object column,Object filterParam,ArrayList<Tweet> previousArray)
			throws Exception{
		String line=" ";
		Filter filter;
		ArrayList <Tweet> filteredArray= new ArrayList <Tweet>();
		HashMap <String,Object> result= new ObjectMapper().convertValue(filterParam,HashMap.class);

		for(Map.Entry<String, Object> entry: result.entrySet()) {
			String operator=(String) entry.getValue();
			Object value=entry.getValue();
			if((operator.equals("type")) || (operator.contentEquals("Type"))) {
				line=(String) value;
				if((!(value.equals("and"))&&(!(value.equals("or"))))) {
					throw new Exception("'and' o 'or' expected after 'type'");
		    	}
		    	continue;
		    }
			filter=FilterService.istanceFilter(column,operator,value);
			if (line.equals("and"))
				filteredArray = FilterService.runFilterAND(filter, previousArray);
			else
				filteredArray = FilterService.runFilterOR(filter, previousArray);
		        }
			
				return filteredArray;
				
		    }
}

