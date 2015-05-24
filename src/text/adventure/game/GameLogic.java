package text.adventure.game;

import java.util.Scanner;

import javax.swing.JOptionPane;

import ConsoleEngine.ConsoleEngine;
import engine.Engine;

public class GameLogic {
	private Player player;
	private Engine engine;
	
	
	public void beginn() {

		engine = new ConsoleEngine();
		

		engine.println("Willkommen zum Text-Adventure VerBlubbDichNicht ");
		player = new Player(engine.getStringInput("Bevor wir beginnen möchte ich dich bitten deinen Namen einzugeben."));

	}

	public void derAnfang() {

	}

}