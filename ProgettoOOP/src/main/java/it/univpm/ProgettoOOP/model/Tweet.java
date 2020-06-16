package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

/**
 * Questa classe contiene le principali caratteristiche di un Tweet tra cui
 * l'id del tweet, la data e l'ora di pubblicazione, il testo del tweet
 * le entita' del tweet, l'user che ha scritto il tweet, il numero di retweet e la lingua
 * in cui è scritto il tweet. Viene estesa dalla classe ID
 * @see ID
 * @see Entities
 * @see User
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */

public class Tweet  extends ID {
	
	private String created_at;
	private String text;
	private ArrayList<Entities> entities = new ArrayList<Entities>();
	private ArrayList<User> user = new ArrayList<User>();
	private long retweet_count;
	private String lang;
	
	
	public Tweet() {
		super();
	}
	
	/**
	 * @return il campo dataOra
	 */
	public String getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at 
	 * viene settato ad un altro valore
	 */
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return il testo del tweet
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text 
	 * viene settato ad un altro valore
	 */
	public void setText(String text) {
		this.text = text;
	}	

	/**
	 * @return retweet_count
	 * il numero di retweet
	 */
	public long getRetweet_count() {
		return retweet_count;
	}

	/**
	 * @param retweet_count
	 * modifica il numero di retweet
	 */
	public void setRetweet_count(long retweet_count) {
		this.retweet_count = retweet_count;
	}
	

	/**
	 * @return le entities
	 */
	public ArrayList<Entities> getEntities() {
		return this.entities;
	}

	/**
	 * @param newEnties 
	 * le nuove entita' vengono aggiunte all'array entities
	 */
	public void setEntities(Entities newEntities) {
		entities.add(newEntities);
	}

	/**
	 * @return user
	 * l'autore del tweet
	 */
	public ArrayList<User> getUsers() {
		return this.user;
	}

	/**
	 * @param newUser
	 * viene aggiunto l'autore del tweet
	 */
	public void setUsers(User newUser) {
		user.add(newUser);
	}
	
	/**
	 * @return lang
	 * lingua del tweet
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * @param lang
	 * viene aggiornata la lingua del tweet
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}

}
