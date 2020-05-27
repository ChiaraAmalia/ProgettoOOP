package it.univpm.ProgettoOOP.controller;

import java.util.ArrayList;

import org.springframework.expression.spel.InternalParseException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParser;

import it.univpm.ProgettoOOP.Exception.FilterIllegalArgumentException;
import it.univpm.ProgettoOOP.Exception.FilterNotFoundException;
import it.univpm.ProgettoOOP.database.DatabaseClass;
import it.univpm.ProgettoOOP.model.Tweet;

/** Classe che si occupa di effettuare le chiamate al Server.
 * @author Piero Campitelli
 * @author Chiara Amalia Caporusso
 */
@RestController
public class ControllerClass {
/** Risponde alla richiesta GET /tweet 
 * @return ArrayList di oggetti Tweet
 */
	@RequestMapping(value="tweet",method=RequestMethod.GET)
	public ArrayList<Tweet> getTweet(){
		return Tweet.getTweet();
	}
	
	@RequestMapping(value="filtered",method=RequestMethod.POST) 
	public ArrayList <Tweet> getFilteredWithPost(@RequestBody Object filter)
			 throws InternalParseException, FilterNotFoundException, FilterIllegalArgumentException {
	         return JsonParser.JsonParserColumn(filter);
	       }
		
	}
	

