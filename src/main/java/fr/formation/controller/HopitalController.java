package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Hopital;
import fr.formation.service.IHopitalService;

@RestController
@RequestMapping("hopital") // URL du webservice
@CrossOrigin("http://localhost:4200")
public class HopitalController {
	@Autowired
	IHopitalService hopitalservice;
	
	@GetMapping("/all") // correspond a methode GET du controller hopital
	public List<Hopital> getAll(){
	return hopitalservice.getAllHopital();	}
	
	@GetMapping("/byid/{id}")
	public Hopital getbyid(@PathVariable long id){
	return hopitalservice.getHopitalById(id);	
	}
	
	@PostMapping("/save")
	public Hopital savehopital(@RequestBody Hopital hop) {
		return hopitalservice.createHopital(hop);
	}
	@PostMapping("/delete/{id}")
	public int deletehopital(@PathVariable long id) {
		return hopitalservice.deleteHopital(id);
	}
	
//	@DeleteMapping("/delete/{id}")
//	public int deletehopital(@PathVariable long id) {
//		return hopitalservice.deleteHopital(id);
//	}
	@PutMapping("/update/{id}")
	public Hopital updateHopital(@PathVariable long id, @RequestBody Hopital hopital) {
		Hopital hamodif = hopitalservice.getHopitalById(id);
		hamodif.setNomhopital(hopital.getNomhopital());
		hamodif.setLieuhopital(hopital.getLieuhopital());
		hamodif.setCapacite(hopital.getCapacite());
		return hopitalservice.updateHopital(hamodif);
	}
	
}
