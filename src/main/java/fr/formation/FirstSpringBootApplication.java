package fr.formation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.models.Hopital;
import fr.formation.service.HopitalService;
import fr.formation.service.IHopitalService;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
		Hopital hop=new Hopital(1,"Cochin", "Paris", 400);
		IHopitalService daoh = new HopitalService();
		daoh.createHopital(hop);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
