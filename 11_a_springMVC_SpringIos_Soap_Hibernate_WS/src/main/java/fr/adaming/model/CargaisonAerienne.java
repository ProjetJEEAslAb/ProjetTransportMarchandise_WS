package fr.adaming.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ca")
public class CargaisonAerienne extends Cargaison {

	// ==============attributs================//
	private double poidsMax;

	// ==========transformation de l'association uml en java============//
	@OneToMany(mappedBy="cargaisonAerienne",cascade=CascadeType.ALL)
	private List<Marchandise> listeMarchandise;
	
	// ==============constructeur================//
	public CargaisonAerienne() {
		super();
	}

	public CargaisonAerienne(double distance, Date date, double poidsMax) {
		super(distance, date);
		this.poidsMax = poidsMax;
	}

	public CargaisonAerienne(String ref, double distance, Date date, double poidsMax) {
		super(ref, distance, date);
		this.poidsMax = poidsMax;
	}

	// ==============getters et setters================//

	public double getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}
	// ===============methode tostring===================//

}
