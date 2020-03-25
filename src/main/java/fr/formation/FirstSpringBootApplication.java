package fr.formation;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.models.Hopital;
import fr.formation.models.Medecin;
import fr.formation.models.Patient;
import fr.formation.service.HopitalService;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@SpringBootApplication
public class FirstSpringBootApplication implements CommandLineRunner {
	@Autowired
	private IHopitalService hopitalservice;
	@Autowired
	private IMedecinService medecinservice;
	@Autowired
	private IPatientService patientservice;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
		
		
		
	}

	@Override
	public void run(String... args) throws Exception {
//		Hopital hop=new Hopital(1,"Cochin", "Paris", 400);
//		Hopital hop1=new Hopital(2,"Salpetriere", "Paris", 600);
//		Hopital hop2=new Hopital(3,"blabla", "Lyon", 300);
//		List<Hopital> list= new ArrayList<Hopital>();
//		hopitalservice.createHopital(hop);
//		hopitalservice.createHopital(hop1);
//		hopitalservice.createHopital(hop2);
//		hopitalservice.deleteHopital(2);
//		list=hopitalservice.getAllHopital();
//		System.out.println(list);
//		System.out.println(hopitalservice.getHopitalById(3));
		
//		Medecin med=new Medecin();
//		med.setNommedecin("House");
//		med.setPrenommedecin("Gregory");
//	Hopital hop12=new Hopital();
//		hop12=hopitalservice.getHopitalById(3);
//	med.setNomhopital(hop12);
//
//	medecinservice.createMedecin(med);
//		List<Medecin> listm= new ArrayList<Medecin>();
//		listm=medecinservice.getAllMedecin();
//		System.out.println(listm);
//		System.out.println(medecinservice.getMedecinById(2));
		
//		Patient pat=new Patient();
//		pat.setNompatient("Vaillant");
//		pat.setPrenompatient("Axel");
//		Medecin med12=new Medecin();
//		med12=medecinservice.getMedecinById(2);
//		pat.setIdmedecin(med12);
//		patientservice.createPatient(pat);
//		List<Patient> listp= new ArrayList<Patient>();
//		listp=	patientservice.getAllPatient();
//		System.out.println(listp);
//		System.out.println(patientservice.getPatientById(2));


		
	}

}
