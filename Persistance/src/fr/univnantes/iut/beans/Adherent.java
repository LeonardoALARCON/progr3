package fr.univnantes.iut.beans;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.*;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@NamedQueries({ @NamedQuery(name = "Adherent.findAll", query = "SELECT a FROM Adherent a") })
@Table(name = "ADHERANT", schema = "ASSOC")
public class Adherent {
	@Id
	@Column(name = "ID_ADH")
	@NotNull
	private String id;
	@Column(name = "MDP")
	private String motPasse;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "ADRESSE")
	private String adresse;
	@Column(name = "CP")
	private String codePostal;
	@Column(name = "VILLE")
	private String ville;
	@Column(name = "PAYS")
	private String pays;
	@OneToMany(mappedBy = "adherent")
	private Collection<Commande> commandes;

	public Adherent() {

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

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public Collection<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}

	public String toString() {
		return "Adherent [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", pays=" + pays + "]";
	}

}
