package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IMarchandisesDao;
import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRoutiere;
import fr.adaming.model.Marchandise;

@Service
@Transactional
public class MarchandiseServiceImpl implements IMarchandiseService {

	@Autowired
	private IMarchandisesDao marDao;

	// setters pour l'injection dependence
	public void setMarDao(IMarchandisesDao marDao) {
		this.marDao = marDao;
	}

	// =====================methodes===========================//

	@Override
	public List<Marchandise> getAllMarchandisesCa(CargaisonAerienne ca) {
		return marDao.getAllMarchandisesCa(ca);
	}

	@Override
	public List<Marchandise> getAllMarchandisesCr(CargaisonRoutiere cr) {
		return marDao.getAllMarchandisesCr(cr);
	}

	@Override
	public Marchandise getMarchandiseById(int id) {
		return marDao.getMarchandiseById(id);
	}

	@Override
	public void deleteMarchandise(int id) {
		marDao.deleteMarchandise(id);
	}

	@Override
	public Marchandise addMarchandise(Marchandise mp, CargaisonAerienne ca) {
		mp.setCargaisonAerienne(ca);
		return marDao.addMarchandise(mp);
	}

	@Override
	public Marchandise addMarchandise(Marchandise mp, CargaisonRoutiere cr) {
		mp.setCargaisonRoutiere(cr);
		return marDao.addMarchandise(mp);
	}

	@Override
	public List<Marchandise> getAllMarchandises() {
		return  marDao.getAllMarchandises();
	}

}
