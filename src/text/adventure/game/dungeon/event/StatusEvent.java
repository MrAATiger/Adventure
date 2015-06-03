package text.adventure.game.dungeon.event;

import text.adventure.game.dungeon.Event;
import text.adventure.game.state.State;

public class StatusEvent implements Event {

	private State state;
	private int heathChange;

	public StatusEvent(State state,  int heathChange){
		this.state = state;
		this.heathChange = heathChange;
	}
	
	public State getStateChange(){
		return state;
	}
	
	public int getHeathChange(){
		return heathChange;
	}
}
