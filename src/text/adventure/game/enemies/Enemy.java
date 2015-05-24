package text.adventure.game.enemies;

import java.util.Random;


public class Enemy {
	
	public final int ENEMY_HEALTH = 100;
	public final int ENEMY_ATTACK = 20;
	public final int ENEMY_DEFENCE = 20;
	public final int DROP_CHANCE = 20;
	
	public final int Drache  = 5;
	public final int Kobold  = 30;
	public final int Magier  = 10;
	public final int Skelett = 40;
	public final int Zombie = 70;
	
	
	Random rand = new Random ();
	
	public void enemyAuswahl () {
		int enemyAuswahl = rand.nextInt(100);
		
		if  (enemyAuswahl <= Drache) {
			
			Drache dragon = new Drache ();
			dragon.drachenAuswahl();
			
		}
		
		else if (enemyAuswahl <= Kobold) {
			Kobold kobold = new Kobold ();
			kobold.koboldAuswahl();
		}
		
		else if (enemyAuswahl <= Magier) {
			Magier mage = new Magier ();
			mage.magierAuswahl();
		}
		
		else if (enemyAuswahl <= Skelett) {
			Skelett skelett = new Skelett ();
			skelett.skelettAuswahl();
			
		}
		
		else if (enemyAuswahl <= Zombie) {
			Zombie zombie = new Zombie ();
			zombie.zombieAuswahl();
		}
		
	}
	
	
	
	
	
	
	
	// neuer Package => für neue Gegnertypen? Es gibt z.B. Goblins, aber verschieden Versionen...
	
		
	

}