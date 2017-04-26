/**
 * 
 */
package com.target.myretail.exception;

/**
 * @author sushantakumar
 *
 */
public class ProductException extends Exception {

	private static final long serialVersionUID = 1L;

	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public ProductException(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public ProductException() {
		super();
	}

}
