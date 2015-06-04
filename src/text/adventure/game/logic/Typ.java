package text.adventure.game.logic;

import java.util.List;

public enum Typ {
	
	Feuer, Blatt, Boden, Blitz, Wasser;
	
	
	public static final int SEHR_EFFEKTIV = 100;  
	
	// sobald ein Angriff sehr effektiv ist, wird ein zusätzlicher Schade berechnet

	// die Typen als String mit if? 
	/*
	 * 
	 * => besser Lösung wäre es zunächst den Gegnern einen Typ zuzuordnen.
	 * Feuerdrache.equals(Feuer)
	 * Syntax?! => Obejkt erstellen von Feuer feuer = new Feuer (); 
	 * 
	 * in den einzelnen Klassen schreiben was effektiv ist?
	 * 
	 * Feuerdrache = Feuer
	 * Syntax wäre gegeben. Würde den Wert annehmen.
	 * Schwächen in den einzelnen Klassen? 
	 * Ja. Erst Typproblem lösen bevor enemy weiter bearbeitet wird
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
		typeAngriff ist stärker als typDefender
		return 1;
		typeAngriff ist schwächer als typDefender
		return -1;
		
	}
	 */
	
}
