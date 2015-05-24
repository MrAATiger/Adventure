package text.adventure.game;

import ConsoleEngine.ConsoleEngine;
import engine.Engine;

public class GameLogic {
	private Player player;
	private Engine engine;
	
	
	public void beginn() {

		engine = new ConsoleEngine();
		

		engine.println("Willkommen zum Text-Adventure VerBlubbDichNicht ");
		engine.askForStringInput("Bevor wir beginnen möchte ich dich bitten deinen Namen einzugeben.");

		engine.println(player);
		
	}

	public void derAnfang() {

	}

}