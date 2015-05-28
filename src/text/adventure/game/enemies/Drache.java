package text.adventure.game.enemies;

import text.adventure.game.enemies.drachen.*;

import java.util.Random;

public class Drache extends Enemy {

	// verschiedene Drachen => Eis-, Feuer-, Zombie-, Blitz-, Eisen- und
	// Süßigkeitendrache
	
	
	

	public final static int AVOID_CHANCE_DRAGON = 5;

	public final static int FEUERDRACHE = 50;
	public final static int EISDRACHE = 40 ;
	public final static int ZOMBIEDRACHE =30  ;
	public final static int BLITZDRACHE = 20  ;
	public final static int EISENDRACHE = 5 ;
	public final static int SÜßIGKEITENDRACHE = 0 ;

	Enemy enemy = new Enemy();

	Random rand = new Random();

	public void drachenAuswahl() {

		int drachenWahrscheinlichkeit = rand.nextInt(100);
		// von 50 - 100 soll ein feuerdrache kommen
		
		if (drachenWahrscheinlichkeit >= FEUERDRACHE) {
			Feuerdrache fDrache = new Feuerdrache();
			fDrache.textAusgabeFeuerdrache();
			
		
		} else if (drachenWahrscheinlichkeit >= EISDRACHE && drachenWahrscheinlichkeit < FEUERDRACHE ) {

		}
		
		  else if (drachenWahrscheinlichkeit >= ZOMBIEDRACHE && drachenWahrscheinlichkeit < EISDRACHE ) {
			  
		  }
		
		  else if (drachenWahrscheinlichkeit >= BLITZDRACHE && drachenWahrscheinlichkeit < ZOMBIEDRACHE ) {
			  
		  }
		
		  else if (drachenWahrscheinlichkeit >= EISENDRACHE && drachenWahrscheinlichkeit < BLITZDRACHE) {
			  
		  }
		 
		  else {
			  
		  }
	}
}
