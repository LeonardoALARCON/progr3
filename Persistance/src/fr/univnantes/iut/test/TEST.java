package fr.univnantes.iut.test;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import org.junit.Test;

import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.service.AdherentService;

public class TEST {

	@Test
	public void testBDD() {			
		AdherentService as = new AdherentService();

		/*Adherent ad = new Adherent();
		ad.setId("coq_sportif38");
		ad.setMotPase("im_a_princess");
		ad.setNom("GILDAS");
		ad.setPrenom("LE COQ");
		ad.setAdresse("15, PONT SOUR L'ERDRE");
		ad.setCodePostal("44000");
		ad.setVille("NANTES");
		ad.setPays("FRANCE");
		as.create(ad);
				
		as.listAll();*/
	}
}
