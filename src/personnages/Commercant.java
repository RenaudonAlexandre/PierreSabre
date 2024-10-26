package personnages;

public class Commercant extends Humain {
	
	
	public Commercant (String nom, String boisson, int argent) {
		super(nom,"thé", argent);
	}
	
	


	public int seFaireExtorquer(int sommeExtorquer) {
		if ( getArgent() == sommeExtorquer){
			System.out.println(parler() + "J'ai tout perdu ! le monde est trop injuste");
		} else {
			System.out.println(parler() + "J'ai perdu " + sommeExtorquer + " ! Le monde est trop injuste...");
		}
		return sommeExtorquer;
	}
	
	public void recevoir(int argent) {
		System.out.println(parler() + argent + " sous ! Je te remercie généreux donateur !");
	}

	

}

