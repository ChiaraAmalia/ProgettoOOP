package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

public class Entities implements ToString{
	
	private ArrayList<Hashtag> hashtags = new ArrayList<Hashtag>();
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
	public Entities(ArrayList<Hashtag> hashtags, ArrayList<UserMentions> mentions, ArrayList<urls> url,
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
	public ArrayList<Hashtag> getHashtags() {
		return this.hashtags;
	}

	/**
	 * @param hashtags the hashtags to set
	 */
	public void setHashtags(Hashtag newHashtag) {
		hashtags.add(newHashtag);
	}

	/**
	 * @return the mentions
	 */
	public ArrayList<UserMentions> getMentions() {
		return this.mentions;
	}

	/**
	 * @param mentions the mentions to set
	 */
	public void setMentions(UserMentions newMention) {
		mentions.add(newMention);
	}

	/**
	 * @return the url
	 */
	public ArrayList<urls> getUrl() {
		return this.url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(urls newUrl) {
		url.add(newUrl);
	}

	/**
	 * @return the images
	 */
	public ArrayList<Image> getImages() {
		return this.images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(Image newImage) {
		images.add(newImage);
	}

	@Override
	public String toString() {
		return "\nEntities: [\n hashtags=" + hashtags + "\n mentions=" + mentions + "\n url=" + url 
				+ "\n images=" + images + "\n ]";
	}
	
}
