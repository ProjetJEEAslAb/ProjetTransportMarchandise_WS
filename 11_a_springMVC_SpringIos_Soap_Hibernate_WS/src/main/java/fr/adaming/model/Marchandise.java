package fr.adaming.model;

import java.io.Serializable;

public class Marchandise implements Serializable {

	// ==============attributs================//
	private Long id;
	private String nom;
	private double poids;
	private double volume;

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

	// ===============methode tostring===================//
	
	@Override
	public String toString() {
		return "Marchandise [id=" + id + ", nom=" + nom + ", poids=" + poids + ", volume=" + volume + "]";
	}

}
