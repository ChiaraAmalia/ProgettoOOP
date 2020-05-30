package it.univpm.ProgettoOOP.model;

public class Image extends ID implements ToString{
	
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
	public String toString() {
		return "Image: [\n idImage=" + idImage + "\n media_url=" + media_url + "\n]";
	}
	
	
}
