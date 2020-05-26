package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

public class Entities {
	
	private ArrayList<String> hashtags = new ArrayList<String>();
	private ArrayList<UserMentions> mentions = new ArrayList<UserMentions>();
	private ArrayList<urls> url = new ArrayList<urls>();
	private ArrayList<Image> images = new ArrayList<Image>();
	
	/**
	 * 
	 * @param hashtags
	 * @param mentions
	 * @param url
	 * @param images
	 * 
	 * the constructor
	 */
	public Entities(ArrayList<String> hashtags, ArrayList<UserMentions> mentions, ArrayList<urls> url,
					ArrayList<Image> images) {
		
		super();
		this.hashtags = hashtags;
		this.mentions = mentions;
		this.url = url;
		this.images = images;
	}

	public Entities() {
	}

	/**
	 * @return the hashtags
	 */
	public ArrayList<String> getHashtags() {
		return hashtags;
	}

	/**
	 * @param hashtags the hashtags to set
	 */
	public void setHashtags(ArrayList<String> hashtags) {
		this.hashtags = hashtags;
	}

	/**
	 * @return the mentions
	 */
	public ArrayList<UserMentions> getMentions() {
		return mentions;
	}

	/**
	 * @param mentions the mentions to set
	 */
	public void setMentions(ArrayList<UserMentions> mentions) {
		this.mentions = mentions;
	}

	/**
	 * @return the url
	 */
	public ArrayList<urls> getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(ArrayList<urls> url) {
		this.url = url;
	}

	/**
	 * @return the images
	 */
	public ArrayList<Image> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(ArrayList<Image> images) {
		this.images = images;
	}

	@Override
	public String toString() {
		return "\nEntities[\n hashtags=" + hashtags + "\n mentions=" + mentions + "\n url=" + url 
				+ "\n images=" + images + "\n ]";
	}
	
}
