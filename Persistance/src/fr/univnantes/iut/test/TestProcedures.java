package fr.univnantes.iut.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.beans.Article;
import fr.univnantes.iut.beans.Commande;
import fr.univnantes.iut.service.AdherentService;
import fr.univnantes.iut.service.ArticleService;
import fr.univnantes.iut.service.CommandeService;

public class TestProcedures {

	private ArticleService arServ;
	private AdherentService adhServ;
	private CommandeService comServ;

	@Before
	public void Init() {
		arServ = new ArticleService();
		adhServ = new AdherentService();
		comServ = new CommandeService();
	}

	@Test
	public void testCreationAdherent() {
		Adherent ad = new Adherent();
		ad.setId("coq_sportif38");
		ad.setMotPase("im_a_princess");
		ad.setNom("GILDAS");
		ad.setPrenom("LE COQ");
		ad.setAdresse("15, PONT SOUR L'ERDRE");
		ad.setCodePostal("44000");
		ad.setVille("NANTES");
		ad.setPays("FRANCE");
		adhServ.create(ad);
		assertNotNull(adhServ.find(ad.getId()));
		adhServ.delete(ad.getId());
	}

	@Test
	public void testSuppretionAdherent() {

		Adherent ad = new Adherent();
		ad.setId("coq_sportif38");
		ad.setMotPase("im_a_princess");
		ad.setNom("GILDAS");
		ad.setPrenom("LE COQ");
		ad.setAdresse("15, PONT SOUR L'ERDRE");
		ad.setCodePostal("44000");
		ad.setVille("NANTES");
		ad.setPays("FRANCE");
		adhServ.create(ad);
		String id = "coq_sportif38";
		adhServ.delete(id);
		assertNull(adhServ.find(id));
	}

	@Test
	public void testAffichageAdherents() {
		Adherent ad = new Adherent();
		ad.setId("coq_sportif38");
		ad.setMotPase("im_a_princess");
		ad.setNom("GILDAS");
		ad.setPrenom("LE COQ");
		ad.setAdresse("15, PONT SOUR L'ERDRE");
		ad.setCodePostal("44000");
		ad.setVille("NANTES");
		ad.setPays("FRANCE");
		adhServ.create(ad);

		Adherent ad1 = new Adherent();
		ad1.setId("LeoNardo");
		ad1.setMotPase("chocolat");
		ad1.setNom("Alarcon");
		ad1.setPrenom("leo");
		ad1.setAdresse("iut joffre");
		ad1.setCodePostal("44000");
		ad1.setVille("NANTES");
		ad1.setPays("FRANCE");
		adhServ.create(ad1);

		System.out.println("testAffichageAdherents:");

		List<Adherent> ads = adhServ.listAll();
		assertFalse(ads.isEmpty());
		for (Adherent a : ads) {

			System.out.println(a.toString());
		}
		System.out.println("==============================");
		adhServ.delete("coq_sportif38");
		adhServ.delete("LeoNardo");

	}

	@Test
	public void testCreationArticle() {

		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1);
		ar.setStock(50);
		arServ.create(ar);
		assertNotNull(arServ.find(ar.getCode()));
		arServ.delete(ar);

	}

	@Test
	public void testSuppretionArticle() {
		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1);
		ar.setStock(50);
		arServ.create(ar);
		arServ.delete(ar);
		assertNull(arServ.find(ar.getCode()));
	}

	@Test
	public void testAffichageArticles() {

		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(50);
		arServ.create(ar);

		Article ar1 = new Article();
		ar1.setNom("gomme");
		ar1.setPrix(2.70);
		ar1.setStock(25);
		arServ.create(ar1);

		System.out.println("testAffichageAdherents:");
		List<Article> articles = arServ.listAll();
		assertFalse(articles.isEmpty());
		for (Article a : articles) {
			System.out.println(a.toString());
		}
		System.out.println("==============================");
		arServ.delete(ar);
		arServ.delete(ar1);
	}

	@Test
	public void testCreationCommande() {

		Adherent ad1 = new Adherent();
		ad1.setId("LeoNardo");
		ad1.setMotPase("chocolat");
		ad1.setNom("Alarcon");
		ad1.setPrenom("leo");
		ad1.setAdresse("iut joffre");
		ad1.setCodePostal("44000");
		ad1.setVille("NANTES");
		ad1.setPays("FRANCE");
		adhServ.create(ad1);

		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(50);
		arServ.create(ar);

		Commande co = new Commande();
		co.setAdherent(ad1);
		co.setArticle(ar);
		co.setQuantite(2);
		co.setDateCommande(new Date());
		comServ.create(co);

		assertNotNull(comServ.find(co.getId()));
		comServ.delete(co);
		adhServ.delete(ad1);
		arServ.delete(ar);
	}

	@Test
	public void testSuppretionCommande() {
		Adherent ad1 = new Adherent();
		ad1.setId("LeoNardo");
		ad1.setMotPase("chocolat");
		ad1.setNom("Alarcon");
		ad1.setPrenom("leo");
		ad1.setAdresse("iut joffre");
		ad1.setCodePostal("44000");
		ad1.setVille("NANTES");
		ad1.setPays("FRANCE");
		adhServ.create(ad1);

		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(50);
		arServ.create(ar);

		Commande co = new Commande();
		co.setAdherent(ad1);
		co.setArticle(ar);
		co.setQuantite(2);
		co.setDateCommande(new Date());
		comServ.create(co);

		comServ.delete(co);
		adhServ.delete(ad1);
		arServ.delete(ar);
		assertNull(comServ.find(co.getId()));

	}

	@Test
	public void testAffichageCommandes() {

		Adherent ad = new Adherent();
		ad.setId("coq_sportif38");
		ad.setMotPase("im_a_princess");
		ad.setNom("GILDAS");
		ad.setPrenom("LE COQ");
		ad.setAdresse("15, PONT SOUR L'ERDRE");
		ad.setCodePostal("44000");
		ad.setVille("NANTES");
		ad.setPays("FRANCE");
		adhServ.create(ad);

		Adherent ad1 = new Adherent();
		ad1.setId("LeoNardo");
		ad1.setMotPase("chocolat");
		ad1.setNom("Alarcon");
		ad1.setPrenom("leo");
		ad1.setAdresse("iut joffre");
		ad1.setCodePostal("44000");
		ad1.setVille("NANTES");
		ad1.setPays("FRANCE");
		adhServ.create(ad1);

		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(50);
		arServ.create(ar);

		Commande co = new Commande();
		co.setAdherent(ad1);
		co.setArticle(ar);
		co.setQuantite(2);
		co.setDateCommande(new Date());
		comServ.create(co);

		Commande co2 = new Commande();
		co2.setAdherent(ad);
		co2.setArticle(ar);
		co2.setQuantite(12);
		co2.setDateCommande(new Date());
		comServ.create(co2);

		List<Commande> commandes = comServ.listAll();
		assertFalse(commandes.isEmpty());
		System.out.println("Affichage de commandes");
		for (Commande c : commandes) {
			System.out.println(c.toString());
		}
		System.out.println("================================");
		comServ.delete(co);
		comServ.delete(co2);
		arServ.delete(ar);
		adhServ.delete(ad);
		adhServ.delete(ad1);
	}

	@Test
	public void testChercherArticlesParAdherent() {
		Adherent ad1 = new Adherent();
		ad1.setId("LeoNardo");
		ad1.setMotPase("chocolat");
		ad1.setNom("Alarcon");
		ad1.setPrenom("leo");
		ad1.setAdresse("iut joffre");
		ad1.setCodePostal("44000");
		ad1.setVille("NANTES");
		ad1.setPays("FRANCE");
		adhServ.create(ad1);

		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(50);
		arServ.create(ar);

		Commande co = new Commande();
		co.setAdherent(ad1);
		co.setArticle(ar);
		co.setQuantite(2);
		co.setDateCommande(new Date());
		comServ.create(co);

		List<Article> articles = arServ.listAll(ad1);
		System.out
				.println("en usant arServ.listall(): ========================\n"
						+ articles
						+ "\n==============================================");
		assertTrue(articles.contains(ar));
		comServ.delete(co);
		adhServ.delete(ad1);
		arServ.delete(ar);
		
	}

	@Test
	public void testDiminuerStock() {
		int stockInit = 50;
		int quantite = 2;
		
		Adherent ad1 = new Adherent();
		ad1.setId("LeoNardo");
		ad1.setMotPase("chocolat");
		ad1.setNom("Alarcon");
		ad1.setPrenom("leo");
		ad1.setAdresse("iut joffre");
		ad1.setCodePostal("44000");
		ad1.setVille("NANTES");
		ad1.setPays("FRANCE");
		adhServ.create(ad1);

		Article ar = new Article();
		ar.setNom("Crayon");
		ar.setPrix(1.50);
		ar.setStock(stockInit);
		arServ.create(ar);

		Commande co = new Commande();
		co.setAdherent(ad1);
		co.setArticle(ar);
		co.setQuantite(quantite);
		co.setDateCommande(new Date());
		comServ.create(co);
		assertTrue(ar.getStock() == stockInit - quantite);
		comServ.delete(co);
		arServ.delete(ar);
		adhServ.delete(ad1);

	}
}
