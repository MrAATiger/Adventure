package text.adventure.game.enemies;

import java.util.Random;
import text.adventure.game.angriffstyp.*;

public class Enemy {
	
	
	
	
	
	public final static int DRACHE  = 5;
	public final static int KOBOLD  = 30;
	public final static int MAGIER  = 10;
	public final static int SKELETT = 40;
	public final static int ZOMBIE = 70;
	
	Random rand = new Random ();
	
	
public Enemy () {
		
	}
	
	public void enemyAuswahl () {
		int enemyAuswahl = rand.nextInt(100);
		
		if  (enemyAuswahl <= DRACHE) {
			
			Drache dragon = new Drache ();
			dragon.drachenAuswahl();
			
		}
		
		else if (enemyAuswahl <= KOBOLD) {
			Kobold kobold = new Kobold ();
			kobold.koboldAuswahl();
		}
		
		else if (enemyAuswahl <= MAGIER) {
			Magier mage = new Magier ();
			mage.magierAuswahl();
		}
		
		else if (enemyAuswahl <= SKELETT) {
			Skelett skelett = new Skelett ();
			skelett.skelettAuswahl();
			
		}
		
		else if (enemyAuswahl <= ZOMBIE) {
			Zombie zombie = new Zombie ();
			zombie.zombieAuswahl();
		}
		
	}
	
	
	
	
	
	
	
	// neuer Package => für neue Gegnertypen? Es gibt z.B. Goblins, aber verschieden Versionen...
	
		
	

}