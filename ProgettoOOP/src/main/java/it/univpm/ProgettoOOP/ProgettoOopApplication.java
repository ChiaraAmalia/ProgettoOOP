package it.univpm.ProgettoOOP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.univpm.ProgettoOOP.database.DatabaseClass;

/**
 * classe che permette l'avvio dell'applicazione SpringBoot
 * @author Chiara Amalia Caporusso
 * @author Piero Campitelli
 *
 */

@SpringBootApplication
public class ProgettoOopApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProgettoOopApplication.class, args);
	}

}
