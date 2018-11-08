package com.objis.cameroun.Rexam.presentation;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.objis.cameroun.Rexam.domaine.Eleve;
import com.objis.cameroun.Rexam.service.ServiceEleve;
import com.objis.cameroun.Rexam.service.impl.EleveService;



/**interface entre utilisateur final et le programme
 * @author youssouf
 *@version 1.0 rexam
 */
public class AccueilEleve {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char reponse='O';
		while (reponse=='O')
		{
			EleveService es=new EleveService();
			ServiceEleve se=new ServiceEleve();
			se.listesmethodes(es);
		/*EleveService eleveservice=new EleveService(); //Creation de l'objet(l'instance de la classe EleveService) et affectation dans une variable(réference de l'objet) eleveservice de type EleveService (via cet objet nous pourrons au besoin faire appel à un savoir faire de la classe EleveService se trouvant dans la couche service)
		Eleve eleve=new Eleve(); 
		eleveservice.bienvenue(); //Appel de la methode bienvenue de la classe EleveService
		
		eleveservice.enregistrereleves(eleve); //Appel de la methode enregistrereleves de la classe EleveService. cette methode permet d'enregistrer un élève
		eleveservice.afficherdonneeseleves(eleve); //Appel de la methode afficherdonneeseleves de la classe EleveService. */
		System.out.println("voulez vous reessayer? O/N");
		reponse=sc.nextLine().charAt(0);
		}
		
		// Fenetre Au revoir
		JFrame frame = new JFrame("Rexam");
		frame.getContentPane().setBackground(Color.white);
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(300,100));
        frame.setLocationRelativeTo(null);
       
        frame.getContentPane().add(new JLabel("                Au revoir."));
        
        frame.setVisible(true);
	}
	}