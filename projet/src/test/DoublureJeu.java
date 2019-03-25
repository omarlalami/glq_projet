package test;
import chifoumi.*;

public class DoublureJeu {

	Joueur monJoueur1;
	Joueur monJoueur2;
	
	private int scoreMax;
	private int nbToursMax;
	
	private boolean objectif;
	
	private int numeroTourActuel;

	
	public DoublureJeu(String nom_joueur_1, String nom_joueur_2) {
		monJoueur1 = new Joueur(nom_joueur_1);
		monJoueur2 = new Joueur(nom_joueur_2);
		
		if(nom_joueur_2==null) {
			monJoueur2.setNom("Joueur_2");
		}
		
		if(nom_joueur_1==null) {
			monJoueur1.setNom("Joueur_1");
		}
		
	}
	
	public DoublureJeu(String nom1, String nom2,int score_ou_nbTour_Max, boolean score_ou_nbTour ) {
		
		this(nom1,nom2);
		
		this.objectif=score_ou_nbTour;
		
		if( score_ou_nbTour == false ) {
			this.scoreMax = score_ou_nbTour_Max;
			this.nbToursMax = 0;
		}
		else {
			this.scoreMax = 0;
			this.nbToursMax = score_ou_nbTour_Max;
		}
		
		numeroTourActuel = 0;
	}
	
	private void jouerLeTour(int n) {
		
		
	   Coup coup_joueur1 = Coup.FEUILLE;
	   Coup coup_joueur2 = Coup.CISEAUX;
	   
	   String operateur="";
	   
	   switch (coup_joueur1) {
	    case PIERRE:
	        switch (coup_joueur2) {
	            case PIERRE:
	            	operateur="=";
	                break;
	            case FEUILLE:
	                monJoueur2.setScore(monJoueur2.score() + 1);
	            	operateur="<";
	                break;
	            case CISEAUX:
	                monJoueur1.setScore(monJoueur1.score() + 1);
	            	operateur=">";
	                break;
	        }
	        break;
	    case FEUILLE:
	        switch (coup_joueur2) {
	            case PIERRE:
	                monJoueur1.setScore(monJoueur1.score() + 1);
	            	operateur=">";
	                break;
	            case FEUILLE:
	            	operateur="=";
	                break;
	            case CISEAUX:
	                monJoueur2.setScore(monJoueur2.score() + 1);
	            	operateur="<";
	                break;
	        }
	        break;
	    case CISEAUX:
	        switch (coup_joueur2) {
	            case PIERRE:
	                monJoueur2.setScore(monJoueur2.score() + 1);
	            	operateur="<";
	                break;
	            case FEUILLE:
	                monJoueur1.setScore(monJoueur1.score() + 1);
	            	operateur=">";
	                break;
	            case CISEAUX:
	            	operateur="=";
	                break;
	        }
	        break;
	}
	 
	   
	   
	   afficheTour(coup_joueur1,coup_joueur2,operateur);
	
	}
	
	public void afficheTour(Coup coup_joueur1, Coup coup_joueur2, String operateur) {
		
		numeroTourActuel++;
		System.out.println("*** Tour "+numeroTourActuel+" ***");
		System.out.println(monJoueur1.nom()+"("+coup_joueur1+")"+operateur+monJoueur2.nom()+"("+coup_joueur2+")");
		System.out.println(monJoueur1.nom()+" = "+monJoueur1.score() +" " +monJoueur2.nom()+" = "+monJoueur2.score());
		
	}
	
	
	public int [] jouerUnePartie() {
		 
		int resultatPartie [] = new int [2];
		boolean fini=false;
		
		while (fini==false) {
			
			jouerLeTour(numeroTourActuel);


			if( objectif == false ) {
				
				if (monJoueur1.score()>=scoreMax || monJoueur2.score()>=scoreMax )
				{
					if (monJoueur1.score()>=scoreMax)
					{
						fini=true;
					}
					else 
					{
						fini=true;	
					}
						
				}
				
			}else {
				if (numeroTourActuel>=nbToursMax)
				{
					fini=true;
				}
			}
					


			
			
			resultatPartie[0]=monJoueur1.score();
			resultatPartie[1]=monJoueur2.score();
			
		}
		
		if(resultatPartie[0]>resultatPartie[1])
			donnerLeGagnant(monJoueur1);
		else
			donnerLeGagnant(monJoueur2);

		return resultatPartie;

	 }
	
	
	public void donnerLeGagnant(Joueur joueur)
	{
		System.out.println(joueur.nom() + " remporte cette partie");
	}
	
}
