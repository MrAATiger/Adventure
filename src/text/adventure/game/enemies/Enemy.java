package text.adventure.game.enemies;

import java.util.Random;
import text.adventure.game.angriffstyp.*;

public class Enemy {
	
	// sollen diese auch random ausgegeben werden? unterschiede bei den einzelnen unterspezien?
	// Konstruktor verursacht probleme. Obejekt wird am besten ohne Konstruktor erstellt bzw. ohne übergabe der Variablen
	
	
	
	/*
	wie erhalte ich zugriff auf diese variablen? 
	*/
	
	private int healthPoints;
	
	
	public void setHealthPoints (int healthPoints) {
		this.healthPoints = healthPoints;
	}
	
	public int getHealthPoints (){
		return healthPoints;
	}
	
	// muss ich nochmals gut überarbeiten, da so nicht korrekt...
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
	
	
	
	
	
	
	
	
	
		
	

}