package chifoumi;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class IHMChoix extends JOptionPane {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JDialog dialogue;
	Coup[] choix = {Coup.PIERRE, Coup.FEUILLE, Coup.CISEAUX};
	
	public IHMChoix(String nom) {
		setMessage("joue : " );
		setOptions(choix);
		dialogue = createDialog(null, nom);
	}

	Coup proposerChoix() {
		dialogue.setVisible(true);
		return  (Coup) getValue();
	}
	
	public IHMOrdinateur(String nom) {
		setMessage(nom + " joue " );
		setOptions(choix);
		dialogue = createDialog(null, "Message");
	}
	
	
	void coupOrdinateur(Coup c) {
		
	}
	
}