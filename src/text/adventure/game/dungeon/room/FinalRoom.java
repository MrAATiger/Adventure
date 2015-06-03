package text.adventure.game.dungeon.room;

import java.util.ArrayList;

import text.adventure.game.dungeon.Event;
import text.adventure.game.dungeon.Room;

public class FinalRoom extends Room {

	public FinalRoom(){
		super("Final Room", new ArrayList<Event>(), new ArrayList<Event>());
	}
	
}
