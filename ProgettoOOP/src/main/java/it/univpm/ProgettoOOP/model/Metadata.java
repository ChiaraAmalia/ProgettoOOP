package it.univpm.ProgettoOOP.model;

/**
 * Questa classe viene utilizzata per descrivere ogni campo contenuto nel tweet
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */

public class Metadata {
	
	private String alias;
	private String sourceField;
	private String type;
	
	

	/**
	 * @param alias rappresenta il nome del campo
	 * @param sourceField rappresenta la descrizione del campo
	 * @param type rappresenta il tipo del campo
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

	/**
	 * 
	 * @return il nome del campo
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * 
	 * @param alias 
	 * viene settato a un nuovo valore il nome del campo
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * 
	 * @return la descrizione del campo
	 */
	public String getSourceField() {
		return sourceField;
	}

	/**
	 * 
	 * @param sourceField 
	 * viene settato a un nuovo valore il nome del campo
	 */
	public void setSourceField(String sourceField) {
		this.sourceField = sourceField;
	}

	/**
	 * 
	 * @return il tipo del campo
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 * viene settato a un nuovo valore il tipo del campo
	 */
	public void setType(String type) {
		this.type = type;
	}
}
