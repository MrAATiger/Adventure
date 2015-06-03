package text.adventure.game.angriffstyp;

public class Typ {
	
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
	 */
	
	public String feuer;
	public String blatt;
	public String boden;
	public String donner;
	public String gestein;
	public String heilig;
	public String unheilig;
	public String wasser;
	
	
	
	
}
