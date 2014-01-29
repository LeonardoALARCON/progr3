package fr.univnantes.iut.service;

import java.util.LinkedList;

import fr.univnantes.iut.bean.Article;


public class Service {

	public static LinkedList<Article> getCatalogue() {
		LinkedList<Article> catalogue = new LinkedList<Article>();
		catalogue.add(new Article(/*DONNES DE LA BASE*/));
		return catalogue;
	}
	
	public static LinkedList<Article> getCommande() {
		LinkedList<Article> commande = new LinkedList<Article>();
		commande.add(new Article(/*DONNES DE LA BASE*/));
		return commande;
	}
}
