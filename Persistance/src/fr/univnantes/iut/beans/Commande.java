package fr.univnantes.iut.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMMANDE", schema="ROOT")
public class Commande {
	@Id
	@Column(name="CODE")
	private Article article;
	@Column(name="ID_ADH")
	private Adherent adherent;
	@Column(name="QUANTITE")
	private int quantite;
	@Column(name="DATE_COMMANDE")
	private Date dateCommande;
	
	public Commande() {
	
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public Adherent getAdherent() {
		return adherent;
	}

	public void setAdherent(Adherent adherent) {
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
