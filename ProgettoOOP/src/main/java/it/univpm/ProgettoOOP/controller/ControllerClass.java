package it.univpm.ProgettoOOP.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.InternalParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParser;

import it.univpm.ProgettoOOP.Exception.FilterIllegalArgumentException;
import it.univpm.ProgettoOOP.Exception.FilterNotFoundException;
import it.univpm.ProgettoOOP.database.DatabaseClass;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.service.TweetService;

/** Classe che si occupa di effettuare le chiamate al Server.
 * @author Piero Campitelli
 * @author Chiara Amalia Caporusso
 */
@RestController
public class ControllerClass {
	
	
	TweetService tweetService;
/** Risponde alla richiesta GET /timeline
 * @return ArrayList di oggetti Tweet
 */
	@RequestMapping(value="/timeline")
	public ResponseEntity<Object> getTweet() {
		return new ResponseEntity<>(tweetService.getTweet(), HttpStatus.OK);
	}
	
	@RequestMapping(value="filtered",method=RequestMethod.POST) 
	public ArrayList <Tweet> getFilteredWithPost(@RequestBody Object filter)
			 throws InternalParseException, FilterNotFoundException, FilterIllegalArgumentException {
	         return JsonParser.JsonParserColumn(filter);
	       }
		
	}
	

