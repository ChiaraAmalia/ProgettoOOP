package it.univpm.ProgettoOOP.model;

public class Metadata {
	
	private String alias;
	private String sourceField;
	private String type;
	
	

	/**
	 * @param alias
	 * @param sourceField
	 * @param type
	 */
	public Metadata(String alias, String sourceField, String type) {
		super();
		this.alias = alias;
		this.sourceField = sourceField;
		this.type = type;
	}


	public Metadata() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getAlias() {
		return alias;
	}


	public void setAlias(String alias) {
		this.alias = alias;
	}


	public String getSourceField() {
		return sourceField;
	}


	public void setSourceField(String sourceField) {
		this.sourceField = sourceField;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
}
