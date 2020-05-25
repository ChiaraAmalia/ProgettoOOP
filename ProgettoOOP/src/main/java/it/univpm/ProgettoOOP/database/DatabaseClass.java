package it.univpm.ProgettoOOP.database;

import java.util.ArrayList;

import it.univpm.ProgettoOOP.model.Tweet;

public class DatabaseClass {
	public static ArrayList<Tweet> tweets= new ArrayList <Tweet>();
	
public static ArrayList<Tweet> getTweet(){
	return tweets;
  }


}
