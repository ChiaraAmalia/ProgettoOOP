package it.univpm.ProgettoOOP.Exception;

/**
 * Rappresenta un'eccezione personalizzata di tipo ClassNotFoundException.
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 * @see ClassNotFoundException
 *
 */

public class StatsNotFoundException extends ClassNotFoundException{


	private static final long serialVersionUID = 4L;

	public StatsNotFoundException() {
		super();
	}

	public StatsNotFoundException(String message) {
		super(message);
	}
}
