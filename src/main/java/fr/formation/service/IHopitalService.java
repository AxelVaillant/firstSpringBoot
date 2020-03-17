package fr.formation.service;

import java.util.List;
import java.util.Optional;

import fr.formation.models.Hopital;

public interface IHopitalService  {
	
	public List<Hopital> getAllHopital();
	public Hopital getHopitalById(long id);
	public int createHopital(Hopital hop);
	public int deleteHopital(long idH);
	

}
