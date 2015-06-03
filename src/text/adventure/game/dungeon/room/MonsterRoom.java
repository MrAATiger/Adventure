package text.adventure.game.dungeon.room;

import java.util.ArrayList;
import java.util.List;

import text.adventure.game.dungeon.Event;
import text.adventure.game.dungeon.Room;

public class MonsterRoom extends Room {

	public MonsterRoom(){
		super("Monster Room", initMonster(), initLoot());
	}
	
	private static List<Event> initLoot(){

		List<Event> list = new ArrayList<Event>();
		
		return list;
	}
	
	private static List<Event> initMonster(){
		
		List<Event> list = new ArrayList<Event>();
		
		return list;
	}
	
}
