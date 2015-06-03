package text.adventure.game.dungeon;

import java.util.List;
import java.util.Random;

import text.adventure.game.dungeon.room.FinalRoom;
import text.adventure.game.dungeon.room.IdleRoom;
import text.adventure.game.dungeon.room.LootRoom;
import text.adventure.game.dungeon.room.MonsterRoom;
import text.adventure.game.dungeon.room.TrapRoom;
import text.adventure.game.dungeon.room.WelcomeRoom;

public class Map {
	
	
	private List<Room> rooms;
	private Difficult difficult;
	private Random r;
	private int position;
	
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

	public Map(Difficult difficult) {
		// TODO Auto-generated constructor stub
	}

	public Room getCurrentRoom(){
		return rooms.get(position);
	}
	
	public Room getNextRoom() {
		
		position++;
		
		if(position == rooms.size()){
			return new FinalRoom();
		}
		
		return rooms.get(position);
	}
	
	private Room getRandomRoom() {
		/*
		 * Welche arten von Räumen gibt es???
		 * 
		 * - Wilkommensraum
		 * - Fallen raum
		 * - Loot Raum
		 * - idle Raum
		 * - Monster Raum
		 *
		 * Von der Difficult hängt es ab welche Art von Räumen wie wahrscheinlich drankommen
		 * 
		 * Easy mehr idle Räume				| 30%
		 * 		mehr Loot					| 30%
		 * 		weniger Monster Räume		| 35%
		 * 		ganz wenige Fallen Räume	| 5%
		 * 
		 *  Normal normal idle Räume		| 20%
		 * 		normal Loot					| 20%
		 * 		normal Monster Räume		| 50%
		 * 		wenige Fallen Räume			| 10%
		 * 
		 * 
		 *  Hard wenige idle Räume			| 10%
		 * 		wenige Loot					| 10%
		 * 		viele Monster Räume			| 50%
		 * 		viele Fallen Räume			| 30%
		 * 
		 * 
		 */
		
		r = new Random();
		
		int number = r.nextInt(100);
		
		switch (difficult) {
		
			case Hard:
		
				if(number <= 30){
					return new IdleRoom();
				} else if (30 < number && number < 60) {
					return new LootRoom();					
				} else if (60 <= number && number < 95) {
					return new MonsterRoom();					
				} else {
					return new TrapRoom();					
				}
			
			case Normal:
				
				if (number <= 20) {
					return new IdleRoom();
				} else if (20 < number && number < 40) {
					return new LootRoom();
				} else if (40 <= number && number < 90) {
					return new MonsterRoom();
				} else {
					return new TrapRoom();
				}
		
			default:
				
				if (number <= 10) {
					return new IdleRoom();
				} else if (10 < number && number < 20) {
					return new LootRoom();
				} else if (20 <= number && number < 70) {
					return new MonsterRoom();
				} else {
					return new TrapRoom();
				}
		
		}
		
		
	}
	
}
