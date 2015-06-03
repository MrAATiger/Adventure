package text.adventure.game.dungeon.event;

import java.util.List;

import text.adventure.game.dungeon.Event;
import text.adventure.game.enemies.Enemy;

public class MonsterEvent implements Event {

	private List<Enemy> enemy;

	public MonsterEvent(List<Enemy> enemy) {
		this.enemy = enemy;
	}
	
	public List<Enemy> getEnemies(){
		return enemy;
	}
	
}
