package it.univpm.ProgettoOOP.model;

/**
 * Questa classe permette di visualizzare gli hashtag presenti nel testo del tweet.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Hashtag {
	
	private String text;

	/**
	 * @param testo indicate il testo dell'hashtag
	 * il costruttore
	 */
	public Hashtag(String text) {
		super();
		this.text = text;
	}

	/**
	 * il costruttore senza campi
	 */
	public Hashtag() {
		super();
	}
	
	/**
	 * @return testo
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param testo 
	 * permette di modificare il testo dell'hashtag
	 */
	public void setText(String text) {
		this.text = text;
	}
	
}
