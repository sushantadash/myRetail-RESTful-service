package com.target.myretail.integrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.target.myretail.domain.redsky.Item;
import com.target.myretail.domain.redsky.Product;
import com.target.myretail.domain.redsky.ProductDescription;
import com.target.myretail.domain.redsky.RedSkyProduct;

@Component
public class ProductIntegrator {
	
	private String externalApiURL = "http://redsky.target.com/v2/pdp/tcin";
	
	private String externalApiParams= "?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics";
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "defaultProductName")
	public RedSkyProduct getProductDetailsById(Integer id){
		
		RedSkyProduct redSkyProduct = restTemplate.getForObject(externalApiURL+"/"+id+externalApiParams, RedSkyProduct.class);
		
		return redSkyProduct;
	}
	
	public RedSkyProduct defaultProductName(Integer id){
		
		ProductDescription productDescription = new ProductDescription();
		productDescription.setTitle("Default Name");
		
		Item item = new Item();
		item.setProductDescription(productDescription);
		
		Product domailRedSkyProduct = new Product();
		domailRedSkyProduct.setItem(item);
		
		RedSkyProduct redSkyProduct = new RedSkyProduct();
		redSkyProduct.setProduct(domailRedSkyProduct);
		
		return redSkyProduct;
	}


}
