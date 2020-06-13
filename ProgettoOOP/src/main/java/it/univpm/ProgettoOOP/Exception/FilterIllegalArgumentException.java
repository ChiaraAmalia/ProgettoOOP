package it.univpm.ProgettoOOP.Exception;

/**
 * Rappresenta un'eccezione personalizzata di tipo IllegalArgumentException.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 * @see IllegalArgumentException
 *
 */
public class FilterIllegalArgumentException extends IllegalArgumentException{


	private static final long serialVersionUID = 1L;

	public FilterIllegalArgumentException() {
		super();
	}

	public FilterIllegalArgumentException(String message) {
		super(message);
	}
}
