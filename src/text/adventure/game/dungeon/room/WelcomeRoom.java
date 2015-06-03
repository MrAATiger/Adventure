package text.adventure.game.dungeon.room;

import java.util.ArrayList;
import java.util.List;

import text.adventure.game.dungeon.Event;
import text.adventure.game.dungeon.Room;
import text.adventure.game.dungeon.event.LootEvent;
import text.adventure.game.item.Item;

public class WelcomeRoom extends Room {

	public WelcomeRoom(){
		super("Welcome Room", null, initLoot());
	}
	
	private static List<Event> initLoot(){

		List<Event> list = new ArrayList<Event>();
		
		
		List<Item> items = new ArrayList<Item>();
		items.add(new Item());
		
		
		list.add(new LootEvent(items));
		
		return list;
	}
	

}
