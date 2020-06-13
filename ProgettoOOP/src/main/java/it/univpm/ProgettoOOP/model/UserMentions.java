package it.univpm.ProgettoOOP.model;

/**
 * Questa classe rappresenta gli utenti che vengono menzionati nei tweet con le loro principali
 * caratteristiche come il nome utente, il nome completo dell'utente e il loro id.
 * Questa classe estende la classe ID
 * @see ID
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class UserMentions extends ID {
	
	private String ScreenName;
	private String name;

	public UserMentions() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the screenName
	 */
	public String getScreenName() {
		return ScreenName;
	}
	/**
	 * @param screenName 
	 * permette di modificare il nome utente
	 */
	public void setScreenName(String screenName) {
		ScreenName = screenName;
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 * permette di modificare il nome completo dell'utente
	 */
	public void setName(String name) {
		this.name = name;
	}

}
