package engine.ConsoleEngine;

/**
 * Diese Klasse enstpricht einer ASCII Grafik
 * 
 * @author Ludwig
 *
 */
public enum ASCIIGraphics {

	HorizontalSword(IOSystem.readASCIIGraphics("sword1.ascii"), 2),
	CommingSword(IOSystem.readASCIIGraphics("sword2.ascii"), 2),
	Dragon(IOSystem.readASCIIGraphics("dragon1.ascii"), 2),
	Head_Asia(IOSystem.readASCIIGraphics("head_asia1.ascii"), 2);
	
	private String text;
	private int fontSize;
	
	ASCIIGraphics(String text, int fontSize){
		this.text = text;
		this.fontSize = fontSize;
	}
	
	@Override
	public String toString(){
		return text;
	}

	public int getFontSize() {
		return fontSize;
	}
}
