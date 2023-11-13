package personnages;

public class Commercant extends Humain{
	private String nom;
	private String boissonfavorite;
	private int sonargent;

	public Commercant(String nom, String boissonfavorite, int sonargent) {
		super(nom, boissonfavorite, sonargent);
		
	}
	
	public int seFaireExtorquer() {
		System.out.println("J'ai tout perdu le monde est trop injuste");
		return sonargent=0;
		
	}
	
	
	public void recevoir(int argent) {
		sonargent=sonargent+argent;
		System.out.println(argent + " sous " + " ! Je te remercie généreux donateur! ");
	}
	
	

}
