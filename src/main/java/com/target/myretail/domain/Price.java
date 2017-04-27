/**
 * 
 */
package com.target.myretail.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Price.
 *
 * @author sushantakumar
 */
@Table("productprice")
@JsonIgnoreProperties(value = { "product_id" })
public class Price {
	
	/** The product id. */
	@PrimaryKey(value= "product_id")
	private Integer productId;

	/** The value. */
	@NotNull
	private BigDecimal value;

	/** The currency code. */
	@Size(min=2, max=10)
	private String currency_code;

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * Gets the product id.
	 *
	 * @return the product_id
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * Sets the product id.
	 *
	 * @param product_id the product_id to set
	 */
	public void setProductId(Integer product_id) {
		this.productId = product_id;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the value to set
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	/**
	 * Gets the currency code.
	 *
	 * @return the currency_code
	 */
	public String getCurrency_code() {
		return currency_code;
	}

	/**
	 * Sets the currency code.
	 *
	 * @param currency_code the currency_code to set
	 */
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}

}
