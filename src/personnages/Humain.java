package personnages;

public class Humain {
	private String nom;
	private String boissonfavorite;
	private int sonargent;
	
	
	public Humain(String nom, String boissonfavorite, int sonargent) {
		this.nom = nom;
		this.boissonfavorite = boissonfavorite;
		this.sonargent = sonargent;
	}


	public String getNom() {
		return nom;
	}


	public int getSonargent() {
		return sonargent;
	}
	
	
	private String parler(String texte) {
		return  "<<" + texte + " >>";
	}
	
	public String direBonjour() {
		return getNom()+ " - " + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonfavorite;
	}
	
	public String boire() {
		return " Mmmm, un bon verre de " + boissonfavorite + " GLOUPS ! ";
	}
	
	public void acheter(String bien, int prix) {
		if(getSonargent()>=prix) {
			System.out.println(getNom()+ " - " + "J'ai " + sonargent + " sous en poche. Je vais pouvoir m'acheter " + bien
					+ " à " + prix + " sous " );
			sonargent=sonargent-prix;
		}
		else {
			System.out.println(getNom()+ " - " + " Je n'ai plus que " + sonargent + " sous en poche. Je ne peux même pas m'offrir "
					+ " un " + bien + " à " + prix + " sous ");
		}
	}
	
	public void gagnerArgent(int gain) {
		sonargent=sonargent+gain;
		System.out.println(getNom()+ " - " + "Je viens de gagner " + gain + "argent, "+ " mon argent est de : " + sonargent);
	}
	
	public void perdreArgent(int perte) {
		sonargent=sonargent-perte;
		System.out.println(getNom()+ " - " + " Je viens de perdre " + perte + " argent, " + " mon argent est de : " + sonargent);
	}
	
}
