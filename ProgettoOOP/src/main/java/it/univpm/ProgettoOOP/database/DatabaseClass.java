package it.univpm.ProgettoOOP.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
//import org.json.simple.parser.ParseException;

import it.univpm.ProgettoOOP.model.*;

public class DatabaseClass {
	
	
//	public static String[] downloadJSON() {
//	public static JSONArray downloadJSON() {
//	public static String[] downloadJSON(String args) {
	public static JSONObject downloadJSON() {
		
		String data = "";
		String line = "";
//		String url = "";
		String url = "https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/home_timeline.json?count=100&include_rts=false&tweet_mode=extended";
/*		if(args.length == 1) {
			url = args[0]; //Url by args ;-)
		}
		else
		{
			return;
		}*/
		try {
			
			URLConnection openConnection = new URL(url).openConnection();
			openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			InputStream in = openConnection.getInputStream();
			
			try {
				
				InputStreamReader inR = new InputStreamReader( in );
				BufferedReader buf = new BufferedReader( inR );
				  
				while ( ( line = buf.readLine() ) != null ) {
					data+= line;
				}
				
			}finally {
				in.close();
			} 
			
//		JSONArray json = (JSONArray) JSONValue.parse(data);
//		JSONObject obj = (JSONObject) JSONValue.parseWithException(data);
		}catch (IOException e) {	
				e.printStackTrace();	
		}catch (Exception e) {	
			e.printStackTrace();	
		}
		
		//NON TOCCARE IL COMANDO MALEDETTO
//		JSONArray json = (JSONArray) JSONValue.parse("{\"timeline\":"+data.toString()+"}");
		JSONObject json = (JSONObject) JSONValue.parse("{\"timeline\":"+data.toString()+"}");
/*		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < list.size(); i++){
		    list.addAll((JSONArray)json.get(i));
		}*/
/*	    String[] arr=new String[json.size()];
	    for(int i=0; i<arr.length; i++) {
	        arr[i]= (String) JSONValue.parse((Reader) json.get(i));
	    }*/
//		JSONObject json=new JSONObject("{\"timeline\":"+data.toString()+"}");
		return json;
//		return arr;
	}
	
	
}
	

