package fr.adaming.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.CargaisonAerienne;
import fr.adaming.model.CargaisonRoutiere;
import fr.adaming.model.Marchandise;

@Repository
public class MarchandisesDaoImpl implements IMarchandisesDao {

	// ================== injection automatique du collaborateur
	// sessionFactoryBean=====================//
	@Autowired
	private SessionFactory sf;

	// setter pour l'injection
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	// ===============methode : liste de marchandises par cargaison aerienne
	// ===================//

	@Override
	public List<Marchandise> getAllMarchandisesCa(CargaisonAerienne ca) {

		// recuperation de la session
		Session s = sf.getCurrentSession();

		// requete hql
		String req = "FROM Marchandise m WHERE m.cargaisonAerienne.ref=:pId";

		// creation du query
		Query query = s.createQuery(req);

		// recuperation des paramtres
		query.setParameter("pId", ca.getRef());

		// envoyer la requete et recuperation du resultat
		List<Marchandise> liste = query.list();

		return liste;
	}

	// ===============methode : liste de marchandises par cargaison
	// routiere===================//

	@Override
	public List<Marchandise> getAllMarchandisesCr(CargaisonRoutiere cr) {

		// recuperation de la session
		Session s = sf.getCurrentSession();

		// requete hql
		String req = "FROM Marchandise m WHERE m.cargaisonRoutiere.ref=:pId";

		// creation du query
		Query query = s.createQuery(req);

		// recuperation des paramtres
		query.setParameter("pId", cr.getRef());

		// envoyer la requete et recuperation du resultat
		List<Marchandise> liste = query.list();

		return liste;
	}

	// ===============methode : recherche marchandise par son id
	// ===================//

	@Override
	public Marchandise getMarchandiseById(int id) {

		// recuperation de la session
		Session s = sf.getCurrentSession();

		return (Marchandise) s.get(Marchandise.class, id);
	}

	// ===============methode : ajouter marchandisese ===================//

	@Override
	public Marchandise addMarchandise(Marchandise mp) {

		// recuperation de la session
		Session s = sf.getCurrentSession();

		s.save(mp);

		return mp;
	}

	// ===============methode : supprimer marchandisese ===================//

	@Override
	public void deleteMarchandise(int id) {

		// recuperation de la session
		Session s = sf.getCurrentSession();

		// recuperation du pays par son id
		Marchandise mOut = (Marchandise) s.get(Marchandise.class, id);

		s.delete(mOut);
	}

	@Override
	public List<Marchandise> getAllMarchandises() {
		
		// recuperation de la session
		Session s = sf.getCurrentSession();

		// requete hql
		String req = "FROM Marchandise m";

		// creation du query
		Query query = s.createQuery(req);

		// envoyer la requete et recuperation du resultat
		List<Marchandise> liste = query.list();

		return liste;
	}

}
