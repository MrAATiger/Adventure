package text.adventure.game.dungeon.event;

import java.util.List;

import text.adventure.game.creatures.enemies.Enemy;
import text.adventure.game.dungeon.Event;

public class MonsterEvent implements Event {

	private List<Enemy> enemy;

	public MonsterEvent(List<Enemy> enemy) {
		this.enemy = enemy;
	}
	
	public List<Enemy> getEnemies(){
		return enemy;
	}
	
}
