package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Medecin;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@RestController
@RequestMapping("medecin")
public class MedecinController {

	@Autowired
	IMedecinService medecinservice;
	
	@GetMapping("/all") // correspond a methode GET du controller hopital
	public List<Medecin> getAll(){
	return medecinservice.getAllMedecin();	}
	
	@GetMapping("/byid/{id}")
	public Medecin getbyid(@PathVariable long id){
	return medecinservice.getMedecinById(id);	
	}
	
	@PostMapping("/save")
	public Medecin savemedecin(@RequestBody Medecin med) {
		return medecinservice.createMedecin(med);
	}
	@PostMapping("/delete/{id}")
	public int deletemedecin(@PathVariable long id) {
		return medecinservice.deleteMedecin(id);
	}
	
	@PutMapping("/update/{id}")
	public Medecin updateMedecin(@PathVariable long id, @RequestBody Medecin med) {
		Medecin mamodif = medecinservice.getMedecinById(id);
		mamodif.setNommedecin(med.getNommedecin());
		return medecinservice.updateMedecin(mamodif);
	}
	
	@Autowired
	IHopitalService hopitalservice;
	@PutMapping("/affect/{idM}/{idH}")
	public Medecin affectMedecin(@PathVariable long idM, @PathVariable long idH) {
		Medecin mamodif = medecinservice.getMedecinById(idM);
		mamodif.setNomhopital(hopitalservice.getHopitalById(idH));
		return medecinservice.affectMedecin(mamodif);
	}
	
	@Autowired
	IPatientService patientservice;
	@PutMapping("/affectp/{idM}/{idP}")
	public Medecin affectPatient(@PathVariable long idM, @PathVariable long idP) {
		Medecin mamodif = medecinservice.getMedecinById(idM);
		mamodif.setIdpatient(patientservice.getPatientById(idP));
		return medecinservice.affectMedecin(mamodif);
	}
}
