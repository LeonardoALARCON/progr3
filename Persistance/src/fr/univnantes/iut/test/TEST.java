package fr.univnantes.iut.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import service.AdherantService;
import entitie.Adherant;

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
				ad.setId("coq_sportif38");
				ad.setMotPasse("im_a_princess");
				ad.setnom("GILDAS");
				ad.setPrenom("LE COQ");
				ad.setAdresse("15, PONT SOUR L'ERDRE");
				ad.setCodePostal("44000");
				ad.setVille("NANTES");
				ad.setPays("FRANCE");

				as.create(ad);
				
				as.list(ad.getId());
								
				// Fermeture de l’ "EntityManager"
				em.close(); 
			emf.close();
	}

}
