package personnages;

public class Yakuza extends Humain {
	private String nom;
	private String boissonfavorite;
	private int sonargent;
	private String clan;

	public Yakuza(String nom, String boissonfavorite, int sonargent, String clan) {
		super(nom, boissonfavorite, sonargent);
		this.clan = clan;

	}

	public void extorquer(Commercant victime) {
		System.out.println(getNom()+ " - " + "Tiens tiens, ne serait-ce pas un faible marchand qui passe là ? ");
		System.out.println(getNom()+ " - " + victime.getNom() + " Si tu tiens à ta vie, donne moi ta bourse ! ");
		victime.seFaireExtorquer();
		sonargent=sonargent+victime.getSonargent();
//		sonargent = sonargent + victime.seFaireExtorquer();
		System.out.println(getNom()+ " - " + "J'ai piqué les " + victime.getSonargent() + " de " + victime.getNom() + " "
				+ " Ce qui me fait" + getSonargent()+  " sous dans ma poche. Hi ! Hi ! ");

	}

}
