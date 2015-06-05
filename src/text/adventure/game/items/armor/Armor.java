package text.adventure.game.items.armor;

import text.adventure.game.items.Item;
import text.adventure.game.logic.Typ;

public class Armor implements Item {

	public enum ArmorTyp {
		Head, Body, Hand, Legs, Shoes;
	}

	private String name;
	private int defense;
	private Typ typ;
	private int weight;
	private int value;
	private ArmorTyp armorTyp;

	/**
	 * 
	 * @param name
	 * @param armorTyp
	 * @param typ
	 * @param weight
	 * @param value
	 * @param defense
	 */
	public Armor(String name, ArmorTyp armorTyp, Typ typ, int weight,
			int value, int defense) {
		this.name = name;
		this.weight = weight;
		this.value = value;
		this.armorTyp = armorTyp;
		this.typ = typ;
		this.defense = defense;
	}

	public int getDefense() {
		return defense;
	}

	public Typ getTyp() {
		return typ;
	}

	public ArmorTyp getArmorTyp() {
		return armorTyp;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public int getValue() {
		return value;
	}
}