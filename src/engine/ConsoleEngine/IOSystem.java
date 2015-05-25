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

	private static File saveFile = new File("wall_of_shame.txt");

	public static List<Player> readSaveFile() {

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
			writeSaveFile("");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return players;
	}

	public static void writeSaveFile(String text) {

		FileWriter fw;
		try {
			fw = new FileWriter(saveFile);

			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(text);

			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void appendPlayerToSaveFile(Player player) {

		String text = "";

		for (Player v : readSaveFile()) {
			text += convertPlayerToLine(v) + "\n";
		}

		text += convertPlayerToLine(player);

		writeSaveFile(text);

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
