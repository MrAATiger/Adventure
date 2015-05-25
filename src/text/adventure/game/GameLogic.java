package text.adventure.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import engine.Engine;
import engine.InputListener;
import engine.ConsoleEngine.ASCIIGraphics;
import engine.ConsoleEngine.ConsoleEngine;
import engine.ConsoleEngine.IOSystem;
import engine.ConsoleEngine.TextPatter;

public class GameLogic implements InputListener {
	private Player player;
	private Engine engine;
	private boolean sleep = false;
	private List<String> actions;

	public static final String KEYWORD_DEEPER = "deeper";
	public static final String KEYWORD_INVENTORY = "inventory";
	public static final String KEYWORD_HELP = "help";
	public static final String KEYWORD_LEAVE = "leave";
	public static final String KEYWORD_WALL_OF_SHAME = "wall of shame";
	public static final String TITLE = "VerBlubbDichNicht";

	public static List<String> KEY_LIST = new ArrayList<String>(Arrays.asList("<strong>" + KEYWORD_DEEPER + " </strong>\ttiefer in den Dungeon","<strong>" +  KEYWORD_INVENTORY + " </strong>\tInventar anzeigen", "<strong>" +  KEYWORD_HELP + " </strong>\tHilfe anzeigen", "<strong>" +  KEYWORD_LEAVE + " </strong>\tSpiel verlassen", "<strong>" +  KEYWORD_WALL_OF_SHAME + " </strong>\tWall of Shame anzeigen!"));

	// in der Variabel werde die Textnachrichten gespeichert
	private String action;

	public void begin() {
		
		Collections.sort(KEY_LIST);
		
		// initialisierung
		engine = new ConsoleEngine(this, TITLE);
		actions = new ArrayList<String>();

		// addd Standard actions
		actions.add("Tiefer in den Dungeon \t(" + KEYWORD_DEEPER + ")");
		actions.add("Inventar aufrufen \t(" + KEYWORD_INVENTORY + ")");
		actions.add("Dungeon verlassen \t(" + KEYWORD_LEAVE + ")");

		// Ausgabe der WilkommmensNachricht
		engine.printlnWelcomeMessage("Willkommen zum Text-Adventure \n" + TITLE + "\n\n");
		engine.askForStringInput("Bevor wir Beginnen, nenne mir deinen heroische Namen... für die Wall of Shame und so.");
	
		this.sleeping();

		player = new Player(action);
		IOSystem.appendSaveFile(action);

		engine.printStrong("\nWillkommen Player:");
		engine.printEpic(" " + player + "\n");
		engine.printStrong("Steuerung:\n");
		engine.print("Gib ein bestimmtes <strong>Schüsselwort</strong> in das Feld unter dem Textfeld ein, um eine bestimmte Aktion zu tätigen.\n Du kannst jederzeit <strong>help</strong> eingeben um alle möglichen Befehle zu sehen.\n\n");

		
		engine.askForStringInput("\nWas willst du tun?\n");
		engine.print(actions);
		
		
		this.sleeping();
		engine.clear();
		
		this.performAction();
	}

	private void showActions() {

		engine.askForStringInput("\nWas willst du tun?\n");
		this.sleeping();
		engine.clear();
		
		this.performAction();
	}

	private void performAction() {

		engine.println("");

		switch (action) {
		case KEYWORD_DEEPER:
			engine.println(TextPatter.GoDeeper.getRandomText());
			
			engine.print("OMG ein rießiger Drache erscheint im kleinen Dungeon! SFX: Drachengebrüll \n");
			engine.printASCIIGraphics(ASCIIGraphics.Dragon);
			
			sleeping(3000);
			this.showActions();
			break;

		case KEYWORD_INVENTORY:
			engine.println(TextPatter.Inventory.getRandomText());
			sleeping(1000);
			this.showActions();
			break;

		case KEYWORD_LEAVE:
			engine.println(TextPatter.Leave.getRandomText());
			engine.println("\n\nProgramm beendet sich in \n\n\t5");
			sleeping(1000);
			engine.println("\t4");
			sleeping(1000);
			engine.println("\t3");
			sleeping(1000);
			engine.println("\t2");
			sleeping(1000);
			engine.println("\t1");
			sleeping(1000);
			System.exit(0);
			break;

		case KEYWORD_HELP:
			engine.println(TextPatter.Help.getRandomText());
			engine.print(KEY_LIST);
			sleeping(1000);
			this.showActions();
			break;

		case KEYWORD_WALL_OF_SHAME:
			engine.println(TextPatter.WALL_OF_SHAME.getRandomText());
			engine.print(IOSystem.readSaveFile());
			this.showActions();
			break;
			
		default:
			engine.println(TextPatter.WrongCmd.getRandomText());
			sleeping(1000);
			this.showActions();
			break;
		}

	}

	private void sleeping(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private void sleeping() {
		sleep = true;
		while (sleep) {
			sleeping(100);
		}
	}

	@Override
	public void buttonActionPerformed(String action) {

		this.action = action;

		sleep = false;
	}

}