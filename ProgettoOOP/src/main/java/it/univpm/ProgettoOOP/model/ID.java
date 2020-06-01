package it.univpm.ProgettoOOP.model;
/**
 * Questa classe viene utilizzata come classe madre dato che ha un'unica variabile
 * che rappresenta l'id e che è comune alla maggiorparte delle classi nel package model.
 * Viene implementata dalla classe ToString() dove ne prende il metodo astratto Visualizza()
 * @see ToString
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class ID implements ToString{
	
	private long id;

	/**
	 * il costruttore senza campi
	 */
	public ID() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id che rappresenta un id generico
	 */
	public ID(long id) {
		super();
		this.id = id;
	}

	/**
	 * @return  id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id 
	 * permette la modifica dell'id
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return una stringa che visualizza l'id
	 */
	@Override
	public String Visualizza() {
		String stamp = "id=" + id;
		return stamp;
	}
	
	
	
}
