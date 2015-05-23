package text.adventure.game;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class GameLogic {
	Scanner sc = new Scanner (System.in);
	private String playerName;
   
   
	public GameLogic (String playerName){
		this.playerName = playerName;
	}
	
	public void beginn () {
		
	System.out.println("Willkommen zum Text-Adventure VerBlubbDichNicht ");
	System.out.println("Bevor wir beginnen möchte ich dich bitten deinen Namen einzugeben.");
	System.out.println("==>");
	
	}
	
	public String getPlayerName (){
		playerName = sc.nextLine();
		
		return playerName;
	}
	
	public void namensEingabe () {
		Player player = new Player (playerName);
		System.out.println (player.getPlayerName());
	}
	
	
	
	
	
}