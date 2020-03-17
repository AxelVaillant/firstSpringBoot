package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Patient;
import fr.formation.repository.IPatientRepository;

@Service
public class PatientService implements IPatientService{
	@Autowired
	IPatientRepository patientrepository;
	@Override
	public List<Patient> getAllPatient() {
		
		return patientrepository.findAll();
	}

	@Override
	public Patient getPatientById(long id) {
		Optional<Patient> patient1= patientrepository.findById(id);
		Patient patient=new Patient();
		if(patient1.isPresent()) {
			patient=patient1.get();
		}
		return patient;
	}

	@Override
	public int createPatient(Patient pat) {
		patientrepository.save(pat);
		return 1;
	}

	@Override
	public int deletePatient(long idP) {
		try {
			patientrepository.deleteById(idP);
		} catch (Exception e) {
			return 0;
		}
		
		return 1;
	}



}
