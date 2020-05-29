package it.univpm.ProgettoOOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.univpm.ProgettoOOP.database.DatabaseClass;

@SpringBootApplication
public class ProgettoOopApplication {

	public static void main(String[] args) {
//		DatabaseClass.downloadJSON("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/user/1.1/statuses/home_timeline.json?count=100");
		SpringApplication.run(ProgettoOopApplication.class, args);
	}

}
