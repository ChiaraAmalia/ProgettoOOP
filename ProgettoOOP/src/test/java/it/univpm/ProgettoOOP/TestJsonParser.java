package it.univpm.ProgettoOOP;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import it.univpm.ProgettoOOP.Exception.FilterIllegalArgumentException;
import it.univpm.ProgettoOOP.Exception.FilterNotFoundException;
import it.univpm.ProgettoOOP.service.JsonParser;

public class TestJsonParser {
	
	@BeforeEach
	void setUp() throws Exception {

	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	
	@Test
	public void testJsonParser() {
		
		assertThrows(FilterNotFoundException.class, ()-> JsonParser.JsonParserColumn("{\"hashtags\": {\"Included\" : [\"coronavirus\"]}}"));
		assertThrows(FilterNotFoundException.class, ()-> JsonParser.JsonParserColumn("{\"images\": {\"NotIncluded\" : [\"mp4\"]}}"));
		assertThrows(FilterIllegalArgumentException.class, ()-> JsonParser.JsonParserColumn("{\"Image\": {\"NotIncluded\" : [\"photo\"]}, \"Hashtag\": {\"type\": \"oppure\", \"Included\": [\"ai\"]}}"));
	}
}

