package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain humain = new Humain("Prof", "Kambucucha", 54);
		humain.direBonjour();
		humain.acheter("une boisson", 12);
		humain.boire();
		humain.acheter("un jeu", 2);
		humain.acheter("kimono", 50);
		
		Commercant marco = new Commercant("Marco","banane",20);
		marco.direBonjour();
		marco.seFaireExtorquer(20);
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yakuza = new Yakuza("Yaku","whisky",30,"warsong",15);
		yakuza.direBonjour();
		yakuza.extorquer(marco);
		
		Ronin ronin = new Ronin ("Roro","shochu",60);
		ronin.direBonjour();
		ronin.donner(marco);
		
		ronin.provoquer(yakuza);
		
	}





}
