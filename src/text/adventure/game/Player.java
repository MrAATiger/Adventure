package text.adventure.game;

import java.util.Random;


public class Player {
	
		private int maxPlayerHealth = 						100;
		private static final int MAX_PLAYER_DEFENCE =		 20;
		private static final int MAX_PLAYER_ATTACK =		 50;
		private int healPotionAmount =						  5;
		private int healPotionDropChance =					 30;
		private int healPotionHealAmount =   				 50;
		private String playerName;
		
		Random rand = new Random ();
		
		public Player(String playerName) {
			this.playerName = playerName;
		}
		
		public int  playerDefence, playerAttack, dropChance, heal;
		
		public void setMAX_PLAYER_HEALTH (int maxPlayerHealth) {
			this.maxPlayerHealth = maxPlayerHealth;
		}
		
		public int getMAX_PLAYER_HEALTH () {
			return maxPlayerHealth;
		}
	
		public String getPlayerName (){
			return playerName ;
		}
		public void setHealPotionAmount (int healPotionAmount){
			this.healPotionAmount = healPotionAmount;
		}
		
		public int getHealPotionAmount () {
			return healPotionAmount;
		}
		
		public void setHealPotionDropChance (int healPotionDropChance) {
			dropChance = rand.nextInt(100);
			if (dropChance <=  healPotionDropChance){
				healPotionAmount ++;
			}
				}
		
		public int getHealPotionDropChance () {
			return healPotionDropChance;
		}
		
		
		
		
		}
		
		




