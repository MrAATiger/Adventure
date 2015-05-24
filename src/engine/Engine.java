package engine;

public interface Engine {

	
	public abstract String getStringInput(String inputMessage);
	
	public abstract void printWindowMessage(String message);
	
	public abstract void printErrorMessage(String message);
	
	public abstract void printSystemMessage(String message);

	public abstract void print(String message);

	public abstract void println(String string);
	
	
	
}
