package it.univpm.ProgettoOOP.model;

public class Image extends ID {
	
	private int idImage;
	private String media_url;
	
	
	/**
	 * the constructor
	 */
	public Image() {
		super();
	}
	

	/**
	 * @return the media_url
	 */
	public String getMedia_url() {
		return media_url;
	}



	/**
	 * @param media_url the media_url to set
	 */
	public void setMedia_url(String media_url) {
		this.media_url = media_url;
	}



	@Override
	public String Visualizza() {
		String stamp= "Image: [\n idImage=" + idImage + "\n media_url=" + media_url + "\n]";
		return stamp;
	}
	
	
}
