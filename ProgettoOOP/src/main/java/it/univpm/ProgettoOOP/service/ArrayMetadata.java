package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;

import it.univpm.ProgettoOOP.model.Metadata;


public class ArrayMetadata {
	
	private static ArrayList<Metadata> metadata = new ArrayList<Metadata>();
	
	public static ArrayList<Metadata> getArrayMetadata() {
		
		metadata.add(new Metadata("id","id del tweet","Long"));
		return metadata;
	}
}
