package text.adventure.game.angriffstyp;

public class Typ {
	
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
	 * 
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
	
}
