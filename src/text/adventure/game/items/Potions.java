package text.adventure.game.items;

import java.util.List;

import text.adventure.game.dungeon.event.StatusEvent;

public class Potions implements Item {

	private List<StatusEvent> event;
	private String name;
	private int weight;
	private int value;
	
	public Potions(String name, List<StatusEvent> event, int weight, int value){
		this.name = name;
		this.event = event;
		this.weight = weight;
		this.value = value;
	}

	public List<StatusEvent> getStatusChanges(){
		return event;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getWeight() {
		return this.weight;
	}

	@Override
	public int getValue() {
		return this.value;
	}
	
}
