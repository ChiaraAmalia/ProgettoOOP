package it.univpm.ProgettoOOP.model;

/**
 * Questa classe indica l'url presente all'interno del tweet
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class urls {
	
	private String Url;
	private String ExpandedUrl;
	
	/**
	 * @param url indica l'url
	 * @param expanded_url indica l'url in forma estesa
	 * il costruttore
	 */
	public urls(String Url, String expandedUrl) {
		super();
		this.Url = Url;
		ExpandedUrl = expandedUrl;
	}
	
	/**
	 * il costruttore senza campi
	 */
	public urls() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return Url;
	}

	/**
	 * @param url 
	 * permette di modificare l'url
	 */
	public void setUrl(String Url) {
		this.Url = Url;
	}

	/**
	 * @return expandedUrl
	 */
	public String getExpandedUrl() {
		return ExpandedUrl;
	}

	/**
	 * @param expandedUrl 
	 * permette di modificare l'url esteso
	 */
	public void setExpandedUrl(String expandedUrl) {
		ExpandedUrl = expandedUrl;
	}
	
}
