package text.adventure.game.creatures.player;

import text.adventure.game.items.armor.Armor;
import text.adventure.game.items.armor.Armor.ArmorTyp;
import text.adventure.game.items.waffen.Waffen;
import text.adventure.game.logic.Typ;

public class Equipment {

	private static Armor defaultHead = new Armor("Kopf", ArmorTyp.Head, Typ.Normal, 0, 0, 0);
	private static Armor defaultHand = new Armor("Hände", ArmorTyp.Hand, Typ.Normal, 0, 0, 0);
	private static Armor defaultLegs = new Armor("Beine", ArmorTyp.Legs, Typ.Normal, 0, 0, 0);
	private static Armor defaultBody = new Armor("Nackter Oberkörper", ArmorTyp.Body, Typ.Normal, 0, 0, 0);
	private static Armor defaultShoes = new Armor("Füße", ArmorTyp.Shoes, Typ.Normal, 0, 0, 0);

	private Waffen linkeHand;
	private Waffen rechteHand;
	
	private Armor head;
	private Armor hand;
	private Armor legs;
	private Armor body;
	private Armor shoes;

	private int waffenstaerkeWorkaraund;

	public Equipment(int startMaxPlayerAttack) {
		waffenstaerkeWorkaraund = startMaxPlayerAttack;

		head = defaultHead;
		hand = defaultHand;
		legs = defaultLegs;
		body = defaultBody;
		shoes = defaultShoes;

	}

	public int getWeaponPower() {
		return waffenstaerkeWorkaraund;
	}

	// waffen
	public Waffen getLinkeHand() {
		return linkeHand;
	}

	public void setLinkeHand(Waffen linkeHand) {
		this.linkeHand = linkeHand;
	}

	public Waffen getRechteHand() {
		return rechteHand;
	}

	public void setRechteHand(Waffen rechteHand) {
		this.rechteHand = rechteHand;
	}

	
	// Ruestungen
	public Armor getHead() {
		return head;
	}

	public void setHead(Armor head) {
		this.head = head;
		if(this.head == null){
			this.head = defaultHead;
		}
	}

	public Armor getHand() {
		return hand;
	}

	public void setHand(Armor hand) {
		this.hand = hand;
		if(this.hand == null){
			this.hand = defaultHand;
		}
	}

	public Armor getLegs() {
		return legs;
	}

	public void setLegs(Armor legs) {
		this.legs = legs;
		if(this.legs == null){
			this.legs = defaultLegs;
		}
	}

	public Armor getBody() {
		return body;
	}

	public void setBody(Armor body) {
		this.body = body;
		if(this.body == null){
			this.body = defaultBody;
		}
	}

	public Armor getShoes() {
		return shoes;
	}

	public void setShoes(Armor shoes) {
		this.shoes = shoes;
		if(this.shoes == null){
			this.shoes = defaultShoes;
		}
	}

}
