package DM1;
import java.util.*;
public class GUIDE {

	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args) {
		char choix;
		DEPARTEMENT d=new DEPARTEMENT();
		String[] tab;
		String nomHotel,adresseHotel,nbClients,infoHotel;
		String ville;
		int i,nbHotels;
		boolean bool;

		//ajouter une ville et ses hotels
		System.out.println("Voulez-vous ajouter une ville (O/N)?");
		choix=sc.nextLine().charAt(0);
		
		while(choix=='O') {
			System.out.println("Quel est le nom de cette ville?");
			ville=sc.nextLine();
			System.out.println("Combien d'hotels possède cette ville?");
			nbHotels=Integer.parseInt(sc.nextLine());
			
			tab=new String[nbHotels];
			for(i=0;i<nbHotels;i++) {
				
				System.out.println("Quel est le nom de l'hotel ?");
				nomHotel=sc.nextLine();
				System.out.println("Entrez l'adresse de l'hotel : ");
				adresseHotel=sc.nextLine();
				System.out.println("Entrez le nombre de client ayant occupé l'hotel durant ce moi: ");
				nbClients=sc.nextLine();
				infoHotel=nomHotel+";"+adresseHotel+";"+nbClients;
				tab[i]=infoHotel;
			}
				
			d.nouvelleVille(ville, tab);

			System.out.println("Voulez-vous ajouter une ville (O/N)?");
			choix=sc.nextLine().charAt(0);		
		}
		d.affiche();
		
		//afficher la liste des hotels d'une ville
		System.out.println("Voulez-vous afficher les hotels d'une ville (O/N)?");
		choix=sc.nextLine().charAt(0);
		while(choix=='O') {
			System.out.println("Quel est le nom de cette ville?");
			ville=sc.nextLine();
		
//pb java.lang.NullPointerExcpetion			d.afficherHotels(ville);
		}
		//afficher le nb total de client de ts les hotels pendant le mois
		System.out.println("nombre total des clients de tous les hotel: "+d.nbClientsTotal());
	
	}
}
