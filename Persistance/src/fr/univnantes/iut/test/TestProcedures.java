package fr.univnantes.iut.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.beans.Article;
import fr.univnantes.iut.beans.Commande;
import fr.univnantes.iut.service.AdherentService;
import fr.univnantes.iut.service.ArticleService;
import fr.univnantes.iut.service.CommandeService;

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
		
		as.delete("coq_sportif38");
	}
	
	@Test
	public void testSuppretionAdherent() {
		AdherentService as = new AdherentService();
		
		as.delete("coq_sportif38");
	}
	
	@Test
	public void testAffichageAdherents() {
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

	@Test
	public void testCreationArticle() {
		ArticleService as = new ArticleService();
		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1);
		ar.setStock(50);
		as.create(ar);
		
		as.delete(ar);

	}
	
	@Test
	public void testSuppretionArticle() {
		ArticleService as = new ArticleService();
	
		as.delete(1);
	}
	
	@Test
	public void testAffichageArticles() {
		ArticleService as = new ArticleService();
		
		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(50);
		as.create(ar);
		
		Article ar1 = new Article();
		ar1.setNom("gomme");
		ar1.setPrix(2.70);
		ar1.setStock(25);
		as.create(ar1);
		
		System.out.println("ok");	
		for(Article a :as.listAll()){
			System.out.println(a.toString());
		}
		as.delete(ar);
		as.delete(ar1);
	}
	
	@Test
	public void testCreationCommande() {
		CommandeService cs = new CommandeService();
		AdherentService as = new AdherentService();
		ArticleService ars = new ArticleService();
		
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
		
		
		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(50);
		ars.create(ar);
		
		Commande co = new Commande();
		co.setAdherent("LeoNardo");
		co.setArticle(ar.getCode());
		co.setQuantite(2);
		co.setDateCommande(new Date());
		cs.create(co);
		
		
		cs.delete(co);
		as.delete(ad1);
		ars.delete(ar);
	}
	
	@Test
	public void testSuppretionCommande() {
		CommandeService cs = new CommandeService();
	
		cs.delete(1);
	}
	
	@Test
	public void testAffichageCommandes() {
		CommandeService cs = new CommandeService();
		AdherentService as = new AdherentService();
		ArticleService ars = new ArticleService();
		
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
		
		
		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(50);
		ars.create(ar);
		
		Commande co = new Commande();
		co.setAdherent("LeoNardo");
		co.setArticle(ar.getCode());
		co.setQuantite(2);
		co.setDateCommande(new Date());
		cs.create(co);
		
		Commande co2 = new Commande();
		co2.setAdherent("coq_sportif38");
		co2.setArticle(ar.getCode());
		co2.setQuantite(12);
		co2.setDateCommande(new Date());
		cs.create(co2);
			
		for(Commande c :cs.listAll()){
			System.out.println(c.toString());
		}
		
		cs.delete(co);
		cs.delete(co2);
		ars.delete(ar);
		as.delete(ad);
		as.delete(ad1);
	}

	@Test
	public void testChercherArticlesParAdherent() {
		ArticleService ars = new ArticleService();
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
	
		ars.listAll(ad.getId());
		
		as.delete(ad);
	} 

	@Test	
	public void testDiminuerStock() {
		AdherentService as = new AdherentService();
		ArticleService ars = new ArticleService();
		CommandeService cs = new CommandeService();
				
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
				
		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(50);
		ars.create(ar);
		
		Commande co = new Commande();
		co.setAdherent("LeoNardo");
		co.setArticle(ar.getCode());
		co.setQuantite(2);
		co.setDateCommande(new Date());
		cs.create(co);		
		
		
		//cs.delete(co);
		//ars.delete(ar);
		//as.delete(ad1);
		
	}
}
