package histoire;

import personnages.Humain;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("prof", "Kamboucha", 56);
		System.out.println(prof.direBonjour());
		prof.acheter("boisson", 12);
		System.out.println(prof.boire());
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
	}
	


}
