package text.adventure.game;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class GameLogic {
	Scanner sc = new Scanner (System.in);
	private String playerName;
   
   

	
	
	public void beginn () {
		
	System.out.println("Willkommen zum Text-Adventure VerBlubbDichNicht ");
	System.out.println("Bevor wir beginnen möchte ich dich bitten deinen Namen einzugeben.");
	System.out.println("==>");
	namensEingabe ();
	
	}
	
	public void namensEingabe () {
		playerName = sc.nextLine();
		Player player = new Player (playerName);
		System.out.println (player.getPlayerName());
		derAnfang ();
	}
	
	public void derAnfang (){
		
	}
	
	
	
	
	
}