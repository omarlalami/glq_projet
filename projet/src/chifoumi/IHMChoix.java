package chifoumi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

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
	
	void coupOrdinateur(Coup c) {
		
	    JFrame f = new JFrame("message");
	    f.setSize(300,100);
	    JPanel pannel = new JPanel();

	    JButton bouton1  =new JButton("OK");
	    bouton1 .addActionListener( new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		System.exit(0);
	    	}
	    }
	    );
	    
	    pannel.add(bouton1);
	    f.getContentPane().add(pannel);
	    f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	    f.setVisible(true);

	}
	
}