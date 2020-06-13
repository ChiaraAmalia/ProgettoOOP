package it.univpm.ProgettoOOP.Exception;

/**
 * Rappresenta un'eccezione personalizzata di tipo Exception.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 * @see Exception
 *
 */

public class InternalGeneralException extends Exception {


	private static final long serialVersionUID = 3L;

	public InternalGeneralException() {
		super();
	}

	public InternalGeneralException(String message) {
		super(message);
	}
}

