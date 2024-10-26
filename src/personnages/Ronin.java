package personnages;

public class Ronin extends Humain {
	
	private int honneur = 1;
	
	public Ronin (String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int pourcent;
		pourcent = getArgent();
		pourcent = pourcent /10;
		System.out.println(parler() + beneficiaire.getNom() + " prend ces "+ pourcent + " sous");
		beneficiaire.recevoir(pourcent);
		
	}
	
	public void provoquer(Yakuza yakuza) {
		System.out.println(parler() + "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (honneur >= yakuza.getReputation()) {
			honneur += 1;
			System.out.println(parler() + "Je t'ai eu petit yakusa ! ");
			yakuza.perdre();
		} else {
			yakuza.gagner(getArgent());
			System.out.println(parler() + "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			honneur -= 1;
		}
			
	}
}
