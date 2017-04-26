package com.target.myretail.integrator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.target.myretail.domain.redsky.RedSkyProduct;

public class ProductIntegratorTest {
	
	@InjectMocks
	ProductIntegrator productIntegrator;
	
	@Mock
	RestTemplate restTemplate;
	
	ObjectMapper mapper;	
	
	RedSkyProduct redSkyProduct;
	
	@Before
	public void setup() throws JsonParseException, JsonMappingException, FileNotFoundException, IOException{
		MockitoAnnotations.initMocks(this);
		mapper = new ObjectMapper();
		redSkyProduct = mapper.readValue(new FileReader(ResourceUtils.getFile(this.getClass().getResource("/RedSkyProductResponse.json"))), RedSkyProduct.class);
	}

	@Test
	public void getProductDetailsById_SuccessTest()
	{
		when(restTemplate.getForObject(anyString(), eq(RedSkyProduct.class))).thenReturn(redSkyProduct);
		
		RedSkyProduct redSkyProductResponse = productIntegrator.getProductDetailsById(Integer.valueOf(123456));
		
		verify(restTemplate).getForObject(anyString(), eq(RedSkyProduct.class));
	
		assertEquals("The Big Lebowski (Blu-ray)", redSkyProductResponse.getProduct().getItem().getProductDescription().getTitle());
		
	}
	
	@Test
	public void getProductDetailsById_failureTest()
	{
		when(restTemplate.getForObject(anyString(), eq(RedSkyProduct.class))).thenReturn(null);
		
		RedSkyProduct redSkyProductResponse = productIntegrator.getProductDetailsById(Integer.valueOf(123456));
		
		verify(restTemplate).getForObject(anyString(), eq(RedSkyProduct.class));
	
		assertNull(redSkyProductResponse);
		
	}
	
}
