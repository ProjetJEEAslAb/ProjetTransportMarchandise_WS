package fr.adaming.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Transient;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Cargaison {

	// ==============attributs================//
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected String ref;
	protected double distance;
	protected Date date;

	
	// ==============constructeur================//
	public Cargaison() {
		super();
	}

	public Cargaison(double distance, Date date) {
		super();
		this.distance = distance;
		this.date = date;
	}

	public Cargaison(String ref, double distance, Date date) {
		super();
		this.ref = ref;
		this.distance = distance;
		this.date = date;
	}

	// ==============getters et setters================//
	

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
		return "Cargaison [ref=" + ref + ", distance=" + distance + ", date=" + date + "]";
	}

}
