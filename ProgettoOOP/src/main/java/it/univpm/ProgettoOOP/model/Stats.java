package it.univpm.ProgettoOOP.model;

public class Stats {
	
	public String field;
	int count;
	
	public Stats() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param field rappresenta il nome della colonna
	 * @param count rappresenta il conteggio
	 */
	public Stats(String field, int count) {
		super();
		this.field = field;
		this.count = count;
	}
	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}
	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
