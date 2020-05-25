package it.univpm.ProgettoOOP.controller;

import java.util.ArrayList;

/** Classe che si occupa di effettuare le chiamate al Server.
 * @author Piero Campitelli
 * @author Chiara Amalia Caporusso
 */
@RestController
public class ControllerClass {
/** Risponde alla richiesta GET /tweet 
 * @return ArrayList di oggetti Tweet
 */
	@RequestMapping(valure="tweet",method=RequestMethod.GET)
	public ArrayList<Tweet> getTweet(){
		return DatabaseClass.getTweet;
	}
	

}
