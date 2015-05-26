package text.adventure.game.enemies;

import text.adventure.game.enemies.drachen.*;

import java.util.Random;

public class Drache extends Enemy {

	// verschiedene Drachen => Eis-, Feuer-, Zombie-, Blitz-, Eisen- und Süßigkeitendrache
	
	public final static int AVOID_CHANCE_DRAGON = 5;
	public final static int DRAGON_LIFE = 150;
	
	public final int  Feuerdrache = 80;
	public final int  Eisdrache = 40;
	public final int  Zombiedrache = 18;
	public final int Blitzdrache = 13;
	public final int  Eisendrache = 2;
	public final int Süßigkeitendrache = 1;
	
	Enemy enemy = new Enemy ();
	
	
	
	Random rand = new Random ();
	
	public void drachenAuswahl () {
		
		int drachenWahrscheinlichkeit = rand.nextInt (100);
		
		if (drachenWahrscheinlichkeit > Feuerdrache ) {
			Feuerdrache fDrache = new Feuerdrache ();
			fDrache.textAusgabeFeuerdrache();
			
			
		}
	}
		
}
