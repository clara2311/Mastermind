import java.awt.Color;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class Mod�le {

	public static Color[] COLOR= {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	public static int N_TENTIVES;
	public static int DIFFICULTE;
	//Alt+0201
	public static enum Etat {EN_COURS,GAGN�,PERDU};
	public Etat etat;
	public Rang� combinaison;
	public int tentative;
	public Rang�[] propositions=new Rang�[tentative];
	
	public Mod�le() {
		
	}
	
	public Deque clavierDeSaisie() {
		Deque<Color> file = new ArrayDeque<Color>();
		
		
		return file;
	}
	
	public void completerLaProposition(Deque file) {
		
		
	}
	
	public void combinaison() {
		
	}
	public void evaluerProposition() {
		
	}
	public void demarerNouvelleProposition() {
		
	}
	public void archiverProposition() {
		
	}
	public void historiquePropositions() {
		
	}
	public void afficherPropositions() {
		
	}
	
	public void afficherPropositionEnCours() {
		
	}
	public void pateauJeu() {
		
	}
	
	
	
}
