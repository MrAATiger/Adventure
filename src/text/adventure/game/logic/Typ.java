package text.adventure.game.logic;

import java.util.List;

public enum Typ {
	
	Feuer, Wasser, Wind, Erde, Normal, Blitz;
	
	
	public static final int SEHR_EFFEKTIV = 100;  
	
	/*
	 *
	 * Schau dir mal Java Enum an.  Oder du kannst ja ne methode machen die folgendes macht:
	 * public int isEffective(Typ typ) return 1 wenn es ein effictiver Angriff war; return -1 wenn es gar nicht effictive war.
	 * 
	 * @param typeAngriff
	 * @param typDefender
	 * @return
	 *
	 
	public int isEffevtive(Typ typeAngriff, Typ typDefender){
		
		typeAngriff ist gleichstark wie typDefender
		return 0;
		typeAngriff ist stärker als typDefender
		return 1;
		typeAngriff ist schwächer als typDefender
		return -1;
		
	}
	 */
	
}
