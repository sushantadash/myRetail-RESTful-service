/**
 * 
 */
package com.target.myretail.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.target.myretail.domain.Price;

/**
 * @author sushantakumar
 *
 */
public interface ProductPriceRepository extends CrudRepository<Price, Integer> {

}
