package exceptionHandling.customException;

public class UnderAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	UnderAgeException() {

	}

	UnderAgeException(String msg) {
		super(msg);
	}

}