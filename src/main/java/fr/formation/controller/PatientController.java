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

import fr.formation.models.Patient;
import fr.formation.service.IPatientService;

@RestController
@RequestMapping("patient")
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
		return patientservice.updatePatient(pamodif);
	}
}
