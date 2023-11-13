package histoire;

import personnages.Humain;
import personnages.Yakuza;
import personnages.Commercant;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("prof", "Kamboucha", 56);
//		System.out.println(prof.direBonjour());
//		prof.acheter("boisson", 12);
//		System.out.println(prof.boire());
//		prof.acheter("jeu", 2);
//		prof.acheter("kimono", 50);
		Commercant marco = new Commercant("Marco", "Thé", 50);
//		System.out.println(marco.direBonjour());
//		System.out.println(marco.seFaireExtorquer());
//		marco.recevoir(15);
//		System.out.println(marco.boire());
		Yakuza yakulenoir= new Yakuza("Yaku Le Noir " , " whisky ", 30 , "Yaku");
		yakulenoir.direBonjour();
		yakulenoir.extorquer(marco);
	}
	


}
