package it.univpm.ProgettoOOP;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.univpm.ProgettoOOP.Exception.FilterIllegalArgumentException;
import it.univpm.ProgettoOOP.Exception.FilterNotFoundException;
import it.univpm.ProgettoOOP.Exception.InternalGeneralException;
import it.univpm.ProgettoOOP.service.FilterService;
import it.univpm.ProgettoOOP.service.JSONParse;
import it.univpm.ProgettoOOP.service.JsonParser;
import it.univpm.ProgettoOOP.util.other.Filter;
import it.univpm.ProgettoOOP.model.Tweet;

public class TestJunit {
	
	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	@Test
	public void testFilterService() {
		
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("ashtags", "Included" , "coronavirus"));		
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("hashtag", "Included", "AI"));
		assertThrows(FilterIllegalArgumentException.class, ()-> FilterService.instanceFilter("Hashtag", "Included", 1));
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("Follower", "In", "[10, 100]"));
		assertThrows(FilterNotFoundException.class, ()-> FilterService.instanceFilter("RetweetCount", "In", 30));
		assertThrows(FilterIllegalArgumentException.class, ()-> FilterService.instanceFilter("Hashtag", "In", "ciao"));
		assertThrows(FilterIllegalArgumentException.class, ()-> FilterService.instanceFilter("Lang", "Included", 2));
	}
	
}
