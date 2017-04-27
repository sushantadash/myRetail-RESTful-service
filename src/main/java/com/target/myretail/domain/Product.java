/**
 * 
 */
package com.target.myretail.domain;

import java.math.BigInteger;

// TODO: Auto-generated Javadoc
/**
 * The Class Product.
 *
 * @author sushantakumar
 */

public class Product {

	/** The id. */
	private Integer id;

	/** The name. */
	private String name;

	/** The current price. */
	private Price current_price;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the current price.
	 *
	 * @return the current_price
	 */
	public Price getCurrent_price() {
		return current_price;
	}

	/**
	 * Sets the current price.
	 *
	 * @param current_price the current_price to set
	 */
	public void setCurrent_price(Price current_price) {
		this.current_price = current_price;
	}
	
	

}
