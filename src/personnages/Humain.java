package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	
	
	public String getBoisson() {
		return boisson;
	}



	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}



	public int getArgent() {
		return argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void direBonjour() {
		System.out.println(parler() + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public void boire() {
		System.out.println(parler()+"Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix < argent) {
			System.out.println(parler()+"J'ai " + argent + " sous en poche. je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			argent = argent - prix;
		} else {
			System.out.println(parler()+"Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrire" + bien + " à " + prix + " sous");
		}
	}
	
	private int gagnerArgent(int gain) {
		System.out.println("super, j'ai gagné " + gain + "sous.");
		argent = argent + gain;
		return argent;
	}
	
    private int perdreArgent(int perte) {
    	System.out.println("Oh mince, j'ai perdu " + perte + "sous.");
    	argent = argent - perte;
    	return argent;
    }
    
    protected String parler() {
    	return ("("+nom+")" + " - ");
    }
}
