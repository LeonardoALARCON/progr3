package fr.univnantes.iut.beans;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@NamedQueries({ @NamedQuery(name = "Article.findAll", 
query = "SELECT a FROM Article a") })
@Table(name="CATALOGUE", schema="ROOT")
public class Article {
	@Id
	@Column(name="CODE")
	@NotNull
	@Min(1)
	private int code;
	
	@Column(name="NOM")
	@NotNull
	@Size(min = 1, max = 20)
	private String nom;
	
	@Column(name="PRIX")
	@NotNull
	@DecimalMin("0.01")
	private double prix;
	
	@Column(name="STOCK")
	@NotNull
	@Min(0)
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

}
