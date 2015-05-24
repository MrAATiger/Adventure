package text.adventure.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ConsoleEngine.ConsoleEngine;
import engine.Engine;
import engine.InputListener;

public class GameLogic implements InputListener {
	private Player player;
	private Engine engine;
	private boolean sleep = false;
	private List<String> actions;

	public static final String KEYWORD_DEEPER = "deeper";
	public static final String KEYWORD_INVENTORY = "inventory";
	public static final String KEYWORD_HELP = "help";
	public static final String KEYWORD_LEAVE = "leave";

	public static List<String> KEY_LIST = Arrays.asList(KEYWORD_DEEPER, KEYWORD_INVENTORY, KEYWORD_HELP, KEYWORD_LEAVE);

	// in der Variabel werde die Textnachrichten gespeichert
	private String action;

	public void begin() {

		// initialisierung
		engine = new ConsoleEngine(this);
		actions = new ArrayList<String>();

		// addd Standard actions
		actions.add("Tiefer in den Dungeon \t(" + KEYWORD_DEEPER + ")");
		actions.add("Inventar aufrufen \t(" + KEYWORD_INVENTORY + ")");
		actions.add("Dungeon verlassen \t(" + KEYWORD_LEAVE + ")");

		// Ausgabe der WilkommmensNachricht
		engine.println("Willkommen zum Text-Adventure VerBlubbDichNicht ");
		engine.askForStringInput("Bevor wir beginnen m�chte ich dich bitten deinen Namen einzugeben.");
		this.sleeping();

		player = new Player(action);

		engine.println("");
		engine.println("Willkommen Player: " + player);
		engine.println("Steuerung: Gib ein bestimmtes Sch�sselwort in das Feld unter dem Textfeld ein, um eine bestimmte Aktion zu t�tigen.");
		engine.println("Du kannst jederzeit help eingeben um alle m�glichen Befehle zu sehen.");
		engine.println("");

		
		
		this.showActions();
	}

	private void showActions() {

		/**
		 * M�gliche Actionen sind:
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
			engine.println("Du wagst dich tiefer in den Dungeon! (epische aber leicht gruselige Musik)");
			sleeping(1000);
			this.showActions();
			break;

		case KEYWORD_INVENTORY:
			engine.println("Na mal sehen was hast du in deiner Hosentasche ....");
			sleeping(1000);
			this.showActions();
			break;

		case KEYWORD_LEAVE:
			engine.println("Pl�tzlich �ffnet sich �ber dir eine Fallt�r und eine schwarze Masse flie�t herunter (SFX: flatsch)."
					+ "\n Vor lauter schreck gackernd f�llst du in das Daunen Kissen neben dir... das du bis jetzt v�llig �bersehen hast."
					+ "\nVor lauter scham rennst du fast h�pfend und mit dem Armen wedelnd aus den Dungeon ..." + "\n\nENDE ");
			break;

		case KEYWORD_HELP:
			engine.println("Du guckst bl�d in dein Abenteuer Handbuch f�r Dummies.");
			engine.println("Dabei findest du folgendes raus:");
			engine.print(KEY_LIST);

			sleeping(1000);
			this.showActions();

			break;

		default:
			engine.println("�hm was auch immer du machen wolltest.....du hast es gerade vergessen!");
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