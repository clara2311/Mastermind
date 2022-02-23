import java.awt.Color;

public class Rangé {
	
	public Color[] jeton;
	public int indiceJeton;
	public int[] coupleNoirBlanc;
	
	public Rangé() {
		jeton=new Color[Modèle.DIFFICULTE];
		indiceJeton=0;
		coupleNoirBlanc=new int[2];
	}
	
}
