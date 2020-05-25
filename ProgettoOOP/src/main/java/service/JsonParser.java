package service;

import java.util.ArrayList;
import java.util.Map;

public class JsonParser {
	public static ArrayList <Tweet> JsonPArserColumn(Object filter){
		throws InternalGeneralException, FilterNotFoundException, FilterIllegalArgumentException{
			ArrayList <Tweet> previousArray= new ArrayList <Tweet>();                     //vedere se posso anche non istanziarlo quì
			ArrayList <Tweet> filteredArray= new ArrayList <Tweet>();
			HashMap <String,Object> reesult= new ObjectMapper().convertValue(filter,HashMap.Class);
			
			//Itera con tutti gli elementi dell'ArrayList
			for(Map.Entry<String, Object> entry: result.entrySet()) {
				
			}
		}
		
	}
	

}
