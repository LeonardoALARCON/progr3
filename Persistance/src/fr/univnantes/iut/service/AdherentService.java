package fr.univnantes.iut.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import fr.univnantes.iut.beans.Adherent;

public class AdherentService {
	private EntityManagerFactory emf = null;
	private EntityManager em = null;
	private Query query;

	public AdherentService() {
		emf = Persistence.createEntityManagerFactory("jpa-assoc");
		System.out.println("EntityManager ready");
		em = emf.createEntityManager();
		System.out.println("EntityManager status : open ? " + em.isOpen());
	}

	public Adherent find(int id) {
		return em.find(Adherent.class, id);
	}

	public void delete(int id) {
		Adherent adherent = em.find(Adherent.class, id);
		if (adherent != null) {
			em.getTransaction().begin();
			em.remove(adherent);
			em.getTransaction().commit();
		}
	}

	public void delete(Adherent adherent) {
		em.getTransaction().begin();
		em.remove(adherent);
		em.getTransaction().commit();
	}

	public void create(Adherent adherent) {
		em.getTransaction().begin();
		em.persist(adherent);
		em.getTransaction().commit();
	}

	public void update(Adherent adherent) {
		em.getTransaction().begin();
		em.merge(adherent);
		em.getTransaction().commit();
	}

	public void closeConnection() {
		if (em.isOpen()) {
			em.close();
			emf.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Adherent> listAll() {
		query = em.createNamedQuery("Adherent.findAll");
		List<Adherent> adherents = query.getResultList();
		return adherents;
	}

}
