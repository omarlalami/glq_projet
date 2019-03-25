package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import chifoumi.Jeu;

class JouerPartieTest {
	public int ResultatScore[];
	public DoublureJeu mon_jeu;
	public DoublureJeu mon_jeu2;
	
	@BeforeAll
	void Initialisation() {
		
		
		 mon_jeu = new DoublureJeu("aziz","Théo",5,false);
		 mon_jeu2 = new DoublureJeu("aziz","Théo",5,true);
	
	}
	
	@Test 
	void JouerPartieConditionScore()
	{
		 ResultatScore= mon_jeu.jouerUnePartie();
		 assertEquals(5, ResultatScore[0]);
		 
	}
	void JouerPartieConditionTour()
	{
		 ResultatScore= mon_jeu.jouerUnePartie();
		 assertEquals(5, ResultatScore[0]);
		 
	}

}