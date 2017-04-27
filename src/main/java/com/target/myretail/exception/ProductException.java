/**
 * 
 */
package com.target.myretail.exception;

/**
 * The Class ProductException.
 *
 * @author sushantakumar
 */
public class ProductException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The error message. */
	private String errorMessage;

	/**
	 * Gets the error message.
	 *
	 * @return the error message
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Instantiates a new product exception.
	 *
	 * @param errorMessage the error message
	 */
	public ProductException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	/**
	 * Instantiates a new product exception.
	 */
	public ProductException() {
		super();
	}

}
