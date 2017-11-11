package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class AppLayout extends JFrame{

	private JButton button1, button2, button3, button4, button5;
	private JPanel flowPanel, borderPanel;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Falla en asignacion de"
					+ " estilo", JOptionPane.WARNING_MESSAGE);
		}
		new AppLayout().setVisible(true);;
	}

	public AppLayout(){
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Layouts");
		this.setLocationRelativeTo(null);

		/*flowLayout*/
		/*flowPanel = new JPanel();
		flowPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		//flowPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 0)); //30 espacio a la derecha e
		//izquierda, 0 espacio arriba y abajo.
		
		Border flowBorder = BorderFactory.createLineBorder(Color.BLACK);
		flowPanel.setBorder(flowBorder);
		button1 = new JButton("Button_1");
		button2 = new JButton("Button_2");
		button3 = new JButton("Button_3");
		button4 = new JButton("Button_4");
		button5 = new JButton("Button_5");
		
		flowPanel.add(button1);
		flowPanel.add(button2);
		flowPanel.add(button3);
		flowPanel.add(button4);
		flowPanel.add(button5);
		
		this.add(flowPanel);*/
		
		/*BorderLayout*/
		/*borderPanel = new JPanel();
		borderPanel.setLayout(new BorderLayout());
		button1 = new JButton("Button_1");
		button2 = new JButton("Button_2");
		button3 = new JButton("Button_3");
		button4 = new JButton("Button_4");
		button5 = new JButton("Button_5");
		
		borderPanel.add(button1, BorderLayout.NORTH);
		borderPanel.add(button2, BorderLayout.SOUTH);
		borderPanel.add(button3, BorderLayout.EAST);
		borderPanel.add(button4, BorderLayout.WEST);
		borderPanel.add(button5, BorderLayout.CENTER);
		
		this.add(borderPanel);*/
	}
}
