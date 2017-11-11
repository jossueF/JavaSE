package ventanas;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AppCombo extends JFrame{

	private JComboBox favoriteShows;
	private JButton btnEnviar;
	private String infoOfComponent = "";
	private JPanel principal;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Falla en asignacion de"
					+ " estilo", JOptionPane.WARNING_MESSAGE);
		}
		new AppCombo().setVisible(true);
	}

	public AppCombo(){
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		principal = new JPanel();

		
		String[] shows= {"Breaking bad", "Stranger Things", "Doctor Who"};
		favoriteShows = new JComboBox(shows);
		
		principal.add(favoriteShows);
		this.add(principal);
	}
}
