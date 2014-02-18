package fr.univnantes.iut.service;

import fr.univnantes.iut.beans.Adherent;

public class Test {

	public static void main(String[] args) {
		AdherentService adhServ = new AdherentService();
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
		System.out.println("Adherente créé");
		
		System.out.println(adhServ.find("coq_sportif38").toString());
		
		

	}

}
