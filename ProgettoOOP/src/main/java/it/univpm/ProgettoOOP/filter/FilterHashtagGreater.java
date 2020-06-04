package it.univpm.ProgettoOOP.filter;

public class FilterHashtagGreater extends Filter2Compare implements Filter {      //Filter2Comapre è una superclasse che serve
	public FilterHashtagGreater (Tweet tweet) {                                   //per inizializzare l'oggetto filtro con un numero
		super(number);
	}
	
	public boolean filter (Tweet tweet) {
		for (int i=0)
		tweet.getEntities().get(i).getHashtags().get(j).getText())
	}
	

}
