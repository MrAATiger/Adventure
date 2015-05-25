package text.adventure.game.dungeon;

import java.util.List;

import text.adventure.game.dungeon.room.WelcomeRoom;

public class Map {
	
	
	private List<Room> rooms;
	private Difficult difficult;
	
	public enum MapSize{
		Big(20), Normal(15), Small(10);
		
		int size;
		
		MapSize(int size){
			this.size = size;
		}
	}

	public enum Difficult{
		Hard(3), Normal(2), Easy(1);
		
		int difficult;
		
		Difficult(int difficult){
			this.difficult = difficult;
		}
	}
	
	
	public Map(MapSize size, Difficult difficult){
		
		this.difficult = difficult;
		
		// build rooms
		int z = size.size;
		
		rooms.add(new WelcomeRoom());
		
		while(z > 0){
			
			rooms.add(getRandomRoom());
			
			z--;
		}
		
	}


	private Room getRandomRoom() {
		/*
		 * Welche arten von R�umen gibt es???
		 * 
		 * - Wilkommensraum
		 * - Fallen raum
		 * - Loot Raum
		 * - idle Raum
		 * - Monster Raum
		 *
		 * Von der Difficult h�ngt es ab welche Art von R�umen wie wahrscheinlich drankommen
		 * 
		 * Easy mehr idle R�ume
		 * 		mehr Loot
		 * 		weniger Monster R�ume
		 * 		ganz wenige Fallen R�ume
		 * 
		 *  Normal normal idle R�ume
		 * 		normal Loot
		 * 		normal Monster R�ume
		 * 		wenige Fallen R�ume
		 * 
		 * 
		 *  Hard wenige idle R�ume
		 * 		wenige Loot
		 * 		viele Monster R�ume
		 * 		viele Fallen R�ume
		 * 
		 * 
		 */
		
		
		return new Room();
	}
	
}
