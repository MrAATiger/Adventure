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
		 * Easy mehr idle R�ume				| 30%
		 * 		mehr Loot					| 30%
		 * 		weniger Monster R�ume		| 40%
		 * 		ganz wenige Fallen R�ume	| 10%
		 * 
		 *  Normal normal idle R�ume		| 20%
		 * 		normal Loot					| 20%
		 * 		normal Monster R�ume		| 50%
		 * 		wenige Fallen R�ume			| 10%
		 * 
		 * 
		 *  Hard wenige idle R�ume			| 10%
		 * 		wenige Loot					| 10%
		 * 		viele Monster R�ume			| 50%
		 * 		viele Fallen R�ume			| 30%
		 * 
		 * 
		 */
		
		
		return new Room();
	}
	
}
