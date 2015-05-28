package text.adventure.game.enemies.drachen;

import text.adventure.game.enemies.Drache;
import text.adventure.game.angriffstyp.*;
import java.util.Random;



public class Feuerdrache extends Drache {
	
	private String Angriff1 = "Der Drache spuckt Feuer";
	private String Angriff2 = "Er beiﬂt zu";
	Random rand = new Random ();
	private int attack;
	
	Feuer feuer = new Feuer ();
	
	
	public final static int FIRE_DRAGON_ATTACK = 60; // ein Random wird daraus gebildet
	public final static int FIRE_DRAGON_DEFENCE = 20; // Random
	public final static int DROP_CHANCE = 50;    // 50% 
	
	
	
	public void textAusgabeFeuerdrache () {
		System.out.println(" Ein m‰chtiger Feuerdrache erschein vor dir");
	}
	
	public void setAngriff1 (String Angriff1) {
		this.Angriff1 = Angriff1;
	}
	
	public String getAngriff1 () {
		return Angriff1;
	}
	
	public void setTextAusgabeFeuerdrache (String Angriff2) {
		this.Angriff2 = Angriff2;
	}
	
	public String getTextAusgabeFeuerdrache () {
		return Angriff2;
	}
	
	public void setAttack ( int attack) {
		this.attack = attack;
		this.attack = rand.nextInt(FIRE_DRAGON_ATTACK);
	}
	
	public int getAttack () {
		return attack;
	}
	

}
