package les_dates;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nomMois = { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "juillet", "Aout", "Septembre",
				"Octobre", "Novembre", "Decembre" };
		int[] jours= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31}; 
		boolean valeur_saisie;
		int indice = 0;
		int indice_jours = 0;
		int numero_mois;
		String leNomDuMois;
		// Debut

		// Initialisation
				valeur_saisie = false;
				
			
				
				
					System.out.println("Veuillez saisir le numero du mois");
					numero_mois = sc.nextInt();
			
					for (int i = 1; i < nomMois.length; i++) {
						indice = i + 1;
						leNomDuMois = nomMois[i];
						if(indice == numero_mois) {
								System.out.println( nomMois[i]);
							}
						}
					for(int j = 1; j< jours.length; j++) {
						indice_jours = j-1;
						
						if(indice_jours % 2 == 1) {
							System.out.print(jours[indice_jours]);
						}else if(indice_jours % 2== 0) {
							System.out.print(jours[indice_jours]);
						}
					
					}
					
				

	sc.close();	// Fin

	}

}
