package com.objis.cameroun.Rexam.service;

import com.objis.cameroun.Rexam.domaine.Eleve;

public class ServiceEleve {
	
	public void listesmethodes(IEleveService eleveservice) {
		//System.out.println(" "+eleveservice);
		Eleve eleve=new Eleve();
		
		eleveservice.bienvenue();
		eleveservice.enregistrereleves(eleve);
		eleveservice.afficherdonneeseleves(eleve);
	}
	

}
