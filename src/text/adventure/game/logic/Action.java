package text.adventure.game.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import engine.ConsoleEngine.IOSystem;


public enum Action {

	deeper(IOSystem.readFileLineByLine(IOSystem.DEEPER_PATH),"tiefer in den Dungeon"),
	inventory(IOSystem.readFileLineByLine(IOSystem.INVENTORY_PATH),"Inventar anzeigen"),
	help(IOSystem.readFileLineByLine(IOSystem.HELP_PATH),"Hilfe anzeigen"),
	graphics(IOSystem.readFileLineByLine(IOSystem.GRAPHICS_PATH), "alle Grafiken anzeigen"),
	leave(IOSystem.readFileLineByLine(IOSystem.LEAVE_PATH),"Spiel verlassen"),
	wall_of_shame(IOSystem.readFileLineByLine(IOSystem.WALL_OF_SHAME_PATH),"Wall of Shame anzeigen!"),
	inspect(IOSystem.readFileLineByLine(IOSystem.INSPECT), "sich umsehen");
	
	private List<String> synom;
	private String discription;
	

	private static List<String> KEY_LIST;
	
	Action(List<String> synom){
		this(synom, "");
	}
	
	Action(List<String> synom, String description){
		
		this.discription = description;
		this.synom = synom;
		for(String v:synom){
			v = v.trim();
		}
	}
	
	public static List<String> getAllDescriptions(){
		
		if(KEY_LIST != null){
			return KEY_LIST;
		}
		
		KEY_LIST = new ArrayList<String>();
		
		for(Action value: Action.values()) {
			if(value.getDescription() != ""){
				KEY_LIST.add("<strong>" + value.getCommand() +  "</strong>\n\t\t" + value.getDescription());
			}
		}
		
		System.out.println(KEY_LIST);
		
		Collections.sort(KEY_LIST);
		return  KEY_LIST;
	}
	
	public String getDescription(){
		return discription;
	}
	
	public String getCommand(){
		return this.synom.get(0);
	}
	
	public boolean contains(String action){
		return this.synom.contains(action.trim());
	}
	
	@Override
	public String toString(){
		return this.synom.get(0);
	}
}
