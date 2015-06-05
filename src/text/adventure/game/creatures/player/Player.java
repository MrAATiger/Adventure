package text.adventure.game.creatures.player;

import java.util.List;
import java.util.Random;

import text.adventure.game.creatures.Status;
import text.adventure.game.items.Item;
import text.adventure.game.logic.State;

public class Player {

	private static final int START_MAX_PLAYER_DEFENCE = 20;
	private static final int START_MAX_PLAYER_ATTACK = 50;
	private static final int START_MAX_PLAYER_HEALTH = 50;
	private static final int START_MAX_PLAYER_WEIGHT = 100;

	private int score;

	private String name;
	private Status status;
	
	private Inventar inventory;
	private Equipment equip;

	Random rand = new Random();

	public Player(String name) {
		this.name = name;
		this.status = new Status(START_MAX_PLAYER_HEALTH, START_MAX_PLAYER_DEFENCE,  new State());
		this.equip = new Equipment(START_MAX_PLAYER_ATTACK);
		this.inventory = new Inventar(START_MAX_PLAYER_WEIGHT);
		this.score = 0;		
	}
	
	public Inventar getInventory(){
		return inventory;
	}
	
	public Equipment getEquipment(){
		return equip;
	}
	
	public Status getState(){
		return status;
	}
	

	public void addScore(int score){
		this.score += score;
	}
	
	public int getScore(){
		return score;
	}
	
	public String getPlayerName() {
		return name;
	}
	
	@Override
	public String toString(){
		return name;
	}

}
