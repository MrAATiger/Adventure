package text.adventure.game.items.waffen;

import java.util.Random;

import text.adventure.game.logic.Typ;

public class Speer extends Waffen {

	public Speer() {
		super("Speer", 0, 0, 0, intSpeerTyp(), 0);
	}

	
	public static Typ intSpeerTyp(){
		
		// random typ
		
		Random rd = new Random();
		
		int r = rd.nextInt(Typ.values().length);
		
		return Typ.values()[r];
	}

}
