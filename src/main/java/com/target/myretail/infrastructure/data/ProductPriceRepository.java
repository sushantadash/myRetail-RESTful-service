/**
 * 
 */
package com.target.myretail.infrastructure.data;

import org.springframework.data.repository.CrudRepository;

import com.target.myretail.domain.Price;

/**
 * The Interface ProductPriceRepository.
 *
 * @author sushantakumar
 */
public interface ProductPriceRepository extends CrudRepository<Price, Integer> {
	
/*	@Modifying
	@Query("update Price price set price.value = ?1 where price.productId =?2")
	int setValueForPrice(BigDecimal value, Long prductId);*/
	

}
