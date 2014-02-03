package fr.univnantes.iut.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Author;
import fr.univnantes.iut.beans.Adherent;

public class AdherentService {
	private EntityManagerFactory emf;
	private EntityManager em;

	public AdherentService() {
		emf = Persistence.createEntityManagerFactory("td");
		em = emf.createEntityManager();
	}

	public Adherent find(int id) {
		return em.find(Adherent.class, id);
	}

	public void create(Adherent a) {
		Adherent ad = em.find(Author.class, a.getId());
		em.getTransaction().begin();
		em.persist(ad);
		if (em.contains(ad)){
			System.out.println("Adhérant : "+ad+" ajouté");
		}
		em.getTransaction().commit();
	}

}
