package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Medecin;
import fr.formation.repository.IMedecinRepository;

@Service
public class MedecinService implements IMedecinService {
	@Autowired
	IMedecinRepository medecinrepository;
	@Override
	public List<Medecin> getAllMedecin() {
	
		return medecinrepository.findAll();
	}


	@Override
	public Medecin getMedecinById(long id) {
		Optional<Medecin> medecin1 =  medecinrepository.findById(id);
		 Medecin medecin = new Medecin();
		 if(medecin1.isPresent()) {
			 medecin=medecin1.get();
		 }
		return medecin;
	}

	@Override
	public Medecin createMedecin(Medecin med) {
		
		return medecinrepository.save(med);
	}

	@Override
	public int deleteMedecin(long idM) {
		try {
			medecinrepository.deleteById(idM);
		} catch (Exception e) {
			return 0;
		}

		return 1;
	}


	@Override
	public Medecin updateMedecin(Medecin med) {
	
		return medecinrepository.save(med);
	}


	@Override
	public Medecin affectMedecin(Medecin med) {
		
		return medecinrepository.save(med);
	}

	



}
