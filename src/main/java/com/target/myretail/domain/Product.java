/**
 * 
 */
package com.target.myretail.domain;

import java.math.BigInteger;

/**
 * @author sushantakumar
 *
 */

public class Product {

	private Integer id;

	private String name;

	private Price current_price;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the current_price
	 */
	public Price getCurrent_price() {
		return current_price;
	}

	/**
	 * @param current_price the current_price to set
	 */
	public void setCurrent_price(Price current_price) {
		this.current_price = current_price;
	}
	
	

}
