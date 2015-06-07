package text.adventure.game.logic;

import java.util.List;

public enum Typ {
	
	Feuer, Wasser, Wind, Erde, Normal, Blitz;
	
	
	public static final int SEHR_EFFEKTIV = 100;  
	
	public int istEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5 ) {
		//typeAngriff ist gleichstark wie typDefender
		typAngriff = Typ.Feuer;
		typVerteidigung1 = Typ.Wasser;
		typVerteidigung2 = Typ.Wind;
		typVerteidigung3 = Typ.Erde;
		typVerteidigung4 = Typ.Normal;
		typVerteidigung5 = Typ.Blitz;
		return 0;
		//typeAngriff ist stärker als typDefender
		return 1;
		//typeAngriff ist schwächer als typDefender
		return -1;
	}
	
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
