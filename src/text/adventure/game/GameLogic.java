package text.adventure.game;

import ConsoleEngine.ConsoleEngine;
import engine.Engine;
import engine.InputListener;

public class GameLogic implements InputListener {
	private Player player;
	private Engine engine;
	private boolean sleep = false;
	private String action;
	
	
	public void beginn() {

		engine = new ConsoleEngine(this);
		

		engine.println("Willkommen zum Text-Adventure VerBlubbDichNicht ");
		engine.askForStringInput("Bevor wir beginnen möchte ich dich bitten deinen Namen einzugeben.");
		
		sleep = true;
		
		while(sleep){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		player = new Player(action);
		
		engine.println(player);
		
		
		
	}

	public void derAnfang() {

	}

	@Override
	public void buttonActionPerformed(String action) {
		
		this.action = action;
		
		sleep = false;
	}

}