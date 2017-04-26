/**
 * 
 */
package com.target.myretail.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.target.myretail.domain.Price;
import com.target.myretail.domain.Product;
import com.target.myretail.domain.redsky.RedSkyProduct;
import com.target.myretail.infrastructure.data.ProductPriceRepository;
import com.target.myretail.integrator.ProductIntegrator;

/**
 * @author sushantakumar
 *
 */

public class ProductServiceTest {
	
	@InjectMocks
	ProductService productService;
	
	@Mock
	ProductIntegrator productIntegrator;
	
	@Mock
	ProductPriceRepository productPriceRepository;
	
	ObjectMapper mapper;	
	
	RedSkyProduct redSkyProduct;
	
	Price price;
	
	Product product;
	
	@Before
	public void setup() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException{
		MockitoAnnotations.initMocks(this);
		mapper = new ObjectMapper();
		redSkyProduct = mapper.readValue(new FileReader(ResourceUtils.getFile(this.getClass().getResource("/RedSkyProductResponse.json"))), RedSkyProduct.class);
		
		price = new Price();
		product = new Product();
		
		price.setProduct_id(13860428);
		price.setCurrency_code("USD");
		price.setValue(BigDecimal.valueOf(20.2));
		
		product.setCurrent_price(price);
		product.setName("The Big Lebowski (Blu-ray)");
	}
	
	@Test
	public void getProductByIdTest(){
		
		when(productIntegrator.getProductDetailsById(any(Integer.class))).thenReturn(redSkyProduct);
		Product product =productService.getProductById(Integer.valueOf(123456));
		
		assertNotNull(product);
		assertNotNull(product.getId());
		assertEquals("The Big Lebowski (Blu-ray)", product.getName());
		
		verify(productIntegrator).getProductDetailsById(Integer.valueOf(123456));
	}
	
	@Test
	public void updateProductPriceByIdTest(){
		
		when(productPriceRepository.save(any(Price.class))).thenReturn(price);
		productService.updateProductPriceById(13860428, product);		
		
		verify(productPriceRepository).save(price);
	}
	
	

}
