package personnages;

public class Commercant extends Humain{
	private String nom;
	private String boissonfavorite;
	private int sonargent;

	public Commercant(String nom, String boissonfavorite, int sonargent) {
		super(nom, boissonfavorite, sonargent);
		
	}
	
	public int seFaireExtorquer() {
		perdreArgent(sonargent);
		System.out.println(getNom()+ " - " + "J'ai tout perdu le monde est trop injuste");
		return sonargent;
		
	}
	
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		System.out.println(getNom()+ " - " + argent + " sous " + " ! Je te remercie généreux donateur! ");
	}
	
	

}
