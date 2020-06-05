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

//import com.fasterxml.jackson.core.JsonParser;
import it.univpm.ProgettoOOP.service.JsonParser;
import it.univpm.ProgettoOOP.Exception.FilterIllegalArgumentException;
import it.univpm.ProgettoOOP.Exception.FilterNotFoundException;
import it.univpm.ProgettoOOP.Exception.InternalGeneralException;
import it.univpm.ProgettoOOP.database.DatabaseClass;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.service.TweetService;

/** Classe che si occupa di effettuare le chiamate al Server.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 */
@RestController
public class ControllerClass {
	/*
	 * Autowired consente, all'interno del controller, di creare 
	 * un'istanza del nostro servizio che protremo utilizzare per 
	 * tutte le operazioni
	 */
	@Autowired
	TweetService tweetService;
	
	/** Risponde alla richiesta GET /timeline
	 * @return ArrayList di oggetti Tweet
	 */
	@RequestMapping(value="/timeline", method = RequestMethod.GET)
	public ResponseEntity<Object> getTweets() {
		return new ResponseEntity<>(tweetService.getTweet(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadatas() {
		return new ResponseEntity<>(tweetService.getMetada(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/filtered",method=RequestMethod.POST) 
	public ResponseEntity<Object> getFilteredWithPost(@RequestBody Object filter)
			 throws InternalParseException, FilterNotFoundException, FilterIllegalArgumentException, InternalGeneralException { 
	         return new ResponseEntity<>(JsonParser.JsonParserColumn(filter), HttpStatus.CREATED);
	       }
	
		
	}
	

