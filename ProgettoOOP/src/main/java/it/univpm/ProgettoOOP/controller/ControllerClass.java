package it.univpm.ProgettoOOP.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
		return DatabaseClass.getTweet();
	}
	

}
