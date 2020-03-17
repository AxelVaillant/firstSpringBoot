package fr.formation.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Medecin {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long idmedecin;
	private String nommedecin;
	private String prenommedecin;
	@ManyToOne
	@JoinColumn(name="hopital")
	private Hopital nomhopital;
	@ManyToOne
	@JoinColumn(name="patient")
	private Patient idpatient;

	public Medecin(long idmedecin, String nommedecin, String prenommedecin) {
		super();
		this.idmedecin = idmedecin;
		this.nommedecin = nommedecin;
		this.prenommedecin = prenommedecin;

	}
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdmedecin() {
		return idmedecin;
	}
	public void setIdmedecin(long idmedecin) {
		this.idmedecin = idmedecin;
	}
	public String getNommedecin() {
		return nommedecin;
	}
	public void setNommedecin(String nommedecin) {
		this.nommedecin = nommedecin;
	}
	public String getPrenommedecin() {
		return prenommedecin;
	}
	public void setPrenommedecin(String prenommedecin) {
		this.prenommedecin = prenommedecin;
	}
	
	public Hopital getNomhopital() {
		return nomhopital;
	}
	public void setNomhopital(Hopital nomhopital) {
		this.nomhopital = nomhopital;
	}
	public Patient getIdpatient() {
		return idpatient;
	}
	public void setIdpatient(Patient idpatient) {
		this.idpatient = idpatient;
	}
	@Override
	public String toString() {
		return "Medecin [idmedecin=" + idmedecin + ", nommedecin=" + nommedecin + ", prenommedecin=" + prenommedecin
				+ "]";
	}

	
	
	
}
