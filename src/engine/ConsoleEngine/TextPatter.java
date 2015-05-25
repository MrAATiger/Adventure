package engine.ConsoleEngine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum TextPatter {

	GoDeeper(Arrays.asList("Du wagst dich tiefer in den Dungeon! (epische aber leicht gruselige Musik)", "Und noch tiefer.", "Irgendwie gruselig.", "Da steht ein Skelett ... und spielt Violine.", "Warum wirds eigentlich dunkel wenn man tiefer geht.")),
	Inventory(Arrays.asList("Na mal sehen was hast du in deiner Hosentasche ....",  "Dein Inventar!", "Dein Inventar!", "Dein Inventar!", "Dein Inventar!", "Dein Inventar!", "Dein Inventar!", "Dein Inventar!", "Dein Inventar!", "Dein Inventar!", "Dein Inventar!")),
	Leave(Arrays.asList("Plötzlich öffnet sich über dir eine Falltür und eine schwarze Masse fließt herunter (SFX: flatsch)."
					+ "\n Vor lauter schreck gackernd fällst du in das Daunen Kissen neben dir... das du bis jetzt völlig übersehen hast."
					+ "\nVor lauter scham rennst du fast hüpfend und mit dem Armen wedelnd aus den Dungeon ..." + "\n\nENDE ", "Du hörst ein Click ... und du warst tot und nie wieder gesehen.", "bye bye", "Damn Glitch ... du fällst ins Bodenlose!")),
	Help(Arrays.asList("Du guckst in dein Abenteuer Handbuch für Dummies. \nDabei findest du folgendes raus:")),
	WrongCmd(Arrays.asList("Öhm was auch immer du machen wolltest.....du hast es gerade vergessen!", "Wie war das nochmal ... das eine oder das andere Loch?", "tiefer ... tiefer .... TIEFER ... sag mal versteht das Programm kein DEUTSCH?????", "Ein Wort mit X war wohl nix.")),
	WALL_OF_SHAME(Arrays.asList("In Erinnerung an:", "Die waren auch schon dabei: ", "Komische Inschriften"));

	private List<String> texts;
	private List<String> textsSave;
	private Random randomGenerator;

	TextPatter(List<String> text) {
		texts = new ArrayList<String>(text);
		textsSave = new ArrayList<String>();
		randomGenerator = new Random();
	}

	public String getRandomText() {

		int size = texts.size();

		if (size <= 0) {
			if (textsSave.size() <= 0) {
				return "ERROR 404 String not found";
			}

			texts = new ArrayList<String>(textsSave);
			textsSave.clear();

			size = texts.size();
		}

		int r = randomGenerator.nextInt(size);

		String text = texts.get(r);

		textsSave.add(text);
		texts.remove(text);

		return text;
	}

}
