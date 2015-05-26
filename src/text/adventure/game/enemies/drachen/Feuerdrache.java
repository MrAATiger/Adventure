package text.adventure.game.enemies.drachen;

import text.adventure.game.enemies.Drache;
import text.adventure.game.angriffstyp.*;



public class Feuerdrache extends Drache {
	
	Feuer feuer = new Feuer ();
	
	public final static int FIRE_DRAGON_LIFE = 150; 
	public final static int FIRE_DRAGON_ATTACK = 60;
	public final static int FIRE_DRAGON_DEFENCE = 20;
	public final static int DROP_CHANCE = 50;    // 50% 
	
	
	
	public void textAusgabeFeuerdrache () {
		System.out.println(" Ein mächtiger Feuerdrache erschein vor dir");
	}

}
