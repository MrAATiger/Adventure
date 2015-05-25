package text.adventure.game;

import java.util.Random;

public class Player {

	private int maxPlayerHealth = 100;
	private static final int MAX_PLAYER_DEFENCE = 20;
	private static final int MAX_PLAYER_ATTACK = 50;

	private String playerName;
	private int score;

	Random rand = new Random();

	public Player(String playerName) {
		this.playerName = playerName;
		this.score = 0;
	}

	public int playerDefence, playerAttack, dropChance, heal;

	public void setMAX_PLAYER_HEALTH(int maxPlayerHealth) {
		this.maxPlayerHealth = maxPlayerHealth;
	}

	public int getMAX_PLAYER_HEALTH() {
		return maxPlayerHealth;
	}

	public void addScore(int score){
		this.score += score;
	}
	
	public int getScore(){
		return score;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	@Override
	public String toString(){
		return playerName;
	}

}
