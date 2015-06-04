package text.adventure.game.creatures.enemies.drachen;

import text.adventure.game.creatures.enemies.Drache;
import text.adventure.game.logic.Typ;

public class Süßigkeitendrache extends Drache {
	
	public Süßigkeitendrache() {
		super(Typ.Feuer);
		// TODO Auto-generated constructor stub
	}
	public final static int CANDY_DRAGON_ATTACK = 60; // ein Random wird daraus gebildet
	public final static int CANDY_DRAGON_DEFENCE = 20; // Random
	public final static int DROP_CHANCE_CANDY_DRAGON = 99;     

}
