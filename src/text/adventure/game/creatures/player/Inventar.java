package text.adventure.game.creatures.player;

import java.util.Random;
import java.util.RandomAccess;

public class Inventar {
	
	private static final int INVENTAR_SPACE = 20;
	private int healPotionAmount =						  5;
	private int healPotionDropChance =					 30;
	private int healPotionHealAmount =   				 50;
	public int  dropChance;
	Random rand = new Random ();
	
	
	// 1) Was möchte ich tun? => Ausrüstung mit Attributen
	// 2) Immer das "gleiche" Schwert? => Nein => Bronze, Eisen, usw.
	// 3) reicht dafür eine Klasse Inventar? => womöglich nicht.
	
public Inventar () {
	
	
}



public void setHealPotionAmount (int healPotionAmount){
	this.healPotionAmount = healPotionAmount;
}

public int getHealPotionAmount () {
	return healPotionAmount;
}

public void setHealPotionDropChance (int healPotionDropChance) {
	dropChance = rand.nextInt(100);
	if (dropChance <=  healPotionDropChance){
		healPotionAmount ++;
	}
		}

public int getHealPotionDropChance () {
	return healPotionDropChance;
}


}
