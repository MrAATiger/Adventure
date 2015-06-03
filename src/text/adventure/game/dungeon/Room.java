package text.adventure.game.dungeon;

public abstract class Room {

	private String title = "";
	
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String toString(){
		return title;
	}
	
}
