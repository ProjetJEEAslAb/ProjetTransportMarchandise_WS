package fr.adaming.service;

import java.util.List;

import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRoutiere;
import fr.adaming.model.Marchandise;

public interface IMarchandiseService {

	public List<Marchandise> getAllMarchandisesCa(CargaisonAerienne ca);
	public List<Marchandise> getAllMarchandisesCr(CargaisonRoutiere cr);
	public List<Marchandise> getAllMarchandises();
	public Marchandise getMarchandiseById(int id);
	public Marchandise addMarchandise(Marchandise mp,CargaisonAerienne ca );
	public Marchandise addMarchandise(Marchandise mp,CargaisonRoutiere cr );
	public void deleteMarchandise(int id);
	
}
