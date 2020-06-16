package it.univpm.ProgettoOOP.model;

/**
 * Questa classe indica gli url presenti all'interno del tweet
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class urls {
	
	private String Url;
	private String ExpandedUrl;

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
	 * @param Url 
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
