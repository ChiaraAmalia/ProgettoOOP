package it.univpm.ProgettoOOP.service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.univpm.ProgettoOOP.Exception.FilterIllegalArgumentException;
import it.univpm.ProgettoOOP.Exception.FilterNotFoundException;
import it.univpm.ProgettoOOP.Exception.InternalGeneralException;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.service.FilterService;
import it.univpm.ProgettoOOP.util.other.Filter;

public class JsonParser {
	
	
	/**Effettua il parsing dei dati esterni (Campo da analizzare)
	  @param filtro da applicare
	  @return ArrayList di Tweet filtrati
	 * @throws InternalGeneralException
	 * @throws  FilterNotFoundException 
	 * @throws FilterIllegalArgumentException 
	 */
	public static ArrayList<Tweet> JsonParserColumn(Object filter)
			throws InternalGeneralException, FilterNotFoundException, FilterIllegalArgumentException{ 
				ArrayList<Tweet> previousArray= new ArrayList<Tweet>();
				ArrayList<Tweet> filteredArray= new ArrayList<Tweet>();
			//vedere se posso anche non istanziarlo quì
				HashMap<String,Object> result= new ObjectMapper().convertValue(filter, HashMap.class);

			//Itera con tutti gli elementi dell'ArrayList
				for(Map.Entry<String, Object> entry: result.entrySet()) {
					filteredArray= new ArrayList<Tweet>();
					String column=entry.getKey();
					Object filterParam=entry.getValue();
					try {
							filteredArray=jsonParserOperator(column, filterParam, previousArray);
					}catch (SecurityException e) {
						throw new InternalGeneralException ("Error in I/O parsing information");
					}
					
					previousArray=new ArrayList<Tweet>();
					previousArray.addAll(filteredArray);
				}
				return filteredArray;
			}
	
	
	public static  ArrayList<Tweet> jsonParserOperator (String column,Object filterParam,
			                                          ArrayList<Tweet> previousArray)
			throws InternalGeneralException, FilterNotFoundException, FilterIllegalArgumentException {
		String type="";
		Filter filter;
		ArrayList<Tweet> filteredArray= new ArrayList <Tweet>();
		HashMap<String, Object> result= new ObjectMapper().convertValue(filterParam,HashMap.class);
		for(Map.Entry<String, Object> entry: result.entrySet()) {
			String operator= entry.getKey();
			Object value=entry.getValue();
			if(operator.equals("type") || operator.equals("Type")) {
				type=(String) value;
				if(!(value.equals("and"))&&!(value.equals("or"))) {
					throw new FilterIllegalArgumentException("'and' o 'or' expected after 'type'");
		    	}
		    	continue;
		    }
			
			filter= FilterService.instanceFilter(column, operator, value);
			
			if (type == "and")
				filteredArray = FilterService.runFilterAND(filter, previousArray);
			else 
				filteredArray = FilterService.runFilterOR(filter, previousArray);
		
		}
		
		return filteredArray;
		
	}
				
}

