package fr.univnantes.iut.service;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.beans.Article;
import fr.univnantes.iut.beans.Commande;

public class CommandeService {
	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private Query query;

	public CommandeService() {
		emf = Persistence.createEntityManagerFactory("jpa-assoc");
		System.out.println("EntityManager ready");
		em = emf.createEntityManager();
		System.out.println("EntityManager status : open ? " + em.isOpen());
	}

	public Commande find(int id) {
		return em.find(Commande.class, id);
	}

	public void delete(int id) {
		Commande commande = em.find(Commande.class, id);
		if (commande != null) {
			em.getTransaction().begin();
			em.remove(commande);
			em.getTransaction().commit();
		}
	}

	public void delete(Commande commande) {
		em.getTransaction().begin();
		em.remove(commande);
		em.getTransaction().commit();
	}

	public void create(Commande commande) {
		em.getTransaction().begin();
		em.persist(commande);
		em.getTransaction().commit();
		//Decrementer un article
		//ArticleService ars = new ArticleService();
		//ars.diminuerStock(ar.getCode,int quantité);
	}

	public void update(Commande commande) {
		em.getTransaction().begin();
		em.merge(commande);
		em.getTransaction().commit();
		//mettre a jour aussi
		//ArticleService ars = new ArticleService();
		//ars.diminuerStock(ar.getCode,int quantité);
	}

	public void closeConnection() {
		if (em.isOpen()) {
			em.close();
			emf.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Commande> listAll() {
		query = em.createNamedQuery("Commande.findAll");
		List<Commande> commandes = query.getResultList();
		return commandes;

	}
	
}
