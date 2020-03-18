package fr.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Hopital;
import fr.formation.repository.IHopitalRepository;
@Service
public class HopitalService implements IHopitalService {
	@Autowired
	IHopitalRepository hopitalrepository;
	@Override
	public List<Hopital> getAllHopital() {

		return	hopitalrepository.findAll();
	}
	@Override
	public Hopital getHopitalById(long id) {
		Optional<Hopital> hopital1 =hopitalrepository.findById(id);
		Hopital hopital = new Hopital();
		if(hopital1.isPresent()) {
			hopital=hopital1.get();
		}
		return hopital;
	}
	@Override
	public Hopital createHopital(Hopital hop) {
			
		return hopitalrepository.save(hop);
	}
	@Override
	public int deleteHopital(long idH) {
		try {
			hopitalrepository.deleteById(idH);
		} catch (Exception e) {
			return 0;
		}
		
		return 1;
	}
	@Override
	public Hopital updateHopital(Hopital hop) {
		
		return hopitalrepository.save(hop);
	}
	
	
	
}
