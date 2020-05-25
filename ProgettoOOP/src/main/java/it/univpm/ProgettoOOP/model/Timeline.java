package it.univpm.ProgettoOOP.model;

import java.util.ArrayList;

public class Timeline {
		
	private ArrayList<Tweet> timeline;
	
	/**
	 * @param timeline
	 */
	public Timeline(ArrayList<Tweet> timeline) {
		super();
		this.timeline = timeline;
	}

	public void inseriscitweet(Tweet t) {
		timeline.add(t);
	}
	
	public Timeline() {
		timeline= new ArrayList<Tweet>();
	}
}