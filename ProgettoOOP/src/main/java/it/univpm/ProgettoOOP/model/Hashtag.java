package it.univpm.ProgettoOOP.model;

/**
 * Questa classe permette di visualizzare gli hashtag presenti nel testo del tweet.
 * Viene implementata l'interfaccia ToString da cui viene utilizzato il metodo Visualizza()
 * @see ToString
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Hashtag implements ToString{
	
	private String testo;

	/**
	 * @param testo indicate il testo dell'hashtag
	 * il costruttore
	 */
	public Hashtag(String testo) {
		super();
		this.testo = testo;
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
	public String getTesto() {
		return testo;
	}

	/**
	 * @param testo 
	 * permette di modificare il testo dell'hashtag
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}

	/**
	 * @return una stringa con il testo dell'hashtag
	 */
	@Override
	public String Visualizza() {
		String stamp="\n Hashtag: [\n testo=" + testo + "]";
		return stamp;
	}
	
	

	
}
