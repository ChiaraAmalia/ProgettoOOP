package it.univpm.ProgettoOOP.model;

public class Hashtag implements ToString{
	
	private String testo;	

	/**
	 * the constructor
	 */
	public Hashtag() {
		super();
	}
	
	/**
	 * @return the testo
	 */
	public String getTesto() {
		return testo;
	}

	/**
	 * @param testo the testo to set
	 */
	public void setTesto(String testo) {
		this.testo = testo;
	}

	@Override
	public String toString() {
		return "\n Hashtag: [\n testo=" + testo + "]";
	}
	
	

	
}
