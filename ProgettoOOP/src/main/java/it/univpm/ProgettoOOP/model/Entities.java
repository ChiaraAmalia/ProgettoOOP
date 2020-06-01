package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

/**
 * La classe Entities contiene diversi arraylist contenenti gli hashtag, gli userMentions
 * l'url citato nel tweet e la relativa immagine contenuta nel tweet.
 * Implementa l'interfaccia ToString dove ne prende il metodo astratto Visualizza()
 * @see Hashtag
 * @see UserMentions
 * @see urls
 * @see Image
 * @see ToString
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Entities implements ToString{
	
	private ArrayList<Hashtag> hashtags = new ArrayList<Hashtag>();
	private ArrayList<UserMentions> mentions = new ArrayList<UserMentions>();
	private ArrayList<urls> url = new ArrayList<urls>();
	private ArrayList<Image> images = new ArrayList<Image>();
	
	/**
	 * 
	 * @param hashtags riguarda un arraylist contenenti tutti gli hashtag citati nel tweet
	 * @param mentions riguarda tutti gli utenti menzionati nel tweet
	 * @param url riguarda l'url presente nel corpo del tweet
	 * @param images riguarda un arraylist contenente tutte le caratteristiche dell'immagine
	 * 
	 * il costruttore
	 */
	public Entities(ArrayList<Hashtag> hashtags, ArrayList<UserMentions> mentions, ArrayList<urls> url,
					ArrayList<Image> images) {
		
		super();
		this.hashtags = hashtags;
		this.mentions = mentions;
		this.url = url;
		this.images = images;
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
		return this.url;
	}

	/**
	 * @param url 
	 * permette di aggiungere l'url presente nel tweet
	 */
	public void setUrl(urls newUrl) {
		url.add(newUrl);
	}

	/**
	 * @return l'immagine
	 */
	public ArrayList<Image> getImages() {
		return this.images;
	}

	/**
	 * @param images 
	 * permette di aggiungere l'immagine contenuta nel tweet
	 */
	public void setImages(Image newImage) {
		images.add(newImage);
	}
	
	/**
	 * @return stamp
	 * ritorna una stringa dove vengono visualizzati i campi delle entita'
	 */
	@Override
	public String Visualizza() {
		String stamp ="\nEntities: [\n hashtags=" + hashtags + "\n mentions=" + mentions + "\n url=" + url 
				+ "\n images=" + images + "\n ]";
		return stamp;
	}
	
}
