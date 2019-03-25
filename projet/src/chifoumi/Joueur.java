package chifoumi;

public class Joueur {
	
	private String nom;
	private int score;
	
	public Joueur(String nom) {
		this.nom=nom;
		this.score=0;
	}
	
	// TODO
	public Coup joue() {
		
		return null;
	}
	
	public String nom() {	
		return nom;
	}
	
	public int score() {
		return score;
	}
	
	public String toString() {
		
		return " " + nom() + " = " + score() +" " ;
		
	
	}

	
}
