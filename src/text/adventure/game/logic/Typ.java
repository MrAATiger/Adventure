package text.adventure.game.logic;

import java.util.List;

public enum Typ {
	
	Feuer, Blatt, Boden, Blitz, Wasser;
	
	
	public static final int SEHR_EFFEKTIV = 100;  
	
	// sobald ein Angriff sehr effektiv ist, wird ein zus�tzlicher Schade berechnet

	// die Typen als String mit if? 
	/*
	 * 
	 * => besser L�sung w�re es zun�chst den Gegnern einen Typ zuzuordnen.
	 * Feuerdrache.equals(Feuer)
	 * Syntax?! => Obejkt erstellen von Feuer feuer = new Feuer (); 
	 * 
	 * in den einzelnen Klassen schreiben was effektiv ist?
	 * 
	 * Feuerdrache = Feuer
	 * Syntax w�re gegeben. W�rde den Wert annehmen.
	 * Schw�chen in den einzelnen Klassen? 
	 * Ja. Erst Typproblem l�sen bevor enemy weiter bearbeitet wird
	 *
	 * Schau dir mal Java Enum an.  Oder du kannst ja ne methode machen die folgendes macht:
	 * public int isEffective(Typ typ) return 1 wenn es ein effictiver Angriff war; return -1 wenn es gar nicht effictive war.
	 * 
	 * 
	
	 * 
	 * @param typeAngriff
	 * @param typDefender
	 * @return
	 *
	public int isEffevtive(Typ typeAngriff, Typ typDefender){
		
		typeAngriff ist gleichstark wie typDefender
		return 0;
		typeAngriff ist st�rker als typDefender
		return 1;
		typeAngriff ist schw�cher als typDefender
		return -1;
		
	}
	 */
	
}
