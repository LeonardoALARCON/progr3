package fr.univnantes.iut.test;


import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.service.AdherentService;

public class TestBase {

	public static void main(String[] args) {
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
		as.create(ad);
		as.create(ad1);
		
		System.out.println("ok");	
		for(Adherent a :as.listAll()){
			
			System.out.println(a.toString());
		}
		
		as.delete("coq_sportif38");
		as.delete("LeoNardo");

	}

}
