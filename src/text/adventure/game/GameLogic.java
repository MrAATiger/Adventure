package text.adventure.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import engine.Engine;
import engine.InputListener;
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

	public static List<String> KEY_LIST = Arrays.asList(KEYWORD_DEEPER, KEYWORD_INVENTORY, KEYWORD_HELP, KEYWORD_LEAVE, KEYWORD_WALL_OF_SHAME);

	// in der Variabel werde die Textnachrichten gespeichert
	private String action;

	public void begin() {

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

		
		
		this.showActions();
	}

	private void showActions() {

		/**
		 * Mögliche Actionen sind:
		 * 
		 * Tiefer in den Dungeon gehen Inventar anschauen Dungeon verlassen
		 * 
		 */
		engine.askForStringInput("Was willst du tun?\n");


		engine.print(actions);

		this.sleeping();
		
		engine.clear();
		
		this.performAction();
	}

	private void performAction() {

		engine.println("");

		switch (action) {
		case KEYWORD_DEEPER:
			engine.println(TextPatter.GoDeeper.getRandomText());
			sleeping(1000);
			engine.println("");
			this.showActions();
			break;

		case KEYWORD_INVENTORY:
			engine.println(TextPatter.Inventory.getRandomText());
			sleeping(1000);
			engine.println("");
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
			engine.println("");
			this.showActions();
			break;

		case KEYWORD_WALL_OF_SHAME:
			engine.println(IOSystem.readSaveFile());
			break;
			
		default:
			engine.println(TextPatter.WrongCmd.getRandomText());
			sleeping(1000);
			engine.println("");
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