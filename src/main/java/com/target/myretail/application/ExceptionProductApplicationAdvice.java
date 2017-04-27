/**
 * 
 */
package com.target.myretail.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.target.myretail.domain.ErrorResponse;
import com.target.myretail.exception.ProductException;

/**
 * The Class ExceptionProductApplicationAdvice. This is spring Advice class for handling exceptions
 *
 * @author sushantakumar
 */
@ControllerAdvice
public class ExceptionProductApplicationAdvice {
	
	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(ExceptionProductApplicationAdvice.class);

	/**
	 * Invalid format exception handler.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	@Order(Ordered.HIGHEST_PRECEDENCE)
	@ExceptionHandler(value = {InvalidFormatException.class, IllegalStateException.class, IllegalArgumentException.class})	
	public ResponseEntity<ErrorResponse> InvalidFormatExceptionHandler(RuntimeException ex) {
		
		logger.error("Exception Occured --> InvalidFormatExceptionHandler -->:: "+ex);

		ErrorResponse error = new ErrorResponse();

		error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());

		error.setMessage(ex.getMessage());

		return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}
	
	/**
	 * Product exception handler.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	@Order(Ordered.HIGHEST_PRECEDENCE)
	@ExceptionHandler(ProductException.class)	
	public ResponseEntity<ErrorResponse> ProductExceptionHandler(Exception ex) {
		
		logger.error("Exception Occured --> ProductExceptionHandler -->:: "+ex);

		ErrorResponse error = new ErrorResponse();

		error.setErrorCode(HttpStatus.PRECONDITION_FAILED.value());

		error.setMessage(ex.getMessage());

		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);
	}

	
	/**
	 * Exception handler.
	 *
	 * @param ex the ex
	 * @return the response entity
	 */
	@ExceptionHandler(Exception.class)
	@Order(Ordered.LOWEST_PRECEDENCE)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {

		logger.error("Exception Occured --> exceptionHandler --> :: "+ex);
		
		ErrorResponse error = new ErrorResponse();

		error.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());

		error.setMessage("Please contact your administrator");

		return new ResponseEntity<ErrorResponse>(error, HttpStatus.OK);

	}
	
	

	
}
