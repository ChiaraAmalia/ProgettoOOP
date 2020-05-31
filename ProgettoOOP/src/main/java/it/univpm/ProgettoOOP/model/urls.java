package it.univpm.ProgettoOOP.model;

public class urls implements ToString{
	
	private String url;
	private String ExpandedUrl;
	
	/**
	 * @param url
	 * @param expanded_url
	 * the constructor
	 */
	public urls(String url, String expandedUrl) {
		super();
		this.url = url;
		ExpandedUrl = expandedUrl;
	}
	

	/**
	 * th constructor without fields
	 */
	public urls() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the expandedUrl
	 */
	public String getExpandedUrl() {
		return ExpandedUrl;
	}

	/**
	 * @param expandedUrl the expandedUrl to set
	 */
	public void setExpandedUrl(String expandedUrl) {
		ExpandedUrl = expandedUrl;
	}

	
	public String Visualizza() {
		 String stamp = "urls[\n url=" + url + "\n ExpandedUrl=" + ExpandedUrl + "\n ]";
		 return stamp;
	}
	
}
