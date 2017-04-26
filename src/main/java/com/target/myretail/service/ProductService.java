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
 * @author sushantakumar
 *
 */
@Service
public class ProductService {
	
	@Autowired
	ProductIntegrator productIntegrator;
	
	@Autowired
	ProductPriceRepository  productPriceRepository;
	
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

	public void updateProductPriceById(Integer id, Product product) {
		
		Price price = product.getCurrent_price();
		
		price.setProduct_id(id);
		
		productPriceRepository.save(price);
		// TODO Auto-generated method stub
		
	}

}
