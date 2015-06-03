package text.adventure.game.dungeon.room;

import java.util.ArrayList;

import text.adventure.game.dungeon.Event;
import text.adventure.game.dungeon.Room;

public class IdleRoom extends Room {

	public IdleRoom(){
		super("Relaxing Room", new ArrayList<Event>(), new ArrayList<Event>());
	}
}
