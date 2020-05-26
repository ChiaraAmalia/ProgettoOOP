package it.univpm.ProgettoOOP.Exception;

public class FilterIllegalArgumentException extends IllegalArgumentException{


	private static final long serialVersionUID = 1L;

	public FilterIllegalArgumentException() {
		super();
	}

	public FilterIllegalArgumentException(String message) {
		super(message);
	}
}
