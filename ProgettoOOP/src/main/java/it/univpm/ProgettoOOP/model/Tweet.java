package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

/**
 * 
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */

public class Tweet  extends ID implements ToString{
	
	private int idTweet;
	private String dataOra;
	private String testo;
	private ArrayList<Entities> entities = new ArrayList<Entities>();
	private ArrayList<User> users = new ArrayList<User>();
	private boolean retweeted;

	/**
	 * @param idTweet
	 * @param dataOra
	 * @param testo
	 * @param entities
	 * @param users
	 * @param retweeted
	 */
	public Tweet(int idTweet, String dataOra, String testo, ArrayList<Entities> entities, ArrayList<User> users,
			boolean retweeted) {
		super(idTweet);
		this.idTweet = idTweet;
		this.dataOra = dataOra;
		this.testo = testo;
		this.entities = entities;
		this.users = users;
		this.retweeted = retweeted;
	}
	
	/**
	 * the constructor
	 */
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
	


	/**
	 * @return the entities
	 */
	public ArrayList<Entities> getEntities() {
		return this.entities;
	}

	/**
	 * @param entities the entities to set
	 */
	public void setEntities(Entities newEntities) {
		entities.add(newEntities);
	}

	/**
	 * @return the users
	 */
	public ArrayList<User> getUsers() {
		return this.users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(User newUsers) {
		users.add(newUsers);
	}
	
/*	public String toString() {
		return "\nTweet[\n dataOra=" + dataOra + "\n idTweet=" + idTweet + "\n testo=" + testo  
				+"\n entities=" + entities+ "\n users=" + users +"\n retweeted" + retweeted + "\n ]";
		
	}*/
	
	@Override
	public String toString() {
		return "\nTweet[\n dataOra=" + dataOra + "\n idTweet=" + idTweet + "\n testo=" + testo  
				+ "\n retweeted" + retweeted +"\n ]";
		
	}
}
