package chifoumi;

public class Joueur {
	
	private String nom;
	private int score;
	private IHMChoix fenetreChoix;
	
	public Joueur(String nom) {
		this.nom=nom;
		this.score=0;
		fenetreChoix = new IHMChoix(nom());
	}
	
	public Coup joue() {
		return fenetreChoix.proposerChoix();
	}
	
	public String nom() {	
		return nom;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	public int score() {
		return score;
	}
	
	public String toString() {
		return " " + nom() + " = " + score() +" " ;
	}

	
}
