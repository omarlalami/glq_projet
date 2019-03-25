package chifoumi;

import java.util.Random;

public class Joueur {
	
	private String nom;
	private int score;
	private IHMChoix fenetreChoix;
	private boolean estUnHumain;
	
	public Joueur(String nom) {
		if(nom==null) {
			estUnHumain=false;
		}	
		else {
			this.nom=nom;
			estUnHumain=true;
		}
		this.score=0;
		fenetreChoix = new IHMChoix(nom());
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public Coup joue() {
		if(estUnHumain == true)
			return fenetreChoix.proposerChoix();
		else {
			 Random hasard = new Random();
			 Coup c = Coup.values()[hasard.nextInt(Coup.values().length)];
			 fenetreChoix.coupOrdinateur(c);
			 return c;
		}
			 
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
