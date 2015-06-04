package text.adventure.game.items.waffen;

import java.util.Random;

import text.adventure.game.logic.Typ;

public class Axt extends Waffen{

	public Axt() {
		super("Axt", 0, 0, 0, initAxe(), 0);
	}

	public static Typ initAxe(){
		
		// random typ
		
		Random rd = new Random();
		
		int r = rd.nextInt(Typ.values().length);
		
		return Typ.values()[r];
	}
	
}
