package test;

import java.util.Random;

import chifoumi.*;

public class DoublureJoueur {
	
	private String nom;
	private int score;
	private IHMChoix fenetreChoix;
	private boolean estUnHumain;
	
	public DoublureJoueur(String nom) {
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
			 return Coup.PIERRE;
			
			 
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