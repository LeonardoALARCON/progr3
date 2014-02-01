package fr.univnantes.iut.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CATALOGUE", schema="ROOT")
public class Article {
	@Id
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

}
