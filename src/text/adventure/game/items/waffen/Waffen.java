package text.adventure.game.items.waffen;

import text.adventure.game.items.Item;
import text.adventure.game.logic.Typ;

public class Waffen implements Item {

	private String name;
	
	private int power;
	private Typ verzauberung;
	
	private int gewicht;
	private int durchschlagskraft;
	private int value;

	public Waffen (String name, int power, int durchschlagskraft, int gewicht, Typ verzauberung, int value) {

		this.name = name;
		this.power = power;
		this.gewicht = gewicht;
		this.durchschlagskraft = durchschlagskraft;
		this.verzauberung = verzauberung;
		this.value = value;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getWeight() {
		return gewicht;
	}

	@Override
	public int getValue() {
		return value;
	}

}
