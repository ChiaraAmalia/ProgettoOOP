package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

/**
 * Questa classe viene utilizzata per salvare il numero di hashtag per ogni tweet con il relativo 
 * hashtag utilizzato un numero di volte da un utente
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */

public class NumeroHashtag {
	
	private int nHashtag;
	private String hash;

	
	public NumeroHashtag(int nHashtag,String hash) {
		super();
		this.nHashtag = nHashtag;
		this.hash = hash;
	}

	public NumeroHashtag() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return nHashtag
	 * il numero di hashtag
	 */
	public int getnHashtag() {
		return nHashtag;
	}

	/**
	 * @param nHashtag
	 * il numero di hashtag settato a un nuovo valore
	 */
	public void setnHashtag(int nHashtag) {
		this.nHashtag = nHashtag;
	}

	/**
	 * @return l'hashtag
	 */
	public String getHashtag() {
		return hash;
	}

	/**
	 * @param newHash
	 * il valore dell'hashtag settato ad un altro valore
	 */
	public void setHashtag(String newHash) {
		this.hash = newHash;
	}
	
}

