package text.adventure.game.creatures;

import text.adventure.game.state.State;

public class Status {

	private int health;
	private int defence;
	private State state;

	/**
	 * 
	 * @param health
	 * @param defence
	 * @param state
	 */
	public Status(int health, int defence, State state){
		this.health = health;
		this.defence = defence;
		this.state = state;
	}
	
	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return the defence
	 */
	public int getDefence() {
		return defence;
	}

	/**
	 * @param defence the defence to set
	 */
	public void setDefence(int defence) {
		this.defence = defence;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

}
