package it.univpm.ProgettoOOP.Exception;

/**
 * Rappresenta un'eccezione personalizzata di tipo ClassNotFoundException.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 * @see ClassNotFoundException
 *
 */

public class FilterNotFoundException extends ClassNotFoundException{


	private static final long serialVersionUID = 2L;

	public FilterNotFoundException() {
		super();
	}

	public FilterNotFoundException(String message) {
		super(message);
	}

}
