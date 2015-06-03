package text.adventure.game.dungeon.room;

import java.util.ArrayList;

import text.adventure.game.dungeon.Event;
import text.adventure.game.dungeon.Room;

public class TrapRoom extends Room {

	public TrapRoom(){
		super("Trap Room", new ArrayList<Event>(), new ArrayList<Event>());
	}
}
