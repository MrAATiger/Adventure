package text.adventure.game.items.waffen;

import java.util.Random;

import text.adventure.game.logic.Typ;

public class Schwert extends Waffen {

	public Schwert() {
		super("Schwert", 0, 0, 0, intSchwertTyp(), 0);
	}

	public static Typ intSchwertTyp(){
		
		// random typ
		
		Random rd = new Random();
		
		int r = rd.nextInt(Typ.values().length);
		
		return Typ.values()[r];
	}

}
