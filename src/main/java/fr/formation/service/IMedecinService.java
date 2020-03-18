package fr.formation.service;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Hopital;
import fr.formation.models.Medecin;

public interface IMedecinService {

	public List<Medecin> getAllMedecin();
	public Medecin getMedecinById(long id);
	public Medecin createMedecin(Medecin med);
	public int deleteMedecin(long idM);
	public Medecin updateMedecin (Medecin med);
	public Medecin affectMedecin(Medecin med);
}
