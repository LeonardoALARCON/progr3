package fr.univnantes.iut.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.*;



@Entity
@NamedQueries({ @NamedQuery(name = "Adherent.findAll", 
query = "SELECT a FROM Adherent a") })
@Table(name="ADHERANT", schema="ROOT")
public class Adherent {
	@Id
	@Column(name="ID_ADH")
	@NotNull
	@Size(min = 1, max = 20)
	private String id;
	
	@Column(name="MDP")
	@NotNull
	@Size(min = 1, max = 20)
	private String motPasse;
	
	@Column(name="NOM")
	@NotNull
	@Size(min = 1, max = 20)
	private String nom;
	
	@Column(name="PRENOM")
	@NotNull
	@Size(min = 1, max = 20)
	private String prenom;
	
	@Column(name="ADRESSE")
	@NotNull
	@Size(min = 1, max = 60)
	private String adresse;
	
	@Column(name="CP")
	@NotNull
	@Size(min=5, max=5)
	private String codePostal;
	
	@Column(name="VILLE")
	@NotNull
	@Size(min = 1, max = 20)
	private String ville;
	
	@Column(name="PAYS")
	@NotNull
	@Size(min = 1, max = 20)
	private String pays;
	
	public Adherent(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMotPase() {
		return motPasse;
	}

	public void setMotPase(String motPase) {
		this.motPasse = motPase;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
}
