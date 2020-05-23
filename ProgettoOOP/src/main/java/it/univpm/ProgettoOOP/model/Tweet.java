package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

public class Tweet {
	
	protected String dataOra;
	protected int idTweet;
	protected String testo;
	protected ArrayList<Entities> entities = new ArrayList<Entities>();
	protected ArrayList<Hashtag> hashtags = new ArrayList<Hashtag>();
	
}
