package com.objis.cameroun.Rexam.service.impl;
import java.util.Scanner;

import com.objis.cameroun.Rexam.domaine.Eleve;
import com.objis.cameroun.Rexam.service.IEleveService;


/**Classe qui traite les savoir faire dont l'utilisateur fait appel
 * @version 1.0 rexam
 * @author youssouf
 *
 */
public class EleveService implements IEleveService {
	
	/**
	 * Methode qui permet d'afficher un message de bienvenue à l'utilisateur
	 */
	@Override
	public void bienvenue() {
		System.out.println("Bienvenue dans votre application de gestion de resultat des examens de fin d'annee");
		//System.out.println();
		System.out.println("Saisissez les donnees de l'eleve");
		System.out.println();
		return;
	}
	
	
	/**
	 * Methode qui permet d'enregistrer les élèves et qui a comme paramètre la variable eleve de type Eleve
	 * @param eleve
	 */
	@Override
	public void enregistrereleves(Eleve eleve) {
		
		
		Scanner ee=new Scanner(System.in);
		System.out.print("Saisir matricule de l'eleve: "); 
		eleve.setMatricule(ee.nextLine());
		System.out.print("Saisir Nom et prenom de l'eleve: ");
		eleve.setNomprenom(ee.nextLine());
		System.out.print("Saisir Date de naissance de l'eleve: ");
		eleve.setDatenaissance(ee.nextLine());
		System.out.print("Saisir Lieu de naissance de l'eleve: ");
		eleve.setLieunaissance(ee.nextLine());
		System.out.print("Saisir Serie de l'eleve: ");
		eleve.setSerie(ee.nextLine());
		System.out.print("Saisir la Decision du jury: ");
		eleve.setDecisionjuge(ee.nextLine());
		System.out.println();
		return;
		
	}
	
	


	/**
	 * Methode qui permet d'afficher les données de l'élève notament le matricule, Nom et prenom, Date de naissance, Lieu de naissance, Serie, Decision du jury
	 * @param eleve
	 */
	@Override
	public void afficherdonneeseleves(Eleve eleve) {
		String tableaueleves[]= {eleve.getMatricule(),eleve.getNomprenom(),eleve.getDatenaissance(),eleve.getLieunaissance(),eleve.getSerie(),eleve.getDecisionjuge()};
		for(int i=0; i<tableaueleves.length;i++) {
			System.out.println(tableaueleves[i]);
			
		}
		
	}


	
}
