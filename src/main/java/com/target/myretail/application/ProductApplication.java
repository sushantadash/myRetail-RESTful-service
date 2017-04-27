/**
 * 
 */
package com.target.myretail.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.target.myretail.domain.Product;
import com.target.myretail.exception.ProductException;
import com.target.myretail.service.ProductService;

/**
 * The Class ProductApplication.
 *
 * @author sushantakumar
 * This is gateway controller class. It receives product Id and returns Product information to end user. 
 */
@RestController
@RequestMapping("/product")
public class ProductApplication {

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger(ProductApplication.class);

	/** The product service. */
	@Autowired
	ProductService productService;

	/**
	 * Gets the product by id.
	 *
	 * @param id the id
	 * @return the product by id
	 * @throws ProductException the product exception
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> getProductById(@PathVariable Integer id) throws ProductException {

		if (logger.isDebugEnabled()) {
			logger.debug("product id is:: " + id);
		}

		Product product = productService.getProductById(id);		

		if (logger.isDebugEnabled()) {
			logger.debug("Response of ProductApplication --> getProductById():: " + product.toString());
		}
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

	/**
	 * Update product price by id.
	 *
	 * @param id the id
	 * @param product the product
	 * @return the response entity
	 * @throws ProductException the product exception
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> updateProductPriceById(@PathVariable Integer id,
			@RequestBody @Validated Product product) throws ProductException {

		if (logger.isDebugEnabled()) {
			logger.debug("product id is:: " + id);
			logger.debug("Request received in ProductApplication --> updateProductPriceById():: " + product.toString());
		}		
		
		productService.updateProductPriceById(id, product);

		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}

}
