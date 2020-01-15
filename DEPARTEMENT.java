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
			NOM=t.getVille().toLowerCase();//on récupère le nom de la ville que l'on met en minuscule
			if(NOM!=null){
				if (NOM.equals(nomVille.toLowerCase())){//et on compare avec le nom recherché mis en minuscule
					t.affiche();//on affiche alors lE OU LES hotels de la ville en question		
				}
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
