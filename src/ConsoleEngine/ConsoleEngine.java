package ConsoleEngine;

import java.util.Scanner;

import engine.Engine;

public class ConsoleEngine implements Engine {

	
	private Scanner sc;
	
	public ConsoleEngine() {
		sc = new Scanner(System.in);
	}
	

	@Override
	public void printWindowMessage(String message) {
		println(message);
		
	}

	@Override
	public void printErrorMessage(String message) {
		println(message);
	}

	@Override
	public void printSystemMessage(String message) {
		println(message);
	}
	
	public void println(String message){
		print(message + " \n");
	}
	
	@Override
	public void print(String message){
		System.out.print(message);
	}

	@Override
	public String getStringInput(String inputMessage) {

		print("==>");
		
		return sc.next();
	}

}
