package it.univpm.ProgettoOOP.model;

/**
 * Questa classe contiene le caratteristiche principali dell'immagine condivisa nel tweet come
 * ad esempio l'id dell'immagine e l'url dell'immagine.
 * Viene estesa dalla classe ID
 * @see ID
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Image extends ID {
	
	private long idImage;
	private String media_url;
		
	/**
	 * @param idImage rappresenta l'id dell'immagine
	 * @param media_url rappresenta l'url dell'immagine
	 */
	public Image(long idImage, String media_url) {
		super(idImage);
		this.media_url = media_url;
	}


	/**
	 * il costruttore senza campi
	 */
	public Image() {
		super();
	}
	

	/**
	 * @return media_url
	 */
	public String getMedia_url() {
		return media_url;
	}



	/**
	 * @param media_url 
	 * permette di modificare l'url dell'immagine
	 */
	public void setMedia_url(String media_url) {
		this.media_url = media_url;
	}

	/**
	 * @return una stringa dove vengono visualizzate le caratteristiche dell'immagine
	 */
	@Override
	public String Visualizza() {
		String stamp= "Image: [\n idImage=" + idImage + "\n media_url=" + media_url + "\n]";
		return stamp;
	}
	
	
}
