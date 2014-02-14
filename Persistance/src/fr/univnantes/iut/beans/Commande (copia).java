package fr.univnantes.iut.beans;

import java.util.Date;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Entity
@NamedQueries({ @NamedQuery(name = "Commande.findAll", 
query = "SELECT c FROM Commande c") })
@Table(name="COMMANDE", schema="ROOT")
public class Commande {
	@Id
	@Column(name="CODE")
	@NotNull
	private int code;
	
	@NotNull
	@Valid
	private Article article;
	
	@Column(name="ID_ADH")
	@NotNull
	@Valid
	private Adherent adherent;
	
	@Column(name="QUANTITE")
	@Min(1)
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

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	
}
