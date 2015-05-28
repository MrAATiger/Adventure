package engine.ConsoleEngine;

/**
 * Diese Klasse enstpricht einer ASCII Grafik
 * 
 * @author Ludwig
 *
 */
public enum ASCIIGraphics {

	HorizontalSword(IOSystem.readASCIIGraphics("sword1.ascii")),
	CommingSword(IOSystem.readASCIIGraphics("sword2.ascii")),
	Dragon(IOSystem.readASCIIGraphics("dragon1.ascii"));
	
	
	
	private String text;
	
	ASCIIGraphics(String text){
		this.text = text;
	}
	
	@Override
	public String toString(){
		return text;
	}
}
