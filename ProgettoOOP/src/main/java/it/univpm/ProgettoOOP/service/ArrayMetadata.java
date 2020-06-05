package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;

import it.univpm.ProgettoOOP.model.Metadata;


public class ArrayMetadata {
	
	private static ArrayList<Metadata> metadata = new ArrayList<Metadata>();
	
	public static ArrayList<Metadata> getArrayMetadata() {
		
		metadata.add(new Metadata("id","id del tweet","Long"));
		metadata.add(new Metadata("created_at", "data e ora di pubblicazione del tweet", "String"));
		metadata.add(new Metadata("text","testo del tweet","String"));
		metadata.add(new Metadata("entities","contiene altri array relativi agli hashtag, le menzioni, gli url e le immagini","ArrayList"));
		metadata.add(new Metadata("hashtags","hashtags contenuti nel tweet","ArrayList"));
		metadata.add(new Metadata("text","testo dell'hashtag","String"));
		metadata.add(new Metadata("mentions","contiene i dettagli degli account menzionati nel tweet","ArrayList"));
		metadata.add(new Metadata("id","id dell'utente menzionato nel tweet","Long"));
		metadata.add(new Metadata("name","nome completo dell'utente menzionato","String"));
		metadata.add(new Metadata("screenName","nome utente unico per ogni account","String"));
		metadata.add(new Metadata("url","contiene gli url inseriti nel tweet","ArrayList"));
		metadata.add(new Metadata("Url","url contenuto nel tweet","String"));
		metadata.add(new Metadata("expandedUrl","url esteso","String"));
		metadata.add(new Metadata("image","contiene le caratteristiche dell'immagine contenuta nel tweet","ArrayList"));
		metadata.add(new Metadata("id","id dell'immagine","Long"));
		metadata.add(new Metadata("media_url","url dell'immagine","String"));
		metadata.add(new Metadata("type","tipo dell'immagine","String"));
		metadata.add(new Metadata("size","dimensioni relative all'immagine","ArrayList"));
		metadata.add(new Metadata("height","altezza dell'immagine","Long"));
		metadata.add(new Metadata("width","larghezza dell'immagine","Long"));
		metadata.add(new Metadata("resize","ridimensiona le immagini senza ritagliarle, si indica con la parola fit","String"));
		metadata.add(new Metadata("retweet_count","numero di volte che il tweet è stato retweetato","Long"));
		metadata.add(new Metadata("lang","lingua del tweet","String"));
		metadata.add(new Metadata("users","contiene le caratteristiche riguardo l'utente che ha tweettato","ArrayList"));
		metadata.add(new Metadata("id","id dell'utente che ha tweettato","Long"));
		metadata.add(new Metadata("name","nome intero dell'utente che ha tweettato","String"));
		metadata.add(new Metadata("description","descrizione relativa al profilo","String"));
		metadata.add(new Metadata("screenName","nome unico dell'account twitter","String"));
		metadata.add(new Metadata("followerCount","numero di follower che ha l'utente","Long"));
		return metadata;
	}
}
