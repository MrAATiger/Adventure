package text.adventure.game.creatures.enemies.drachen;

import java.util.Random;

import text.adventure.game.creatures.enemies.Drache;
import text.adventure.game.logic.Typ;



public class Feuerdrache extends Drache {
	
	public Feuerdrache() {
		super(Typ.Feuer);
	}

	private String Angriff1 = "Der Drache spuckt Feuer";
	private String Angriff2 = "Er beiﬂt zu";
	private String Ansage1 = "Ein m‰chtiger Feuerdrache erscheint vor dir";
	Random rand = new Random ();
	private int attack;
	
	
	
	
	
	public final static int FIRE_DRAGON_ATTACK = 60; // ein Random wird daraus gebildet
	public final static int FIRE_DRAGON_DEFENCE = 20; // Random
	public final static int DROP_CHANCE_FIREDRAGON = 20;    // 50% 
	
	
	
	public void setAnsage1 (String Ansage1) {
		this.Ansage1 = Ansage1;
	}
	
	public String getAnsage1 () {
		return Ansage1;
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
