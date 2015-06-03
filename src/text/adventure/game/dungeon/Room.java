package text.adventure.game.dungeon;

import java.util.ArrayList;
import java.util.List;

public class Room {
	
	private String title = "";
	private List<Event> inspectEvents;
	private List<Event> enterEvents;
	
	public Room(String title, List<Event> enterEvents, List<Event> inspectEvents){
		this.title = title;
		this.enterEvents = enterEvents;
		this.inspectEvents = inspectEvents;
	}
	
	public String toString(){
		return title;
	}
	
	public List<Event> enter(){
		return enterEvents;
	}
	
	public List<Event> inspect(){
		return inspectEvents;
	}
	
}
