/**
 * 
 */
package com.target.myretail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.myretail.domain.Price;
import com.target.myretail.domain.Product;
import com.target.myretail.domain.redsky.RedSkyProduct;
import com.target.myretail.infrastructure.data.ProductPriceRepository;
import com.target.myretail.integrator.ProductIntegrator;

/**
 * The Class ProductService.
 *
 * @author sushantakumar
 */
@Service
public class ProductService {
	
	/** The product integrator. */
	@Autowired
	ProductIntegrator productIntegrator;
	
	/** The product price repository. */
	@Autowired
	ProductPriceRepository  productPriceRepository;
	
	/**
	 * Gets the product by id.
	 *
	 * @param id the id
	 * @return the product by id
	 */
	public Product getProductById(Integer id){
	
		Product product = null;
	
		RedSkyProduct redSkyProduct = productIntegrator.getProductDetailsById(id);
	
		if(null !=redSkyProduct && null != redSkyProduct.getProduct() && null != redSkyProduct.getProduct().getItem()){
			product = new Product();
			product.setId(id);
			product.setName(redSkyProduct.getProduct().getItem().getProductDescription().getTitle());
		}
		
		Price price =productPriceRepository.findOne(id);
		
		if(null!=price){
			product.setCurrent_price(price);
		}
		
		return product;
	}

	/**
	 * Update product price by id.
	 *
	 * @param id the id
	 * @param product the product
	 */
	public void updateProductPriceById(Integer id, Product product) {
		
		Price price = product.getCurrent_price();
		
		price.setProductId(id);
		
		productPriceRepository.save(price);
		
		// TODO Auto-generated method stub
		
	}

}
