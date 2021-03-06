package fr.formation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idpatient;
	private String nompatient;
	private String prenompatient;
	
	@OneToOne
	@JoinColumn(name="medecin")
	private Medecin idmedecin;


	public Patient(String nompatient, String prenompatient, Medecin idmedecin) {
		super();
		this.nompatient = nompatient;
		this.prenompatient = prenompatient;

		this.idmedecin = idmedecin;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdpatient() {
		return idpatient;
	}
	public void setIdpatient(long idpatient) {
		this.idpatient = idpatient;
	}
	public String getNompatient() {
		return nompatient;
	}
	public void setNompatient(String nompatient) {
		this.nompatient = nompatient;
	}
	public String getPrenompatient() {
		return prenompatient;
	}
	public void setPrenompatient(String prenompatient) {
		this.prenompatient = prenompatient;
	}
	

	public Medecin getIdmedecin() {
		return idmedecin;
	}
	public void setIdmedecin(Medecin idmedecin) {
		this.idmedecin = idmedecin;
	}
	@Override
	public String toString() {
		return "Patient [idpatient=" + idpatient + ", nompatient=" + nompatient + ", prenompatient=" + prenompatient
				+  ", idmedecin=" + idmedecin + "]";
	}


	

}
