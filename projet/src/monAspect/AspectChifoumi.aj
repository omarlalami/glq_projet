package monAspect;

import java.util.HashMap;
import chifoumi.*;

public aspect AspectChifoumi{
	

	HashMap scoreJoueur = new HashMap<Joueur, Integer>();
	
	HashMap partieGagner = new HashMap<Joueur, Integer>();
	HashMap partiePerdu = new HashMap<Joueur, Integer>();
	HashMap partieNull = new HashMap<Joueur, Integer>();

	private Integer nombreCoup[] = {0,0,0} ;
	private int coupTotal =0;
		
	 private Integer nbrPartieGagngerJ1 = 0;
	 private Integer nbrPartieGagngerJ2 = 0;
	
	 private Integer nbrPartiePerduJ1 =  0;
	 private Integer nbrPartiePerduJ2 = 0;
	
	 private Integer nbrPartieNullJ1 = 0;
	 private Integer nbrPartieNullJ2 =0;
	
	
	pointcut appelScore(Joueur j) : 
		call(Coup Joueur.joue())
		&& target(j); 
	after(Joueur j) : appelScore(j) { 
		//score +=score;	
		scoreJoueur.put(j, j.score());
		System.out.println("Score = " +j.score());		
	System.out.println(scoreJoueur);
	}

	
	pointcut appelPartieGagner(Joueur j) : 
		call(void gagnerPartie())
		&& target(j);
	
	after(Joueur j) : appelPartieGagner(j){
		partieGagner.put(j,j.gagnerPartie());
		System.out.println("Gagnant : " +j.getName());
		
		nbrPartieGagngerJ1 = partieGagner.get(monJoueur1);
		nbrPartieGagngerJ2 = partieGagner.get(monJoueur2);
		
		nbrPartiePerduJ1 =  partiePerdu.get(monJoueur1);
		nbrPartiePerduJ2 =  partiePerdu.get(monJoueur2);
		
		nbrPartieNullJ1 = partieNull.get(monJoueur1);
		nbrPartieNullJ2 = partieNull.get(monJoueur2);
		
			
			
		if(jouerUnePartie[0] > jouerUnePartie[1])
			//jouerUnePartie.donnerLeGagnant(monJoueur1) 
			
			partiePerdu.put(monJoueur1, nbrPartieGagnger+1);
			partieGagner.put(monJoueur2, nbrPartiePerdu+1);
			else {
				partieNull.put(monJoueur1, nbrPartieNull+1);
				partieNull.put(monJoueur2, nbrPartieNull+1);			
			}
		
		System.out.println(partieGagner);
		System.out.println(partiePerdu);
		System.out.println(partieNull);

	}
	
	
	
	pointcut appelNombreDeCoup(Joueur j) : 
		call(JouerLeTour(int n))
		&& target(j);
	
	after(Joueur j) : appelNombreDeCoup(j){
		
		coupTotal++;
		if(Coup == "PIERRE")
			nombreCoup[0] +=1;
		
		if(Coup == "FEUILLE")
			nombreCoup[1] +=1;
		
		if(Coup == "CISEAUX")
			nombreCoup[2]+=1;
	
		
		System.out.println("PIERRE a etait joué :  " + nombreCoup[0]*100/coupTotal);
		System.out.println("FEUILLE a etait joué :  " + nombreCoup[1]*100/coupTotal);
		System.out.println("CISEAUX a etait joué :  " + nombreCoup[2]*100/coupTotal);
	
	}
	
}