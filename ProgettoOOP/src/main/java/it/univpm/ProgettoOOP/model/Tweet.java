package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

/**
 * 
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */

public class Tweet {
	
	private String dataOra;
	private int idTweet;
	private String testo;
	private ArrayList<Entities> entities = new ArrayList<Entities>();
	private ArrayList<User> users = new ArrayList<User>();
	private boolean retweeted;
	
	/**
	 * 
	 * @param dataOra
	 * @param idTweet
	 * @param testo
	 * @param entities
	 * @param users
	 * 
	 * the constructor
	 */
	public Tweet(String dataOra, int idTweet, String testo, ArrayList<Entities> entities,
				ArrayList<User> users, boolean retweeted) {
		
		super();
		this.dataOra = dataOra;
		this.idTweet = idTweet;
		this.testo = testo;
		this.entities = entities;
		this.users = users;
		this.retweeted = retweeted;
	}

	public Tweet() {
		super();
	}
	
	/**
	 * @return the dataOra
	 */
	public String getDataOra() {
		return dataOra;
	}

	/**
	 * @param dataOra the dataOra to set
	 */
	public void setDataOra(String dataOra) {
		this.dataOra = dataOra;
	}

	/**
	 * @return the idTweet
	 */
	public int getIdTweet() {
		return idTweet;
	}

	/**
	 * @param idTweet the idTweet to set
	 */
	public void setIdTweet(int idTweet) {
		this.idTweet = idTweet;
	}

	/**
	 * @return the testo
	 */
	public String getTesto() {
		return testo;
	}

	/**
	 * @param testo the testo to set
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}

	/**
	 * @return the entities
	 */
	public ArrayList<Entities> getEntities() {
		return entities;
	}

	/**
	 * @param entities the entities to set
	 */
	public void setEntities(ArrayList<Entities> entities) {
		this.entities = entities;
	}

	/**
	 * @return the users
	 */
	public ArrayList<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	/**
	 * @return the retweeted
	 */
	public boolean isRetweeted() {
		return retweeted;
	}

	/**
	 * @param retweeted the retweeted to set
	 */
	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}

	@Override
	public String toString() {
		return "\nTweet[\n dataOra=" + dataOra + "\n idTweet=" + idTweet + "\n testo=" + testo + "\n entities=" + entities
				+ "\n users=" + users + "\n retweeted" + retweeted + "\n ]";
		
	}
	
	
}
