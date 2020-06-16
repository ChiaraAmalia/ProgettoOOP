package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

/**
 * Questa classe contiene le caratteristiche principali dell'immagine condivisa nel tweet come
 * ad esempio l'id dell'immagine e l'url dell'immagine.
 * Inoltre contiene anche le dimensioni dell'immagine
 * Viene estesa dalla classe ID
 * @see ID
 * @see Dimensions
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class Image extends ID {
	
	private String media_url;
	private String type;
	private ArrayList<Dimensions> size = new ArrayList<Dimensions>();


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
	 * @return il tipo dell'immagine
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type
	 * il tipo della foto viene settato a un nuovo valore
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return size
	 * le dimensioni dell'immagine
	 */
	public ArrayList<Dimensions> getSize() {
		return size;
	}


	/**
	 * @param newSize
	 * le dimensioni delle immagini vengono settate a un nuovo valore
	 */
	public void setSize(Dimensions newSize) {
		size.add(newSize);
	}

	
}
