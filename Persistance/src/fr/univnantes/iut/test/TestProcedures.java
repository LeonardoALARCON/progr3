package fr.univnantes.iut.test;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.service.AdherentService;

public class TestProcedures {

	@Test
	public void testCreationAdherent() {
		AdherentService as = new AdherentService();
		Adherent ad = new Adherent();
		ad.setId("coq_sportif38");
		ad.setMotPase("im_a_princess");
		ad.setNom("GILDAS");
		ad.setPrenom("LE COQ");
		ad.setAdresse("15, PONT SOUR L'ERDRE");
		ad.setCodePostal("44000");
		ad.setVille("NANTES");
		ad.setPays("FRANCE");
		as.create(ad);
		
	}
	
	@Test
	public void testSuppretionAdherent() {
		AdherentService as = new AdherentService();
		
		as.delete("coq_sportif38");
	}
	
	@Test
	public void testAffichageAdherents() {
		AdherentService as = new AdherentService();
		as.delete("coq_sportif38");
		as.delete("LeoNardo");
		
		Adherent ad = new Adherent();
		ad.setId("coq_sportif38");
		ad.setMotPase("im_a_princess");
		ad.setNom("GILDAS");
		ad.setPrenom("LE COQ");
		ad.setAdresse("15, PONT SOUR L'ERDRE");
		ad.setCodePostal("44000");
		ad.setVille("NANTES");
		ad.setPays("FRANCE");
		as.create(ad);
		
		Adherent ad1 = new Adherent();
		ad1.setId("LeoNardo");
		ad1.setMotPase("chocolat");
		ad1.setNom("Alarcon");
		ad1.setPrenom("leo");
		ad1.setAdresse("iut joffre");
		ad1.setCodePostal("44000");
		ad1.setVille("NANTES");
		ad1.setPays("FRANCE");
		as.create(ad1);
		
		System.out.println("ok");	
		for(Adherent a :as.listAll()){
			
			System.out.println(a.toString());
		}
		as.delete("coq_sportif38");
		as.delete("LeoNardo");

	}
	
}
