package text.adventure.game.items.waffen;

import java.util.Random;

import text.adventure.game.logic.Typ;

public class Lanze extends Waffen {

	public Lanze() {
		super("Lanze", 0, 0, 0, intLanzeTyp(), 0);
	}
	
	
	public static Typ intLanzeTyp(){
		
		// random typ
		
		Random rd = new Random();
		
		int r = rd.nextInt(Typ.values().length);
		
		return Typ.values()[r];
	}
	
}
