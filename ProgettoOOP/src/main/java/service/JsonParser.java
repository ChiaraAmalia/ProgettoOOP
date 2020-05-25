package service;

import java.util.ArrayList;
import java.util.Map;

public class JsonParser {
	
	/**Effettua il parsing dei dati esterni (Campo da analizzare)
	  @param filtro da applicare
	  @return ArrayList di Tweet filtrati
	 */
	public static ArrayList <Tweet> JsonPArserColumn(Object filter){
		throws InternalGeneralException, FilterNotFoundException, FilterIllegalArgumentException{
			ArrayList <Tweet> previousArray= new ArrayList <Tweet>();                     
			ArrayList <Tweet> filteredArray= new ArrayList <Tweet>();                           //vedere se posso anche non istanziarlo quì
			HashMap <String,Object> reesult= new ObjectMapper().convertValue(filter,HashMap.Class);
			
			//Itera con tutti gli elementi dell'ArrayList
			for(Map.Entry<String, Object> entry: result.entrySet()) {
				ArrayList <Tweet> previousArray=new ArrayList<Tweet>();
				Object filterParam=entry.getValue();
				Object column=entry.getKey();
				try {
					filteredArray=ssonParserOperator(column,filterPAram,previousArray);
				}catch (Security Exception e)
				throw new InternalGeneralException ("Error in I/O parsing information");
				
			}
		}
		
	}
	public static ArrayList<Tweet> jsonParserOperator (String column,Object filterParam,ArrayList<Tweet> previousArray)
			throws InternalGeneralException, FilterNotFoundException, FilterIllegalArgumentException{
		
		
	}

}
