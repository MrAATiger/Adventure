package text.adventure.game.enemies;

import java.util.Random;
import text.adventure.game.angriffstyp.*;

public class Enemy {
	
	// sollen diese auch random ausgegeben werden? unterschiede bei den einzelnen unterspezien?
	// Konstruktor verursacht probleme. Obejekt wird am besten ohne Konstruktor erstellt bzw. ohne übergabe der Variablen
	
	private int koboldHealthPoints = 40;
	private int drachenHealthPoints = 80;
	private int magierHealthPoints = 50;
	private int skelettHealthPoints = 30;
	private int zombieHealthPoints = 30;
	
	
	public void setKoboldHealthPoints (int koboldHealthPoints) {
		this.koboldHealthPoints = koboldHealthPoints;
	}
	
	
	public int getKoboldHealthPoints () {
		return koboldHealthPoints;
	}
	
	public void setDrachenHealthPoints (int drachenHealthPoints) {
		this.drachenHealthPoints = drachenHealthPoints;
	}
	
	public int getDrachenHealthPoints () {
		return drachenHealthPoints;
	}
	
	public void setMagieHealthPoints (int magierHealthPoints ) {
		this.magierHealthPoints = magierHealthPoints;
	}
	
	public int getMagieHealthPoints (){
		return magierHealthPoints;
	}
	
	public void setSkelettHealthPoints ( int skelettHealthPoints) {
		this.skelettHealthPoints = skelettHealthPoints;
	}
	
	public int getSkelettHealthPoints (){
		return skelettHealthPoints;
	}
	
	public void setZombieHealthPoints (int zombieHealthPoints) {
		this.zombieHealthPoints = zombieHealthPoints;
	}
	
	public int getZombieHealthPoints() {
		return zombieHealthPoints;
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