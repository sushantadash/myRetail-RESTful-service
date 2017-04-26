package com.target.myretail.application;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.target.myretail.domain.Price;
import com.target.myretail.domain.Product;
import com.target.myretail.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProductApplicationTest {
	
	MockMvc mockMvc;
	
	@InjectMocks
	ProductApplication productApplication;
	
	@Mock
	ProductService productService;
	
	Product product;
	
	Price price;
	@Before
	public void setUp(){
		
		mockMvc = MockMvcBuilders.standaloneSetup(productApplication).build();
		
		price = new Price();
		product = new Product();
		
		price.setCurrency_code("USD");
		price.setValue(BigDecimal.valueOf(20.2));
		
		product.setCurrent_price(price);
		product.setName("The Big Lebowski (Blu-ray)");
		
	}

	@Test
	public void getProductById_SuccessTest() throws Exception{
		
		when(productService.getProductById(any(Integer.class))).thenReturn(product);
		
		mockMvc.perform(MockMvcRequestBuilders.get("/product/13860428")
				.contentType(MediaType.APPLICATION_JSON_VALUE))
		        .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
		        .andExpect(jsonPath("$.name", is("The Big Lebowski (Blu-ray)")))
		        .andExpect(jsonPath("$.current_price.value",is(20.2)))
		        .andExpect(jsonPath("$.current_price.currency_code", is("USD")));
		verify(productService).getProductById(13860428);
		
		
	}
	
	@Test
	public void updateProductPriceById_SuccessTest() throws Exception{
		
		ObjectMapper mapper = new ObjectMapper();

		price.setValue(BigDecimal.valueOf(25.2));
		
		product.setCurrent_price(price);
		
		String requestJson = mapper.writeValueAsString(product);
		doNothing().when(productService).updateProductPriceById(any(Integer.class), any(Product.class));
		
		mockMvc.perform(MockMvcRequestBuilders.put("/product/13860428")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(requestJson))
		        .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
		        .andExpect(jsonPath("$.name", is("The Big Lebowski (Blu-ray)")))
		        .andExpect(jsonPath("$.current_price.value",is(25.2)))
		        .andExpect(jsonPath("$.current_price.currency_code", is("USD")));
		verify(productService).updateProductPriceById(anyInt(),anyObject());
		
		
	}
	
}
