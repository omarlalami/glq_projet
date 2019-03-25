package chifoumi;

public class Jeu {

	Joueur monJoueur1;
	Joueur monJoueur2;
	
	private int scoreMax;
	private int nbToursMax;
	private boolean objectif;
	
	private int numeroTourActuel;

	
	public Jeu(String nom_joueur_1, String nom_joueur_2) {
		monJoueur1 = new Joueur(nom_joueur_1);
		monJoueur2 = new Joueur(nom_joueur_2);
	}
	
	public Jeu(String nom1, String nom2,int score_ou_nbTour_Max, boolean score_ou_nbTour ) {
		
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
		
	}
	
	private void jouerLeTour(int n) {
		
	}
	
	
	public int [] jouerUnePartie() {
		 
		return null;
	 }
}
