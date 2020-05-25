package it.univpm.ProgettoOOP.database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.*;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;
import org.json.*;

import it.univpm.ProgettoOOP.model.Tweet;

public class DatabaseClass {
	
	public static JSONObject downloadJSON(String url){
		
		String data = "";
		String line = "";
		
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
		}catch (IOException e) {	
				e.printStackTrace();	
		}catch (Exception e) {	
			e.printStackTrace();	
		}
		
		JSONObject json =new JSONObject("{\"timeline\":"+data.toString()+"}");
		return json;
	}
	
	public static void ParseJson(JSONObject json) {
		
	}
}
	

