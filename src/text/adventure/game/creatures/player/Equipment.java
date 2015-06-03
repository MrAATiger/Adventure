package text.adventure.game.creatures.player;

import text.adventure.game.waffen.Waffen;

public class Equipment {

	private Waffen linkeHand;
	private Waffen rechteHand;
	
	
	private int waffenstaerkeWorkaraund;
	
	public Equipment(int startMaxPlayerAttack) {
		waffenstaerkeWorkaraund = startMaxPlayerAttack;
	}

	
	public int getWeaponPower(){
		return waffenstaerkeWorkaraund;
	}
	
}
