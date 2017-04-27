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

/**
 * The Class ProductIntegrator.
 */
@Component
public class ProductIntegrator {
	
	/** The external api URL. */
	@Value("${externalApiURL}")
	private String externalApiURL;
	
	/** The external api params. */
	@Value("${externalApiParams}")
	private String externalApiParams;
	
	
	/** The rest template. */
	@Autowired
	RestTemplate restTemplate;
	
	/**
	 * Gets the product details by id.
	 *
	 * @param id the id
	 * @return the product details by id
	 */
	@HystrixCommand(fallbackMethod = "defaultProductName")
	public RedSkyProduct getProductDetailsById(Integer id){
		
		RedSkyProduct redSkyProduct = restTemplate.getForObject(externalApiURL+"/"+id+externalApiParams, RedSkyProduct.class);
		
		return redSkyProduct;
	}
	
	/**
	 * Default product name.
	 *
	 * @param id the id
	 * @return the red sky product
	 */
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
