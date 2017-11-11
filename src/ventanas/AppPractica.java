package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class AppPractica extends JFrame{

	/*JFrame default layout: BorderLayout[hgap=0,vgap=0]*/
	/*JPanel default layout: FlowLayout[hgap=5,vgap=5,align=center]*/
	
	private JPanel menuPanel, principalPanel, piePanel;
	private JPanel piePanelF;
	
	private JMenuBar menu;
	private JMenu archivo, editar, ayuda;
	private Border bordeMenu, bordePrincipal, bordePie;
	private JLabel piePagina, randomText;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Falla en asignacion de"
					+ " estilo", JOptionPane.WARNING_MESSAGE);
		}
		new AppPractica().setVisible(true);
	}

	public AppPractica(){
		this.setSize(400, 400);
		this.setTitle("PraCtica");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		/////////////////////////////Panel_menu////////////////////////////
		menuPanel = new JPanel(new BorderLayout());
		bordeMenu = BorderFactory.createLineBorder(Color.BLACK);
		menuPanel.setBorder(bordeMenu);
		menu = new JMenuBar();
		archivo = new JMenu("archivo");
		editar = new JMenu("editar");
		ayuda = new JMenu("ayuda");
		
		menu.add(archivo);
		menu.add(editar);
		menu.add(ayuda);
		
		menuPanel.add(menu);
		
		/////////////////////////////Panel_principal////////////////////////////
		principalPanel = new JPanel(new BorderLayout());
		bordePrincipal = BorderFactory.createLineBorder(Color.BLUE);
		principalPanel.setBorder(bordePrincipal);
		
		/////////////////////////////Panel_pie////////////////////////////
		piePanel = new JPanel(new BorderLayout());
		bordePie = BorderFactory.createLineBorder(Color.GREEN);
		piePanel.setBorder(bordePie);
		
		//piePanel.add(piePagina);
		//piePanel.add(randomText);
		
		//Flow panel pie
		piePanelF = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		piePagina = new JLabel("CopyLeft(L) JFV_Software");
		randomText = new JLabel("texto aleatorio");
		piePanelF.add(piePagina);
		piePanel.add(piePanelF);
		//////////////////////////////////
	    /////////////////////////////////
		
		this.add(menuPanel, BorderLayout.NORTH);
		this.add(principalPanel, BorderLayout.CENTER);
		this.add(piePanel, BorderLayout.SOUTH);
	}
}
