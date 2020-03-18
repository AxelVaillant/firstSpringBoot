package fr.formation.service;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Patient;

public interface IPatientService {

	public List<Patient> getAllPatient();
	public Patient getPatientById(long id);
	public Patient createPatient(Patient pat);
	public int deletePatient(long idP);
	public Patient updatePatient( Patient pat);
}
