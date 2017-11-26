package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRoutiere;
import fr.adaming.model.Marchandise;
import fr.adaming.service.IMarchandiseService;

@RestController
public class MarchandiseRest {

	// =======================recuperation de marchandise du
	// service==============//

	@Autowired
	private IMarchandiseService marchandiseService;

	// =====setter=====//
	public void setMarchandiseService(IMarchandiseService marchandiseService) {
		this.marchandiseService = marchandiseService;
	}

	// ====================les
	// methodes========================================//
	@RequestMapping(value = "/listeMarchCa", method = RequestMethod.GET, produces = "application/json",consumes = "application/json")
	public List<Marchandise> getAllMarchandiseByCa(@RequestBody CargaisonAerienne ca) {
		return marchandiseService.getAllMarchandisesCa(ca);

	}

	@RequestMapping(value = "/listeMarchCr", method = RequestMethod.GET, produces = "application/json")
	public List<Marchandise> getAllMarchandiseByCr(CargaisonRoutiere cr) {
		return marchandiseService.getAllMarchandisesCr(cr);

	}

	@RequestMapping(value = "/listeMarch", method = RequestMethod.GET, produces = "application/json")
	public List<Marchandise> getAllMarchandise() {
		return marchandiseService.getAllMarchandises();

	}
	
	@RequestMapping(value = "/marchandises", method = RequestMethod.GET, produces = "application/json")
	public Marchandise getMarchandiseById(@RequestParam("pId") int id) {
		return marchandiseService.getMarchandiseById(id);

	}
	@RequestMapping(value = "/marchandises", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Marchandise addMarchandise(@RequestBody Marchandise mp, @RequestBody CargaisonAerienne ca){
		return marchandiseService.addMarchandise(mp, ca);
		
	}
	
	@RequestMapping(value = "/marchandises", method = RequestMethod.DELETE)
	public void deleteMarchandise(@RequestParam("pId")int id){
		marchandiseService.deleteMarchandise(id);
	}
}
