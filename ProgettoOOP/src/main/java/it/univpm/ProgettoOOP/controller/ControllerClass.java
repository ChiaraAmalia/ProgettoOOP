package it.univpm.ProgettoOOP.controller;

import java.util.ArrayList;
import java.util.Collection;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.univpm.ProgettoOOP.service.JSONParse;
import it.univpm.ProgettoOOP.service.JsonParser;
import it.univpm.ProgettoOOP.service.StatsService;
import it.univpm.ProgettoOOP.Exception.FilterIllegalArgumentException;
import it.univpm.ProgettoOOP.Exception.FilterNotFoundException;
import it.univpm.ProgettoOOP.Exception.InternalGeneralException;
import it.univpm.ProgettoOOP.Exception.StatsNotFoundException;
import it.univpm.ProgettoOOP.database.DatabaseClass;
import it.univpm.ProgettoOOP.model.Stats;
import it.univpm.ProgettoOOP.model.Tweet;
import it.univpm.ProgettoOOP.service.TweetService;
import it.univpm.ProgettoOOP.util.other.StatsCalculator;

/** Classe che si occupa di effettuare le chiamate al Server.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 * @see TweetService
 * @see TweetServiceImpl
 * @see JsonParser
 * 
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
	
	/** 
	 * Risponde alla richiesta GET /data
	 * @return ArrayList di 100 Tweet
	 * permette di visualizzre gli ultimi 100 tweet
	 */
	@RequestMapping(value="/data", method = RequestMethod.GET)
	public ResponseEntity<Object> getTweets() {
		return new ResponseEntity<>(tweetService.getTweet(), HttpStatus.OK);
	}
	
	/**
	 * Risponde alla richiesta GET /metadata
	 * @return ArrayList di informazioni riguardanti i vari campi
	 */
	@RequestMapping(value="/metadata", method = RequestMethod.GET)
	public ResponseEntity<Object> getMetadatas() {
		return new ResponseEntity<>(tweetService.getMetada(), HttpStatus.OK);
	}
	
	/**
	 * Risponde alla richiesta POST /data
	 * @param filter
	 * @return un ArrayList di tweet filtrato 
	 * @throws InternalParseException
	 * @throws FilterNotFoundException
	 * @throws FilterIllegalArgumentException
	 * @throws InternalGeneralException
	 * 
	 */
	
	@RequestMapping(value="/data",method=RequestMethod.POST) 
	public ResponseEntity<Object> getFilteredWithPost(@RequestBody Object filter)
			 throws InternalParseException, FilterNotFoundException, FilterIllegalArgumentException, InternalGeneralException { 
	         return new ResponseEntity<>(JsonParser.JsonParserColumn(filter), HttpStatus.CREATED);
	       }
	
	@RequestMapping(value = "stats", method=RequestMethod.GET)
	public Stats getStats(@RequestParam(value = "field") String column) 
	throws InternalGeneralException, StatsNotFoundException, FilterNotFoundException, FilterIllegalArgumentException {
		
		ArrayList<Tweet> tweets = JSONParse.ParseInformazioni();
		StatsCalculator sc = StatsService.instanceStatsCalculator(column, tweets);
		return sc.run();
	}
	
		
	}
	

