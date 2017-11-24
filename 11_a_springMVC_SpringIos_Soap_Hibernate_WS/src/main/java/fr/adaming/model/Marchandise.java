package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="marchandises")
public class Marchandise implements Serializable {

	// ==============attributs================//
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private double poids;
	private double volume;

	@ManyToOne
	@JoinColumn(name="cargRout_id", referencedColumnName="ref")
	private CargaisonRoutiere cargaisonRoutiere;
	
	@ManyToOne
	@JoinColumn(name="cargAer_id", referencedColumnName="ref")
	private CargaisonAerienne cargaisonAerienne;
	
	
	// ==============constructeur================//

	public Marchandise() {
		super();
	}

	public Marchandise(String nom, double poids, double volume) {
		super();
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}

	public Marchandise(Long id, String nom, double poids, double volume) {
		super();
		this.id = id;
		this.nom = nom;
		this.poids = poids;
		this.volume = volume;
	}

	// ==============getters et setters================//
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public CargaisonRoutiere getCargaisonRoutiere() {
		return cargaisonRoutiere;
	}

	public void setCargaisonRoutiere(CargaisonRoutiere cargaisonRoutiere) {
		this.cargaisonRoutiere = cargaisonRoutiere;
	}

	public CargaisonAerienne getCargaisonAerienne() {
		return cargaisonAerienne;
	}

	public void setCargaisonAerienne(CargaisonAerienne cargaisonAerienne) {
		this.cargaisonAerienne = cargaisonAerienne;
	}
	
	// ===============methode tostring===================//
	
	@Override
	public String toString() {
		return "Marchandise [id=" + id + ", nom=" + nom + ", poids=" + poids + ", volume=" + volume + "]";
	}

}
