package chifoumi;

public class LanceUnePartie {
	
	public static  void main(String[] arg) {

		Jeu mon_jeu = new Jeu("omar","emmanuel",5,true);
		//Jeu mon_jeu = new Jeu("omar","emmanuel",5,false);
		//Jeu mon_jeu = new Jeu("omar",null,5,true);
		

		mon_jeu.jouerUnePartie();
		
	}

}
