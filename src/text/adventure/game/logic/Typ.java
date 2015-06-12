package text.adventure.game.logic;

import java.util.List;

public enum Typ {
	
	Feuer, Wasser, Wind, Erde, Normal, Blitz, Pflanze;
	
	
	public static final int SEHR_EFFEKTIV = 100;  
	
	public int feuerIstEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5, Typ typVerteidigung6, 
		Typ typVerteidigung7 ) {
		//typeAngriff ist gleichstark wie typDefender
		typAngriff = Typ.Feuer;
		typVerteidigung1 = Typ.Wasser;
		typVerteidigung2 = Typ.Wind;
		typVerteidigung3 = Typ.Erde;
		typVerteidigung4 = Typ.Normal;
		typVerteidigung5 = Typ.Blitz;
		typVerteidigung6 = Typ.Pflanze;
	    typVerteidigung7 = Typ.Feuer;
		
		if (typAngriff == typVerteidigung2 || typAngriff == typVerteidigung4 || typAngriff == typVerteidigung5 || typAngriff == typVerteidigung3 || typAngriff == typVerteidigung7) {
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
	

public int wasserIstEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5, Typ typVerteidigung6, Typ typVerteidigung7 ) {
	//typeAngriff ist gleichstark wie typDefender
	typAngriff = Typ.Wasser;
	typVerteidigung1 = Typ.Feuer;
	typVerteidigung2 = Typ.Wind;
	typVerteidigung3 = Typ.Erde;
	typVerteidigung4 = Typ.Normal;
	typVerteidigung5 = Typ.Blitz;
	typVerteidigung6 = Typ.Pflanze;
	typVerteidigung7 = Typ.Wasser;
	
	if (typAngriff == typVerteidigung2 || typAngriff == typVerteidigung4 || typAngriff == typVerteidigung5 || typAngriff == typVerteidigung3 || typAngriff == typVerteidigung7) {
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

public int windIstEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5, Typ typVerteidigung6,Typ typVerteidigung7 ) {
	//typeAngriff ist gleichstark wie typDefender
	typAngriff = Typ.Wind;
	typVerteidigung1 = Typ.Feuer;
	typVerteidigung2 = Typ.Wasser;
	typVerteidigung3 = Typ.Erde;
	typVerteidigung4 = Typ.Normal;
	typVerteidigung5 = Typ.Blitz;
	typVerteidigung6 = Typ.Pflanze;
	typVerteidigung7 = Typ.Wind;
	if (typAngriff == typVerteidigung1 || typAngriff == typVerteidigung2 || typAngriff == typVerteidigung4 || typAngriff == typVerteidigung5 || typAngriff == typVerteidigung7) {
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


// hat mehr schwächen, aber auch mehr stärken


public int erdeIstEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5, Typ typVerteidigung6 ) {
	//typeAngriff ist gleichstark wie typDefender
	typAngriff = Typ.Erde;
	typVerteidigung1 = Typ.Feuer;
	typVerteidigung2 = Typ.Wind;
	typVerteidigung3 = Typ.Wasser;
	typVerteidigung4 = Typ.Normal;
	typVerteidigung5 = Typ.Blitz;
	typVerteidigung6 = Typ.Pflanze;
	
	if (typAngriff == typVerteidigung1 ||  typAngriff == typVerteidigung4 ) {
	return 0;
	}
	
	else if (typAngriff == typVerteidigung2 || typAngriff == typVerteidigung5) {
	//typeAngriff ist stärker als typDefender
	return 1;
	}
	//typeAngriff ist schwächer als typDefender
	else 
	return -1;
	}

public int normalIstEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5, Typ typVerteidigung6 ) {
	//typeAngriff ist gleichstark wie typDefender
	typAngriff = Typ.Normal;
	typVerteidigung1 = Typ.Feuer;
	typVerteidigung2 = Typ.Wind;
	typVerteidigung3 = Typ.Erde;
	typVerteidigung4 = Typ.Wasser;
	typVerteidigung5 = Typ.Blitz;
	typVerteidigung6 = Typ.Pflanze;
	
	if (typAngriff == typVerteidigung1 || typAngriff == typVerteidigung2 || typAngriff == typVerteidigung3 || typAngriff == typVerteidigung4 ||
		typAngriff == typVerteidigung5 || typAngriff == typVerteidigung6) {
		return 0;
	}
	else 
		return 1;
	
}


public int blitzIstEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5, Typ typVerteidigung6 ) {
	//typeAngriff ist gleichstark wie typDefender
	typAngriff = Typ.Blitz;
	typVerteidigung1 = Typ.Feuer;
	typVerteidigung2 = Typ.Wind;
	typVerteidigung3 = Typ.Wasser;
	typVerteidigung4 = Typ.Normal;
	typVerteidigung5 = Typ.Erde;
	typVerteidigung6 = Typ.Pflanze;
	
	if (typAngriff == typVerteidigung1 ||  typAngriff == typVerteidigung4 || typAngriff == typVerteidigung6 ) {
	return 0;
	}
	
	else if (typAngriff == typVerteidigung2 || typAngriff == typVerteidigung3) {
	//typeAngriff ist stärker als typDefender
	return 1;
	}
	//typeAngriff ist schwächer als typDefender
	else 
	return -1;
	}

public int pflanzeIstEffektiv (Typ typAngriff, Typ typVerteidigung1, Typ typVerteidigung2, Typ typVerteidigung3, Typ typVerteidigung4, Typ typVerteidigung5, Typ typVerteidigung6 ) {
	//typeAngriff ist gleichstark wie typDefender
	typAngriff = Typ.Pflanze;
	typVerteidigung1 = Typ.Feuer;
	typVerteidigung2 = Typ.Wind;
	typVerteidigung3 = Typ.Wasser;
	typVerteidigung4 = Typ.Normal;
	typVerteidigung5 = Typ.Blitz;
	typVerteidigung6 = Typ.Erde;
	
	if (typAngriff == typVerteidigung2 ||  typAngriff == typVerteidigung4 || typAngriff == typVerteidigung5 ) {
	return 0;
	}
	
	else if (typAngriff == typVerteidigung6 || typAngriff == typVerteidigung3) {
	//typeAngriff ist stärker als typDefender
	return 1;
	}
	//typeAngriff ist schwächer als typDefender
	else 
	return -1;
	}
}
	
	

