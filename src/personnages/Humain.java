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
		return "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonfavorite;
	}
	
	public String boire() {
		return " Mmmm, un bon verre de " + boissonfavorite + " GLOUPS ! ";
	}
	
	public void acheter(String bien, int prix) {}
	
	public void gagnerArgent(int gain) {}
	
	public void perdreArgent(int perte) {}
}
