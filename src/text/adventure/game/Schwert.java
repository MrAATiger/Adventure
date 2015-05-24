package text.adventure.game;

public class Schwert extends Waffen {

	public Schwert(int stärke, int gewicht, int durchschlagskraft,
			int verzauberung) {
		super(stärke, gewicht, durchschlagskraft, verzauberung);
		// TODO Auto-generated constructor stub
		String name = Schwert.class.getName() + " [ " + verzauberung + " ]";
	}



}
