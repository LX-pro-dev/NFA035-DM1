import java.util.*;
public class VILLE {
	Scanner sc=new Scanner(System.in);
	private String nomHotel;
	String detailHotel,nomVille;

	private Set<String> listeHotels;

	int l;

	//constructeur liste des hotels d'une ville
	public VILLE(String ville) {
		nomVille=ville;
		listeHotels=new HashSet<String>();
	}

	//obtenir le nom d'un hotel
	public String getNom() {
		return nomHotel;
	}
	// obtenir le nom d'une ville
	public String getVille() {
		return nomVille;
	}

	//afficher les infos des hotels
	public void affiche() {
		afficherHotels();
	}

	public void ajoutHotel(String detailHotel) {
		listeHotels.add(detailHotel);
	}

	//afficher les infos des hotels d'une ville
	public void afficherHotels(){
		Iterator<String> iter=listeHotels.iterator();
		while(iter.hasNext()) {
			String[] info;
			String temp=iter.next();//tjs passer par une valeur temporaire pr afficher valeur de iter.next()
			info=temp.split(";");
			System.out.println("Nom de l'hotel : "+info[0]+" \n adresse :"+info[1]
					+"\n fréquentation de l'hotel pour ce mois :"+info[2]+"\n");
		}
	}
	//compter le nb de clients
	public int nbClientsDansUneVille() {
		int somme=0;
		Iterator<String> iter=listeHotels.iterator();
		while(iter.hasNext()) {
			String[] info;
			String temp=iter.next();//tjs passer par une valeur temporaire pr afficher valeur de iter.next()
			info=temp.split(";");
			somme=somme+Integer.parseInt(info[2]);
			
		}
		return somme;
	}

}
