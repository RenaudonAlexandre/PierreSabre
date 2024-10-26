package personnages;

import java.lang.reflect.Constructor;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		System.out.println(parler() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println(parler() + victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
	    int money = getArgent();
	    money += victime.getArgent();
		reputation += 1;
		victime.seFaireExtorquer(victime.getArgent());
		System.out.println(parler()+"J'ai piqué les " + victime.getArgent() +" sous de "+ victime.getNom() +", ce qui me fait "+ money + " sous dans ma poche. HI ! HI !");
	}

	public int perdre() {
		int sous = 0;
		reputation -= 1;
		System.out.println(parler()+"j'ai perdu mon duel et mes " + getArgent() + " sous, snif... j'ai déshonoré le clan de " + clan);
		return sous;	
	}
	
	public int gagner(int gain) {
		System.out.println(parler()+"Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous");
		return gain;
	}



}
