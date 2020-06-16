package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

public class NumeroHashtag {
	
	private int nHashtag;
//	private ArrayList<Hashtag> hash = new ArrayList<Hashtag>();
	private String hash;

	/**
	 * @param nHashtag
	 */
	public NumeroHashtag(int nHashtag,String hash) {
		super();
		this.nHashtag = nHashtag;
		this.hash = hash;
	}

	/**
	 * 
	 */
	public NumeroHashtag() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nHashtag
	 */
	public int getnHashtag() {
		return nHashtag;
	}

	/**
	 * @param nHashtag the nHashtag to set
	 */
	public void setnHashtag(int nHashtag) {
		this.nHashtag = nHashtag;
	}

	/**
	 * @return the hashtag
	 */
	public String getHashtag() {
		return hash;
	}

	/**
	 * @param hashtag the hashtag to set
	 */
	public void setHashtag(String newHash) {
//		hash.add(newHash);
		this.hash = newHash;
	}
	
	/**
	 * Viene utilizzato per confrontare l'uguaglianza tra due hashtag
	 * @param n oggetto di tipo NumeroHashtag
	 * @return hash
	 */
	public boolean equals(NumeroHashtag n) {
		if (n == this) {
			return true;
		}
		if (!(n instanceof NumeroHashtag)) {
			return false;
		}
		NumeroHashtag Hash = (NumeroHashtag) n;
		return this.hash.equals(Hash.hash);
	}

	public int hashCode() {
		return hash.hashCode();
	}
}

