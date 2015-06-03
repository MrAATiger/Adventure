package text.adventure.game.dungeon.event;

import java.util.List;

import text.adventure.game.dungeon.Event;
import text.adventure.game.items.Item;

public class LootEvent implements Event {

	private List<Item> items;
	
	public LootEvent(List<Item> items){
		this.items = items;
	}
	
	public List<Item> getLoot(){
		return this.items;
	}
	
}
