package dev.sandeep.BookMyShowOct24;

import dev.sandeep.BookMyShowOct24.service.InitialisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowOct24Application implements CommandLineRunner {

	@Autowired
	private InitialisationService initialisationService;

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowOct24Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception { // run method runs immediately after main()
		System.out.println("Starting Data Initialisation");
		initialisationService.initialise();
	}
}
