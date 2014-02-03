package fr.univnantes.iut.service;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.univnantes.iut.beans.Article;

public class ArticleService {
	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private Query query;

	public ArticleService() {
		emf = Persistence.createEntityManagerFactory("jpa-assoc");
		System.out.println("EntityManager ready");
		em = emf.createEntityManager();
		System.out.println("EntityManager status : open ? " + em.isOpen());
	}

	public Article find(int id) {
		return em.find(Article.class, id);
	}

	public void delete(int id) {
		Article article = em.find(Article.class, id);
		if (article != null) {
			em.getTransaction().begin();
			em.remove(article);
			em.getTransaction().commit();
		}
	}

	public void delete(Article article) {
		em.getTransaction().begin();
		em.remove(article);
		em.getTransaction().commit();
	}

	public void create(Article article) {
		em.getTransaction().begin();
		em.persist(article);
		em.getTransaction().commit();
	}

	public void update(Article article) {
		em.getTransaction().begin();
		em.merge(article);
		em.getTransaction().commit();
	}

	public void closeConnection() {
		if (em.isOpen()) {
			em.close();
			emf.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Article> listAll() {
		query = em.createNamedQuery("Article.findAll");
		List<Article> articles = query.getResultList();
		return articles;

	}

}
