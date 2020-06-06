package it.univpm.ProgettoOOP.model;


/**
 * Questa classe ci permette di visualizzare le caratteristiche principali dell'utente
 * che ha scritto il tweet, tra cui il suo id, il nome completo, lo screen_name che indica 
 * il nome utente, la descrizione sul profilo e il numero di follower.
 * Questa classe viene estesa dalla classe ID
 * @see ID
 * @author Chiara Amalia Caporusso
 *
 */
public class User extends ID {
	
	private long id;
	private String name;
	private String ScreenName;
	private String description;
	private long FollowerCount;
	
	/**
	 * il costruttore senza campi
	 */
	public User() {
		super();
	}


	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * modifica il nome completo dell'utente
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return screenName
	 */
	public String getScreenName() {
		return ScreenName;
	}

	/**
	 * @param screenName
	 * modifica il nome utente
	 */
	public void setScreenName(String screenName) {
		ScreenName = screenName;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description 
	 * modifica la bio dell'utente
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return followerCount
	 */
	public long getFollowerCount() {
		return FollowerCount;
	}

	/**
	 * @param followerCount 
	 * modifica il numero di seguaci
	 */
	public void setFollowerCount(long followerCount) {
		FollowerCount = followerCount;
	}
	
}
