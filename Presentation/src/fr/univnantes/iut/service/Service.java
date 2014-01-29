package fr.univnantes.iut.service;

import java.util.LinkedList;

import fr.univnantes.iut.bean.Article;


public class Service {

	/**
	 * Genere un catalogue avec tout les article contenuent dans la base.
	 * @return
	 */
	public static LinkedList<Article> getCatalogue() {
		LinkedList<Article> catalogue = new LinkedList<Article>();
		catalogue.add(new Article(/*DONNES DE LA BASE*/));
		return catalogue;
	}
	
	/**
	 * Retrouve tout les produits commandé en fonction d'un identifant.
	 * Les produits sont retournées sous format d'une liste.
	 * @return
	 */
	public static LinkedList<Article> getCommande() {
		LinkedList<Article> commande = new LinkedList<Article>();
		commande.add(new Article(/*DONNES DE LA BASE*/));
		return commande;
	}
}
