package text.adventure.game;

public class Schwert extends Waffen {

	public Schwert(int st�rke, int gewicht, int durchschlagskraft,
			int verzauberung) {
		super(st�rke, gewicht, durchschlagskraft, verzauberung);
		// TODO Auto-generated constructor stub
		String name = Schwert.class.getName() + " [ " + verzauberung + " ]";
	}



}
