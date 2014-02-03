package fr.univnantes.iut.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
		em.persist(a);
	}

}
