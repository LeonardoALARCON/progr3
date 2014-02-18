package fr.univnantes.iut.beans;

import java.util.Date;

import javax.persistence.*;

@Entity
@NamedQueries({
	@NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c"),
	@NamedQuery(name="Commande.findByAdherent",
    query="SELECT c FROM Commande c " +
          "WHERE c.adherent = :adherent")
})
@Table(name = "COMMANDE", schema = "ASSOC")
public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID")
	private int id;
	@ManyToOne
	@JoinColumn(name = "CODE")
	private Article article;
	@ManyToOne
	@JoinColumn(name = "ID_ADH")
	private Adherent adherent;
	@Column(name = "QUANTITE")
	private int quantite;
	@Column(name = "DATE_COMMANDE")
	private Date dateCommande;

	public Commande() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String toString() {
		return "Adherent [article=" + article + ", adherent=" + adherent
				+ ", quantit�=" + quantite + ", date de la commande="
				+ dateCommande + "]";
	}

}
