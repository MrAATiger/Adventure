package text.adventure.game.creatures.enemies.drachen;

import text.adventure.game.creatures.enemies.Drache;
import text.adventure.game.logic.Typ;


 

public class Zombiedrache extends Drache {
	
	
	
	
	public Zombiedrache() {
		super(Typ.Feuer);
	}
	public final static int ZOMBIE_DRAGON_ATTACK = 60; // ein Random wird daraus gebildet
	public final static int ZOMBIE_DRAGON_DEFENCE = 20; // Random
	public final static int DROP_CHANCE_ZOMBIE_DRAGON = 50;    // 50% 

	
	
}
