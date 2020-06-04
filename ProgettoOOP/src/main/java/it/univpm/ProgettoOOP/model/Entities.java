package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

/**
 * La classe Entities contiene diversi arraylist contenenti gli hashtag, gli userMentions
 * l'url citato nel tweet e la relativa immagine contenuta nel tweet.
 * @see Hashtag
 * @see UserMentions
 * @see urls
 * @see Image
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Entities {
	
	private ArrayList<Hashtag> hashtags = new ArrayList<Hashtag>();
	private ArrayList<UserMentions> mentions = new ArrayList<UserMentions>();
	private ArrayList<urls> Url = new ArrayList<urls>();
	private ArrayList<Image> image = new ArrayList<Image>();
	
	/**
	 * 
	 * @param hashtags riguarda un arraylist contenenti tutti gli hashtag citati nel tweet
	 * @param mentions riguarda tutti gli utenti menzionati nel tweet
	 * @param url riguarda l'url presente nel corpo del tweet
	 * @param images riguarda un arraylist contenente tutte le caratteristiche dell'immagine
	 * 
	 * il costruttore
	 */
	public Entities(ArrayList<Hashtag> hashtags, ArrayList<UserMentions> mentions, ArrayList<urls> Url,
					ArrayList<Image> image) {
		
		super();
		this.hashtags = hashtags;
		this.mentions = mentions;
		this.Url = Url;
		this.image = image;
	}
	
	/**
	 * costruttore senza campi
	 */
	public Entities() {
	}

	/**
	 * @return hashtags
	 * gli hashtag presenti nel tweet
	 */
	public ArrayList<Hashtag> getHashtags() {
		return this.hashtags;
	}

	/**
	 * @param hashtags 
	 * permette di aggiungere hashtag all'array
	 */
	public void setHashtags(Hashtag newHashtag) {
		hashtags.add(newHashtag);
	}

	/**
	 * @return mentions
	 * gli account citati nel tweet
	 */
	public ArrayList<UserMentions> getMentions() {
		return this.mentions;
	}

	/**
	 * @param mentions
	 * permette di aggiungere all'array gli account citati
	 */
	public void setMentions(UserMentions newMention) {
		mentions.add(newMention);
	}

	/**
	 * @return url
	 */
	public ArrayList<urls> getUrl() {
		return this.Url;
	}

	/**
	 * @param url 
	 * permette di aggiungere l'url presente nel tweet
	 */
	public void setUrl(urls newUrl) {
		Url.add(newUrl);
	}

	/**
	 * @return l'immagine
	 */
	public ArrayList<Image> getImages() {
		return this.image;
	}

	/**
	 * @param images 
	 * permette di aggiungere l'immagine contenuta nel tweet
	 */
	public void setImages(Image newImage) {
		
		image.add(newImage);
	}
	
}
