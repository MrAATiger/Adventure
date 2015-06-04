package text.adventure.game.creatures.enemies.drachen;

import text.adventure.game.creatures.enemies.Drache;
import text.adventure.game.logic.Typ;

public class Blitzdrache extends Drache {
	
	public Blitzdrache() {
		super(Typ.Blitz);
		// TODO Auto-generated constructor stub
	}
	public final static int IRONDRAGON_ATTACK = 60; // ein Random wird daraus gebildet
	public final static int IRONDRAGON_DEFENCE = 20; // Random
	public final static int DROP_CHANCE_IRONDRAGON = 50;    // 50% 

}
