package fr.adaming.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cargaisonroutiere")
public class CargaisonRoutiere extends Cargaison {

	// ==============attributs================//

	private double temperature;

	// ==============constructeur================//
	public double getTemperature() {
		return temperature;
	}

	public CargaisonRoutiere(double distance, Date date, double temperature) {
		super(distance, date);
		this.temperature = temperature;
	}

	public CargaisonRoutiere(String ref, double distance, Date date, double temperature) {
		super(ref, distance, date);
		this.temperature = temperature;
	}

	// ==========transformation de l'association uml en java============//
	@OneToMany(mappedBy="cargAerienne")
	private List<Marchandise> listeMarchandise;

	// ==============getters et setters================//

	public CargaisonRoutiere() {
		super();
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	// ===============methode tostring===================//

}
