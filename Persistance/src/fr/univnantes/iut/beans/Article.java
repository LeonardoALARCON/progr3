package fr.univnantes.iut.beans;

import java.util.Collection;

import javax.persistence.*;

@Entity
@NamedQueries({ @NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a") })
@Table(name = "CATALOGUE", schema = "ASSOC")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "CODE")
	private int code;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRIX")
	private double prix;
	@Column(name = "STOCK")
	private int stock;
	@OneToMany(mappedBy = "article")
	private Collection<Commande> commandes;

	public Article() {

	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Collection<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}

	public String toString() {
		return "Adherent [code=" + code + ", nom=" + nom + ", prix=" + prix
				+ ", stock=" + stock + "]";
	}

}
