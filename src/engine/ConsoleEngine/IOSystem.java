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

public class IOSystem {


	public static final String DEEPER_PATH = "deeper_patter.txt";
	public static final String INVENTORY_PATH = "inventory_patter.txt";
	public static final String LEAVE_PATH = "leave_patter.txt";
	public static final String HELP_PATH = "help_patter.txt";
	public static final String WRONG_CMD_PATH = "wrong_cmd_patter.txt";
	public static final String WALL_OF_SHAME_PATH = "wall_of_shame_patter.txt";
	
	private static final String PATH_TEXTPATTERN = "src/resources/text/de/";
	private static final String PATH_SAVEFILES = "src/resources/savefiles/";

	private static File saveFile = new File(PATH_SAVEFILES + "wall_of_shame.txt");

	public static List<String> readTextPattern(String fileName) {
		List<String> pattern = new ArrayList<String>();
		FileReader fr;
		try {
			fr = new FileReader(PATH_TEXTPATTERN + fileName);

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
			writeSaveFile(new File(PATH_TEXTPATTERN + fileName) ,"");
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
			fr = new FileReader(saveFile);

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
			writeSaveFile(saveFile, "");
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

		writeSaveFile(saveFile, text);

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
