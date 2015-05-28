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

/**
 * 
 * Diese Klasse implementiert die Logik des Spieles
 * 
 * @author Alexander Angeloussis, Ludwig Biermann
 *
 */
public class GameLogic implements InputListener {
	
	// Variabeln
	private Player player;
	private Engine engine;
	private boolean sleep = false;
	private List<String> actions;

	// Mögliche Actionen
	
	// TODO Action als enum + synonyme einfügen
	public static final String KEYWORD_DEEPER = "deeper";
	public static final String KEYWORD_INVENTORY = "inventory";
	public static final String KEYWORD_HELP = "help";
	public static final String KEYWORD_LEAVE = "leave";
	public static final String KEYWORD_GRAPHICS = "show all graphics";
	public static final String KEYWORD_WALL_OF_SHAME = "wall of shame";
	public static final String TITLE = "VerBlubbDichNicht";

	
	public static List<String> KEY_LIST = new ArrayList<String>(Arrays.asList("<strong>" + KEYWORD_DEEPER + " </strong> \n\t\ttiefer in den Dungeon","<strong>" +  KEYWORD_INVENTORY + " </strong>\n\t\tInventar anzeigen", "<strong>" +  KEYWORD_HELP + " </strong>\n\t\tHilfe anzeigen", "<strong>" +  KEYWORD_LEAVE + " </strong>\n\t\tSpiel verlassen", "<strong>" +  KEYWORD_WALL_OF_SHAME + " </strong>\n\t\tWall of Shame anzeigen!"));

	// in der Variabel werde die Textnachrichten gespeichert
	private String action;

	/**
	 * Diese Methode startet das Spiel
	 */
	public void start() {
		
		
		
		Collections.sort(KEY_LIST);
		
		// initialisierung
		engine = new ConsoleEngine(this, TITLE);
		actions = new ArrayList<String>();
	
		// addd Standard actions
		actions.add("Tiefer in den Dungeon \n\t\t(" + KEYWORD_DEEPER + ")");
		actions.add("Inventar aufrufen  \n\t\t(" + KEYWORD_INVENTORY + ")");
		actions.add("Dungeon verlassen  \n\t\t(" + KEYWORD_LEAVE + ")");

		// Ausgabe der WilkommmensNachricht
		engine.printlnWelcomeMessage("Willkommen zum Text-Adventure \n" + TITLE + "\n\n");
		
		// verlange nach Name
		engine.askForStringInput("Bevor wir Beginnen, nenne mir deinen heroische Namen... für die Wall of Shame und so.");
		this.sleeping();

		player = new Player(action);

		
		// Wilkommens Nachricht
		engine.printStrong("\nWillkommen Player:");
		engine.printEpic(" " + player + "\n");
		engine.printStrong("Steuerung:\n");
		engine.print("Gib ein bestimmtes <strong>Schüsselwort</strong> in das Feld unter dem Textfeld ein, um eine bestimmte Aktion zu tätigen.\n Du kannst jederzeit <strong>help</strong> eingeben um alle möglichen Befehle zu sehen.\n\n");

		// verlange nach Eingabe
		engine.askForStringInput("\nWas willst du tun?\n");
		engine.print(actions);		
		this.sleeping();
		
		// säubere die Seite
		engine.clear();
		
		// los gehts
		this.performAction();
	}

	/**
	 * Diese Mehtode fragt nach der nächsten Eingabe
	 */
	private void askForNextActions() {

		engine.askForStringInput("\nWas willst du tun?\n");
		this.sleeping();
		engine.clear();
		
		this.performAction();
	}

	/**
	 * Die Actionen werden ausgeführt
	 */
	private void performAction() {

		engine.println("");

		switch (action) {
		case KEYWORD_DEEPER:
			engine.println(TextPatter.GoDeeper.getRandomText());
			
			engine.print("OMG ein rießiger Drache erscheint im kleinen Dungeon! SFX: Drachengebrüll \n");
			engine.printASCIIGraphics(ASCIIGraphics.Dragon);
			
			sleeping(3000);
			this.askForNextActions();
			break;

		case KEYWORD_INVENTORY:
			engine.println(TextPatter.Inventory.getRandomText());
			sleeping(1000);
			this.askForNextActions();
			break;

		case KEYWORD_LEAVE:
			engine.println(TextPatter.Leave.getRandomText());
			IOSystem.appendPlayerToSaveFile(player);
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
			this.askForNextActions();
			break;

		case KEYWORD_WALL_OF_SHAME:
			engine.println(TextPatter.WALL_OF_SHAME.getRandomText());
			engine.printPlayerList(IOSystem.readWallOfShame());
			this.askForNextActions();
			break;
			
		case KEYWORD_GRAPHICS:
			
			engine.printASCIIGraphics(ASCIIGraphics.CommingSword);
			engine.printASCIIGraphics(ASCIIGraphics.HorizontalSword);
			engine.printASCIIGraphics(ASCIIGraphics.Dragon);
			engine.printASCIIGraphics(ASCIIGraphics.Head_Asia);
			
			break;
			
		default:
			engine.println(TextPatter.WrongCmd.getRandomText());
			sleeping(1000);
			this.askForNextActions();
			break;
		}

	}

	/**
	 * Das Programm wartet eine bestimmte zeit
	 * @param ms Millisekunden die gewartet werden sollen
	 */
	private void sleeping(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	/**
	 * wartet 100 ms
	 */
	private void sleeping() {
		sleep = true;
		while (sleep) {
			sleeping(100L);
		}
	}

	@Override
	public void buttonActionPerformed(String action) {

		this.action = action;

		sleep = false;
	}

}