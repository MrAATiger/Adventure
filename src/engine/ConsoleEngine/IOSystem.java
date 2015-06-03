package engine.ConsoleEngine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import text.adventure.game.Player;

/**
 * Diese Klasse kümmert sich um lesen und schreiben von Dateien
 * 
 * @author Ludwig
 *
 */
public class IOSystem {

	private static final String PATH_RESOURCES = "resources/";
	private static final String PATH_TEXTPATTERN = PATH_RESOURCES + "text/de/";
	private static final String PATH_SAVEFILES = PATH_RESOURCES + "savefiles/";
	private static final String PATH_ASCII_GRAPHICS = PATH_RESOURCES + "graphics/";
	

	public static final String WALL_OF_SHAME_SAVEFILE_PATH = PATH_TEXTPATTERN + "wall_of_shame_patter.txt";
	
	private static final String PATH_ACTION = PATH_TEXTPATTERN + "action/";
	
	public static final String DEEPER_PATTERN_PATH = PATH_ACTION + "deeper_patter.txt";
	public static final String INVENTORY_PATTERN_PATH = PATH_ACTION + "inventory_patter.txt";
	public static final String LEAVE_PATTERN_PATH = PATH_ACTION + "leave_patter.txt";
	public static final String HELP_PATTERN_PATH = PATH_ACTION + "help_patter.txt";
	public static final String WRONG_CMD_PATTERN_PATH = PATH_ACTION + "wrong_cmd_patter.txt";
	public static final String INSPECT_PATTERN_PATH = PATH_ACTION + "inspect_patter.txt";	

	public static final String DEEPER_PATH = PATH_ACTION + "deeper.txt";
	public static final String INVENTORY_PATH = PATH_ACTION + "inventory.txt";
	public static final String LEAVE_PATH = PATH_ACTION + "leave.txt";
	public static final String HELP_PATH = PATH_ACTION + "help.txt";	
	public static final String GRAPHICS_PATH = PATH_ACTION + "graphics.txt";
	public static final String WALL_OF_SHAME_PATH = PATH_ACTION + "wall_of_shame.txt";
	public static final String INSPECT = PATH_ACTION + "inspect.txt";
	
	public static String readASCIIGraphics(String fileName) {
		String graphic = "\n";
		FileReader fr;
		try {
			fr = new FileReader(PATH_ASCII_GRAPHICS + fileName);

			BufferedReader br = new BufferedReader(fr);

			String zeile = "";
			while (zeile != null) {

				zeile = br.readLine();

				if (zeile != null) {
					graphic += zeile + "\n";
				}
			}

			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return graphic;

	}
	
	public static List<String> readFileLineByLine(String path) {
		List<String> pattern = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(path);

			BufferedReader br = new BufferedReader(fr);

			String zeile = "";
			while (zeile != null) {

				zeile = br.readLine();

				if (zeile != null) {
					pattern.add(zeile);
				}
			}

			br.close();
		} catch (FileNotFoundException e) {
			writeSaveFile(new File(path), "");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return pattern;

	}

	public static List<Player> readWallOfShame() {

		List<Player> players = new ArrayList<Player>();
		FileReader fr;
		try {
			fr = new FileReader(PATH_SAVEFILES + "wall_of_shame.txt");

			BufferedReader br = new BufferedReader(fr);

			String zeile = "";
			while (zeile != null) {

				zeile = br.readLine();

				if (zeile != null) {
					players.add(convertLineToPlayer(zeile));
				}
			}

			br.close();
		} catch (FileNotFoundException e) {
			writeSaveFile(new File(PATH_SAVEFILES + "wall_of_shame.txt"), "");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return players;
	}

	public static void writeSaveFile(File file, String text) {

		FileWriter fw;
		try {
			fw = new FileWriter(file);

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(text);

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void appendPlayerToSaveFile(Player player) {

		String text = "";

		for (Player v : readWallOfShame()) {
			text += convertPlayerToLine(v) + "\n";
		}

		text += convertPlayerToLine(player);

		writeSaveFile(new File(PATH_SAVEFILES + "wall_of_shame.txt"), text);

	}

	public static String convertPlayerToLine(Player player) {

		String line = "name=[" + HtmlFormatter.decodeHtmlUmlaute(player.getPlayerName()) + "] score=[" + player.getScore() + "]";

		return line;
	}

	public static Player convertLineToPlayer(String line) {

		int index = line.indexOf("]");

		String name = line.substring(line.indexOf("[") + 1, index);

		// player name
		Player player = new Player(name);
		name = HtmlFormatter.encodeHtmlUmlaute(name);

		index++;
		// System.out.println("index" + index + " max" + line.length());
		// System.out.println("[" + line.indexOf("[", index) + " ]" +
		// line.indexOf("]", index));

		// player score
		String score = line.substring(line.indexOf("[", index) + 1, line.indexOf("]", index));

		player.addScore(Integer.parseInt(score));

		// System.out.println(player.getPlayerName() + " " + player.getScore());

		return player;
	}

}
