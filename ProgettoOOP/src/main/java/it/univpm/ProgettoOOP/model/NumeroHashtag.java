package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

public class NumeroHashtag {
	
	int nHashtag = 0;
	ArrayList<Hashtag> hash = new ArrayList<Hashtag>();

	/**
	 * @param nHashtag
	 */
	public NumeroHashtag(int nHashtag,ArrayList<Hashtag> hash) {
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
	public ArrayList<Hashtag> getHashtag() {
		return hash;
	}

	/**
	 * @param hashtag the hashtag to set
	 */
	public void setHashtag(Hashtag newHash) {
		hash.add(newHash);
	}
	
	
}
