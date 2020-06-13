package it.univpm.ProgettoOOP.model;

/**
 * Questa classe permette di visualizzare gli hashtag presenti nel testo del tweet.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Hashtag {
	
	private String text;

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
