package fr.univnantes.iut.beans;

import javax.persistence.*;

@Entity
@NamedQueries({ @NamedQuery(name = "Article.findAll", 
query = "SELECT a FROM Article a") })
@Table(name="CATALOGUE", schema="ASSOC")
public class Article {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
	@Column(name="CODE")
	private int code;
	@Column(name="NOM")
	private String nom;
	@Column(name="PRIX")
	private double prix;
	@Column(name="STOCK")
	private int stock;
	
	public Article(){
		
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
	
		
	public String toString() {
		return "Adherent [code=" + code + ", nom=" + nom + ", prix="
				+ prix + ", stock=" + stock +"]";
	}


}
