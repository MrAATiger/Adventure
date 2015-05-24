package engine;

public interface Engine {

	
	public abstract void askForStringInput(String inputMessage);
	
	public abstract void printWindowMessage(String message);
	
	public abstract void printErrorMessage(String message);
	
	public abstract void printSystemMessage(String message);

	public abstract void print(String message);

	public abstract void println(String string);
	
	public abstract void print(Object obj);

	public abstract void println(Object obj);
	
}
