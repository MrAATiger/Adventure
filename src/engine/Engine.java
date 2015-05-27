package engine;

import java.util.List;

import engine.ConsoleEngine.ASCIIGraphics;
import text.adventure.game.Player;

/**
 * 
 * Definiert eine Engine
 * 
 * @author Ludwig Biermann
 *
 */
public interface Engine {

	/**
	 * fragt nach einen string wert
	 * 
	 * @param inputMessage
	 */
	public abstract void askForStringInput(String inputMessage);
	
	/**
	 * 
	 * es soll eine pop up nachricht erstellt werden
	 * 
	 * @param message
	 */
	public abstract void printWindowMessage(String message);
	
	/**
	 * es soll eine error message erstellt werden
	 * 
	 * @param message
	 */
	public abstract void printErrorMessage(String message);
	
	
	/**
	 * es soll eine system nachricht erstellt werden
	 * 
	 * @param message
	 */
	public abstract void printSystemMessage(String message);

	/**
	 * gib folgende message aus
	 * 
	 * @param message
	 */
	public abstract void print(String message);
	
	/**
	 * gib folgende liste aus
	 * 
	 * @param list
	 */
	public abstract void print(List<String> list);

	/**
	 * 
	 * gib folgenden String mit newline aus
	 * 
	 * @param string
	 */
	public abstract void println(String string);
	
	/**
	 * gib folgendes Objekt aus
	 * 
	 * @param obj
	 */
	public abstract void print(Object obj);

	/**
	 * gib folgendes Objekt aus mit newLine aus
	 * 
	 * @param obj
	 */
	public abstract void println(Object obj);
	
	/**
	 * säubere die Anzeige
	 */
	public abstract void clear();

	/**
	 * zeige die Wilkommennachricht an
	 * 
	 * @param message
	 */
	public abstract void printlnWelcomeMessage(String message);

	/**
	 * gib folgenden Text dick aus
	 * 
	 * @param message
	 */
	public abstract void printStrong(String message);

	/**
	 * gib folgenden Text episch aus
	 * 
	 * @param message
	 */
	public abstract void printEpic(String message);

	/**
	 * gib folgende ASCII Grafik aus
	 * 
	 * @param graphics
	 */
	public abstract void printASCIIGraphics(ASCIIGraphics graphics);

	/**
	 *	gib folgende Liste von Spielern aus 
	 * @param playerlist
	 */
	public abstract void printPlayerList(List<Player> playerlist);
	
}
