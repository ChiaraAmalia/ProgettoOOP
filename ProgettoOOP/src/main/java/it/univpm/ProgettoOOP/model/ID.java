package it.univpm.ProgettoOOP.model;

public class ID implements ToString{
	
	protected int id;

	/**
	 * the constructor
	 */
	public ID() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 */
	public ID(int id) {
		super();
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	
	public String Visualizza() {
		return "id=" + id;
	}
	
	
	
}
