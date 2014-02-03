package fr.univnantes.iut.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import services.AdherantService;
import entities.Adherant;

public class TEST {

	@Test
	public void testBDD() {
		public static void main(String[] args) { 
			EntityManagerFactory emf =	Persistence.createEntityManagerFactory("td");
			// Récupération d’une instance de "EntityManager"
				EntityManager em = emf.createEntityManager(); 
				// Utilisation de l’ "EntityManager" ...
				System.out.println("EntityManager open ? "+ em.isOpen());
				
				AdherantService as = new AdherantService(emf, em);

				Adherent ad = new Adherent();
				ad.setId("");
				ad.setMotPasse("");
				ad.setnom("");
				ad.setPrenom("");
				ad.setAdresse("");
				ad.setCodePostal("");
				ad.setVille("");
				ad.setPays("");
				
				as.create(a);
				
				as.list(ad.getId());
								
				// Fermeture de l’ "EntityManager"
				em.close(); 
			emf.close();
	}

}
