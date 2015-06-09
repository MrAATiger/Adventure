package text.adventure.game.logic;

import java.util.List;

public enum Typ {
	
	Feuer, Wasser, Wind, Erde, Normal, Blitz, Pflanze;
	
	
	public static final int SEHR_EFFEKTIV = 100;  
	
	public int feuerIstEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5, Typ typVerteidigung6 ) {
		//typeAngriff ist gleichstark wie typDefender
		typAngriff = Typ.Feuer;
		typVerteidigung1 = Typ.Wasser;
		typVerteidigung2 = Typ.Wind;
		typVerteidigung3 = Typ.Erde;
		typVerteidigung4 = Typ.Normal;
		typVerteidigung5 = Typ.Blitz;
		typVerteidigung6 = Typ.Pflanze;
		
		if (typAngriff == typVerteidigung2 || typAngriff == typVerteidigung4 || typAngriff == typVerteidigung5 || typAngriff == typVerteidigung3) {
		return 0;
		}
		
		else if (typAngriff == typVerteidigung6) {
		//typeAngriff ist stärker als typDefender
		return 1;
		}
		//typeAngriff ist schwächer als typDefender
		else 
		return -1;
		}
	

public int wasserIstEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5, Typ typVerteidigung6 ) {
	//typeAngriff ist gleichstark wie typDefender
	typAngriff = Typ.Wasser;
	typVerteidigung1 = Typ.Feuer;
	typVerteidigung2 = Typ.Wind;
	typVerteidigung3 = Typ.Erde;
	typVerteidigung4 = Typ.Normal;
	typVerteidigung5 = Typ.Blitz;
	typVerteidigung6 = Typ.Pflanze;
	
	if (typAngriff == typVerteidigung2 || typAngriff == typVerteidigung4 || typAngriff == typVerteidigung5 || typAngriff == typVerteidigung3) {
	return 0;
	}
	
	else if (typAngriff == typVerteidigung1) {
	//typeAngriff ist stärker als typDefender
	return 1;
	}
	//typeAngriff ist schwächer als typDefender
	else 
	return -1;
	}
}
	
	
	

