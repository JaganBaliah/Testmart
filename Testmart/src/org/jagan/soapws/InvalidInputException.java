package org.jagan.soapws;

public class InvalidInputException extends Exception {

	private static final long serialVersionUID = -9000618463579372126L;
	
	private String errorDetails;

	public InvalidInputException(String message, String errorDetails) {
		super(message);
		this.errorDetails = errorDetails;
	}
	
	public String getFaultInfo() {
		return this.errorDetails;
	}
}
