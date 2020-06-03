package it.univpm.ProgettoOOP.service;

import java.util.ArrayList;

import it.univpm.ProgettoOOP.model.Metadata;


public class ArrayMetadata {
	
	private static ArrayList<Metadata> metadata = new ArrayList<Metadata>();
	
	public static ArrayList<Metadata> getArrayMetadata() {
		
		metadata.add(new Metadata("id","id del tweet","Long"));
/*		metadata.add(new Metadata("RegGeoRes","Regione geografica di residenza","String"));
		metadata.add(new Metadata("PaeseRes","Paese di residenza","String"));
		metadata.add(new Metadata("EsAlbArr","Esercizi alberghieri - Arrivi","Integer"));
		metadata.add(new Metadata("EsAlbPres","Esercizi alberghieri - Presenze","Integer"));
		metadata.add(new Metadata("EsCompArr","Esercizi complementari - Arrivi","Integer"));
		metadata.add(new Metadata("EsCompPres","Esercizi complementari - Presenze","Integer"));
		metadata.add(new Metadata("TotEsRicArr","Totale esercici ricettivi - Arrivi","Integer"));
		metadata.add(new Metadata("TotEsRicPres","Totale esercici ricettivi - Presenze","Integer"));*/
		return metadata;
	}
}
