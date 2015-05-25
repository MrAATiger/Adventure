package engine.ConsoleEngine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOSystem {

	private static File saveFile = new File("wall_of_shame.txt");

	public static String readSaveFile() {

		String text = "";
		FileReader fr;
		try {
			fr = new FileReader(saveFile);

			BufferedReader br = new BufferedReader(fr);

			String zeile = "";
			while (zeile != null) {

				zeile = br.readLine();

				if (zeile != null) {
					text += zeile + "\n";
				}
			}

			br.close();
		} catch (FileNotFoundException e) {
			writeSaveFile("");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return text;
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

	public static void appendSaveFile(String action) {
		
		String text = readSaveFile();
		
		text += action;
		
		writeSaveFile(text);
		
	}

}
