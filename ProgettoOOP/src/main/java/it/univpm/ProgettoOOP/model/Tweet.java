package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

/**
 * Questa classe contiene le principali caratteristiche di un Tweet tra cui
 * l'id del tweet, la data e l'ra di pubblicazione, il testo del tweet
 * le entita' del tweet, l'user che ha scrittp il tweet e una variabile booleana
 * che indica se il post è stato retweettato o meno. Viene estesa dalla classe ID
 * @see ID
 * @see Entities
 * @see User
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */

public class Tweet  extends ID {
	
	private long idTweet;
	private String dataOra;
	private String testo;
	private ArrayList<Entities> entities = new ArrayList<Entities>();
	private ArrayList<User> user = new ArrayList<User>();
	private boolean retweeted;

	/**
	 * il costruttore con i campi
	 * 
	 * @param idTweet indica l'id del tweet
	 * @param dataOra indica la data e l'ora di pubblicazione del tweet
	 * @param testo rappresenta il testo del tweet
	 * @param entities è un array contente hashtags, gli UserMentions, gli urls e le immagini
	 * @param users è un array contente le caratteristiche principali dell'autore del tweet
	 * @param retweeted è un valore booleano che indica se il tweet è stato retwettato
	 */
	public Tweet(int idTweet, String dataOra, String testo, ArrayList<Entities> entities, ArrayList<User> user,
			boolean retweeted) {
		super(idTweet);
		this.idTweet = idTweet;
		this.dataOra = dataOra;
		this.testo = testo;
		this.entities = entities;
		this.user = user;
		this.retweeted = retweeted;
	}
	
	/**
	 * il costruttore senza i campi
	 */
	public Tweet() {
		super();
	}
	
	/**
	 * @return il campo dataOra
	 */
	public String getDataOra() {
		return dataOra;
	}

	/**
	 * @param dataOra 
	 * viene settato ad un altro valore
	 */
	public void setDataOra(String dataOra) {
		this.dataOra = dataOra;
	}

	/**
	 * @return il testo del tweet
	 */
	public String getTesto() {
		return testo;
	}

	/**
	 * @param testo 
	 * viene settato ad un altro valore
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}	

	/**
	 * @return retweeted true o false
	 */
	public boolean isRetweeted() {
		return retweeted;
	}

	/**
	 * @param retweeted 
	 * viene settato a true o false
	 */
	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}
	

	/**
	 * @return le entities
	 */
	public ArrayList<Entities> getEntities() {
		return this.entities;
	}

	/**
	 * @param enties 
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
	 * @param user
	 * viene aggiunto l'autore del tweet
	 */
	public void setUsers(User newUser) {
		user.add(newUser);
	}
	
	/**
	 * @return stamp
	 * ritorna una stringa dove vengono visualizzati tutti i campi del tweet
	 */
	@Override
	public String Visualizza() {
		String stamp= "\nTweet[\n dataOra=" + dataOra + "\n idTweet=" + idTweet + "\n testo=" + testo  
				+"\n entities=" + entities+ "\n user=" + user +"\n retweeted" + retweeted + "\n ]";
		return stamp;
	}
}
