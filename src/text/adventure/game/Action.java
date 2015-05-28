package text.adventure.game;

import java.util.List;

import engine.ConsoleEngine.IOSystem;;


public enum Action {

	deeper(IOSystem.readFileLineByLine(IOSystem.DEEPER_PATH)),
	inventory(IOSystem.readFileLineByLine(IOSystem.INVENTORY_PATH)),
	help(IOSystem.readFileLineByLine(IOSystem.HELP_PATH)),
	graphics(IOSystem.readFileLineByLine(IOSystem.GRAPHICS_PATH)),
	leave(IOSystem.readFileLineByLine(IOSystem.LEAVE_PATH)),
	wall_of_shame(IOSystem.readFileLineByLine(IOSystem.WALL_OF_SHAME_PATH));
	
	private List<String> synom;
	
	Action(List<String> synom){
		this.synom = synom;
		for(String v:synom){
			v = v.trim();
		}
	}
	
	public boolean contains(String action){
		return this.synom.contains(action.trim());
	}
	
	@Override
	public String toString(){
		return this.synom.get(0);
	}
}
