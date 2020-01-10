import java.util.*;

public class DEPARTEMENT {
	private HashMap<String,VILLE> listeVilles;

	public DEPARTEMENT() {//constructeur
		listeVilles=new HashMap<String,VILLE>();
	}
	//ajouter une ville
	public void nouvelleVille(String nomVille,String[] hotels) {
		VILLE town= new VILLE(nomVille);
		for(String n: hotels) {
			town.ajoutHotel(n);
		}
		String key=nomVille.toLowerCase();
		listeVilles.put(key, town);
	}
	//ajouter un hotel
	public boolean ajoutHotel(String ville,String detailHotel) {
		boolean nomExist=false;
		String temp;
		VILLE t=null;//je n'avais pas créé cet objet
		String NOM="";//ni celui-là!!!

		Set<String> keyListe=listeVilles.keySet();//pour contruire un itérateur on crée un ensemble de tt les clés
		Iterator<String> iter= keyListe.iterator();// pas de new pour un iterator!!!!

		while(iter.hasNext()) {//on fait défiler tt les clés (donc pr chaq K...
			temp=iter.next();//on transfert iter.next() à un temp
			t=listeVilles.get(temp);//on récupère l'objet Ville
			NOM=t.getNom();//on récupère le nom de l'hotel
			if (NOM.equals(ville)){//et on compare avec le nom recherché
				t.ajoutHotel(detailHotel);
				nomExist=true;
			}
		}
		return nomExist;
		/* renvoie 'false' si l'hotel n'existe pas */
		/* renvoie 'true' si l'hotel a pu être ajouté */
	}

	//afficher l'ensemble des hotels d'une ville
	public void afficherHotels(String nomVille) {
		String temp;
		VILLE t=null;
		String NOM="";

		Set<String> keyListe=listeVilles.keySet();//pour contruire un itérateur on crée un ensemble de tt les clés
		Iterator<String> iter= keyListe.iterator();// pas de new pour un iterator!!!!

		while(iter.hasNext()) {//on fait défiler tt les clés (donc pr chaq K...
			temp=iter.next();//on transfert iter.next() à un temp
			t=listeVilles.get(temp);//on récupère l'objet ville
			NOM=t.getVille();//on récupère le nom de la ville
				if (NOM.equals(nomVille.toLowerCase())){//et on compare avec le nom recherché
					t.affiche();//on affiche alors lE OU LES hotel de la ville en question		
				}
			}
		}

	
	//afficher l'ensemble des villes et des hotels
	public void affiche(){/* 
		on doit récupérer toutes villes du hashset et les afficher
	 */
		String temp;
		VILLE t=null;//pourquoi on l'a mis à null les autres fois????

		Set<String> keyListe=listeVilles.keySet();//pour contruire un itérateur on crée un ensemble de tt les clés
		Iterator<String> iter= keyListe.iterator();// pas de new pour un iterator!!!!

		while(iter.hasNext()) {//on fait défiler tt les clés (donc pr chaq K...
			temp=iter.next();//on transfert iter.next() à un temp
			t=listeVilles.get(temp);//on récupère la ville de chq clé
			t.afficherHotels();//on affiche alors les hotels de chq ville			
		}
	}
	//compter l'ensemble des clients de toutes les villes
	public int nbClientsTotal() {
		int sommeTotale=0;
		String temp;
		VILLE t;

		Set<String> keyListe=listeVilles.keySet();//pour contruire un itérateur on crée un ensemble de tt les clés
		Iterator<String> iter= keyListe.iterator();// pas de new pour un iterator!!!!

		while(iter.hasNext()) {//on fait défiler tt les clés (donc pr chaq K...
			temp=iter.next();//on transfert iter.next() à un temp
			t=listeVilles.get(temp);//on récupère la ville de chq clé
			sommeTotale=sommeTotale+t.nbClientsDansUneVille();
		}
		return sommeTotale;
	}
}	
