package text.adventure.game;

public class Charackter {

	private String name;
	
	
	public Charackter (String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String toString(){
		return "This is the char: " + name;
	}
}
