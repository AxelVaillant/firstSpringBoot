package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Medecin;
import fr.formation.models.Patient;
import fr.formation.service.IHopitalService;
import fr.formation.service.IMedecinService;
import fr.formation.service.IPatientService;

@RestController
@RequestMapping("patient")
@CrossOrigin("http://localhost:4200")
public class PatientController {

	@Autowired
	IPatientService patientservice;
	
	@GetMapping("/all") // correspond a methode GET du controller hopital
	public List<Patient> getAll(){
	return patientservice.getAllPatient();	}
	
	@GetMapping("/byid/{id}")
	public Patient getbyid(@PathVariable long id){
	return patientservice.getPatientById(id);	
	}
	
	@PostMapping("/save")
	public Patient savepatient(@RequestBody Patient pat) {
		return patientservice.createPatient(pat);
	}
	@PostMapping("/delete/{id}")
	public int deletepatient(@PathVariable long id) {
		return patientservice.deletePatient(id);
	}
	
	@PutMapping("/update/{id}")
	public Patient updatePatient(@PathVariable long id, @RequestBody Patient pat) {
		Patient pamodif = patientservice.getPatientById(id);
		pamodif.setNompatient(pat.getNompatient());
		pamodif.setPrenompatient(pat.getPrenompatient());
		pamodif.setIdmedecin(pat.getIdmedecin());
		return patientservice.updatePatient(pamodif);
	}
	
//	@Autowired
//	IHopitalService hopitalservice;
//	@PutMapping("/affecth/{idP}/{idH}")
//	public Patient affectPatient(@PathVariable long idP, @PathVariable long idH) {
//		Patient pamodif = patientservice.getPatientById(idP);
//		pamodif.setNomhopital(hopitalservice.getHopitalById(idH));
//		return patientservice.affectPatient(pamodif);
//	}
	
	@Autowired
	IMedecinService medecinservice;
	@PutMapping("/affectm/{idP}/{idM}")
	public Patient affectMedecin(@PathVariable long idP, @PathVariable long idM) {
		Patient pamodif = patientservice.getPatientById(idP);
		pamodif.setIdmedecin(medecinservice.getMedecinById(idM));
		return patientservice.affectPatient(pamodif);
	}
}
