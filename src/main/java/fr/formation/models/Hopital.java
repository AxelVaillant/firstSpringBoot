package fr.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hopital {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_hopital")
	private long idhopital;
	private String nomhopital;
	private String lieuhopital;
	private int capacite;
	public Hopital(long idhopital, String nomhopital, String lieuhopital, int capacite) {
		super();
		this.idhopital = idhopital;
		this.nomhopital = nomhopital;
		this.lieuhopital = lieuhopital;
		this.capacite = capacite;
	}
	public Hopital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdhopital() {
		return idhopital;
	}
	public void setIdhopital(long idhopital) {
		this.idhopital = idhopital;
	}
	public String getNomhopital() {
		return nomhopital;
	}
	public void setNomhopital(String nomhopital) {
		this.nomhopital = nomhopital;
	}
	public String getLieuhopital() {
		return lieuhopital;
	}
	public void setLieuhopital(String lieuhopital) {
		this.lieuhopital = lieuhopital;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	@Override
	public String toString() {
		return "Hopital [idhopital=" + idhopital + ", nomhopital=" + nomhopital + ", lieuhopital=" + lieuhopital
				+ ", capacite=" + capacite + "]";
	}

	
	
	
}
