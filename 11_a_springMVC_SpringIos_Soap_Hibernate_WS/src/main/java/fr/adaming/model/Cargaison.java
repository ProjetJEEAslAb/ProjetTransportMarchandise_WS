package fr.adaming.model;

import java.util.Date;

public abstract class Cargaison {

	// ==============attributs================//
	protected Long id;
	protected String ref;
	protected double distance;
	protected Date date;

	// ==============constructeur================//
	public Cargaison() {
		super();
	}

	public Cargaison(String ref, double distance, Date date) {
		super();
		this.ref = ref;
		this.distance = distance;
		this.date = date;
	}

	public Cargaison(Long id, String ref, double distance, Date date) {
		super();
		this.id = id;
		this.ref = ref;
		this.distance = distance;
		this.date = date;
	}

	// ==============getters et setters================//
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	// ===============methode tostring===================//

	@Override
	public String toString() {
		return "Cargaison [id=" + id + ", ref=" + ref + ", distance=" + distance + ", date=" + date + "]";
	}

}
