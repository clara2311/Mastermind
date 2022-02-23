import java.awt.Color;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class Modèle {

	public static Color[] COLOR= {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	public static int N_TENTIVES;
	public static int DIFFICULTE;
	//Alt+0201
	public static enum Etat {EN_COURS,GAGNÉ,PERDU};
	public Etat etat;
	public Rangé combinaison;
	public int tentative;
	public Rangé[] propositions=new Rangé[tentative];
	
	public Modèle() {
		
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
