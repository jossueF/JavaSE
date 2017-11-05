package ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Window_1 extends JFrame{

	private JButton btnEnviar;
	private JPanel panelPrincipal;
	private JLabel label;
	private JTextField campo;
	private JTextArea area;
	private JScrollPane scrollPane;
	
	public static void main(String[] args){
		new Window_1();
	}
	
	public Window_1(){
		
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Ventana principal");
		
		panelPrincipal = new JPanel();
		
		label = new JLabel("Dime algo");
		panelPrincipal.add(label);
		
		btnEnviar = new JButton("Enviar");
		//btnEnviar.setContentAreaFilled(false);
		btnEnviar.setToolTipText("Enviar!");
		panelPrincipal.add(btnEnviar);
		ListenForButton listenBtn = new ListenForButton();
		btnEnviar.addActionListener(listenBtn);
		
		campo = new JTextField("", 15);
		ListenForKeys lForKeys = new ListenForKeys();
		campo.addKeyListener(lForKeys);
		panelPrincipal.add(campo);
		
		area = new JTextArea(15, 20);
		area.setLineWrap(true);
		//panelPrincipal.add(area);
		
		scrollPane = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panelPrincipal.add(scrollPane);
		

		this.add(panelPrincipal);
		ListenForWindow lForWindow = new ListenForWindow();
		this.addWindowListener(lForWindow);
		this.setVisible(true);
		campo.requestFocus();
		
		ListenForMouse lForMouse = new ListenForMouse();
		panelPrincipal.addMouseListener(lForMouse);
	}
	
	
	//Implementar listeners
	private class ListenForButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnEnviar){
				
			}
		}
	}
	
	private class ListenForKeys implements KeyListener{
		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
		}
	}
	
	private class ListenForWindow implements WindowListener{
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	private class ListenForMouse implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	
	//FocusListener//
}
