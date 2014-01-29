package fr.univnantes.iut.bean;

public class Article {
	//attributs
	private String code;
	private String nom;
	private double prix;
	private int stock;
	
	//constructeurs
	public Article() {
	}
	
	public Article(String code, String nom, double prix, int stock) {
		super();
		this.code = code;
		this.nom = nom;
		this.prix = prix;
		this.stock = stock;
	}
	
	//accesseurs
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
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
