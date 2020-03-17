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
	public int createMedecin(Medecin med) {
		medecinrepository.save(med);
		return 1;
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





}
