package text.adventure.game.enemies;

import text.adventure.game.enemies.drachen.*;

import java.util.Random;

public class Drache extends Enemy {

	// verschiedene Drachen => Eis-, Feuer-, Zombie-, Blitz-, Eisen- und
	// Süßigkeitendrache

	public final static int AVOID_CHANCE_DRAGON = 5;

	public final static int FEUERDRACHE = 50;
	public final static int Eisdrache = 40 ;
	public final static int Zombiedrache =30  ;
	public final static int Blitzdrache = 20  ;
	public final static int Eisendrache = 5 ;
	public final static int Süßigkeitendrache = 0 ;

	Enemy enemy = new Enemy();

	Random rand = new Random();

	public void drachenAuswahl() {

		int drachenWahrscheinlichkeit = rand.nextInt(100);
		// von 50 - 100 soll ein feuerdrache kommen
		
		if (drachenWahrscheinlichkeit >= FEUERDRACHE) {
			Feuerdrache fDrache = new Feuerdrache();
			fDrache.textAusgabeFeuerdrache();
			
		
		} else if (drachenWahrscheinlichkeit >= Eisdrache && drachenWahrscheinlichkeit < FEUERDRACHE ) {

		}
		
		  else if (drachenWahrscheinlichkeit >= Zombiedrache && drachenWahrscheinlichkeit < Eisdrache ) {
			  
		  }
		
		  else if (drachenWahrscheinlichkeit >= Blitzdrache && drachenWahrscheinlichkeit < Zombiedrache ) {
			  
		  }
		
		  else if (drachenWahrscheinlichkeit <= Eisendrache && drachenWahrscheinlichkeit < Blitzdrache) {
			  
		  }
		 
		  else {
			  
		  }
	}
}
