package it.univpm.ProgettoOOP.model;
/**
 * Questa classe viene utilizzata come classe madre dato che ha un'unica variabile
 * che rappresenta l'id e che è comune alla maggiorparte delle classi nel package model.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */
public class ID {
	
	private long id;


	public ID() {
		super();
		// TODO Auto-generated constructor stub
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
	
}
