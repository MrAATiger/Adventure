package text.adventure.game.dungeon.room;

import java.util.ArrayList;

import text.adventure.game.dungeon.Event;
import text.adventure.game.dungeon.Room;

public class LootRoom extends Room {

	public LootRoom(){
		super("Treasure Room", new ArrayList<Event>(), new ArrayList<Event>());
	}
}
