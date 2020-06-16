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

/**
 * Rappresenta la classe statica che effettua il parsing ricorsivo su un 
 * oggetto di tipo JSON
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 * @see Tweet
 *
 */

public class JsonParser {
	
	/**
	 * Effettua il parsing piu esterno, selezionando il valore colonna
	 * e un oggetto valore, che contiene il filtro da applicare al dataset
	 * ed eventualmente il Type con cui aggiungere il filtro ai precedenti.
	 * @param filter contiene il JSON con le informazioni sul filtraggio
	 * @return Un ArrayList di Tweet filtrato
	 * @throws InternalGeneralException se vengono generati errori generali interni al server.
	 * @throws FilterNotFoundException se vengono generati errori di filtro non trovato.
	 * @throws FilterIllegalArgumentException  se vengono generati errori di parametro non valido in ingresso al filtro.
	 */
	public static ArrayList<Tweet> JsonParserColumn(Object filter)
			throws InternalGeneralException, FilterNotFoundException, FilterIllegalArgumentException{ 
				ArrayList<Tweet> previousArray= new ArrayList<Tweet>();
				ArrayList<Tweet> filteredArray= new ArrayList<Tweet>();
				HashMap<String,Object> result= new ObjectMapper().convertValue(filter, HashMap.class);

			//Itera con tutti gli elementi dell'ArrayList
				for(Map.Entry<String, Object> entry: result.entrySet()) {
					//ad ogni ciclo ripulisce l array "filteredArray"
					//il vecchio filteredArray diventa Garbage (oggetto senza riferimento)
					filteredArray= new ArrayList<Tweet>();
					String column=entry.getKey();
					Object filterParam=entry.getValue();
					try {
							filteredArray=jsonParserOperator(column, filterParam, previousArray);
					}catch (SecurityException e) {
						throw new InternalGeneralException ("Error in I/O parsing information");
					}
					//ripulisce "previousArray" prima di riempirlo con "filteredArray"
				    //il previousArray precedente diventa Garbage (oggetto senza riferimento)
					previousArray=new ArrayList<Tweet>();
					previousArray.addAll(filteredArray);
				}
				return filteredArray;
			}
	
	/**
	 * Effettua il parsing piu interno, selezionando l operatore e il parametro
	 * per il filtraggio e lancia il filtro corrispondente alla richiesta.
	 * @param column rappresenta il campo su cui si vuole effettuare il filtraggio.
	 * @param filterParam contiene i parametri di filtraggio.
	 * @param previousArray rappresenta l'ArrayList ottenuto dai filtraggi precedenti relativi ad altre colonne.
	 * @return Un ArrayList di Tweet filtrato
	 * @throws InternalGeneralException se vengono generati errori generali interni al server.
	 * @throws FilterNotFoundException se vengono generati errori di filtro non trovato.
	 * @throws FilterIllegalArgumentException se vengono generati errori di parametro non valido in ingresso al filtro.
	 */
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
		    // Se operatore è Type allora guarda se il valore è 'and' o 'or'
		    // lancia il metodo runfilter corrispondente
			if(operator.equals("type") || operator.equals("Type")) {
				if(operator.equals("type")) {

					throw new FilterIllegalArgumentException(" Type must be 'T' caps ");

				}
				type=(String) value;
				if(!(value.equals("and"))&&!(value.equals("or"))) {
					throw new FilterIllegalArgumentException("'and' o 'or' expected after 'type'");
		    	}
		    	continue;
		    } 
			filter= FilterService.instanceFilter(column, operator, value);
			if (type.equals("and"))
				filteredArray = FilterService.runFilterAND(filter, previousArray);
			else 
				filteredArray = FilterService.runFilterOR(filter, previousArray);
		}
		return filteredArray;
	}			
}


