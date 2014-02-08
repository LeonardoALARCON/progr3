package fr.univnantes.iut.beans;

import java.util.Date;

import javax.persistence.*;

@Entity
@NamedQueries({ @NamedQuery(name = "Commande.findAll", 
query = "SELECT c FROM Commande c") })
@Table(name="COMMANDE", schema="ASSOC")
public class Commande {
	@Id
	@Column(name="CODE")
	private int article;
	@Column(name="ID_ADH")
	private int adherent;
	@Column(name="QUANTITE")
	private int quantite;
	@Column(name="DATE_COMMANDE")
	private Date dateCommande;
	
	public Commande() {
	
	}

	public int getArticle() {
		return article;
	}

	public void setArticle(int article) {
		this.article = article;
	}

	public int getAdherent() {
		return adherent;
	}

	public void setAdherent(int adherent) {
		this.adherent = adherent;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	
	
	
}
