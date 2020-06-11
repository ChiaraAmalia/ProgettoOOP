package it.univpm.ProgettoOOP;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.univpm.ProgettoOOP.Exception.FilterNotFoundException;
import it.univpm.ProgettoOOP.service.FilterService;

public class TestFilterService {

	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	@Test
	public void testFilterService() {
		
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("hashtags", "Included" , "coronavirus"));		
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("images", "Included", "photo"));
	}
}
