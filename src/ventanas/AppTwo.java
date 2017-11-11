package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AppTwo extends JFrame{

	private static final long serialVersionUID = 1L;
	private JButton btnCalcular;
	private JLabel lblTexto1, lblTexto2, lblTexto3;
	private static JTextField txtCampo1, txtCampo2;
	private JCheckBox dollarSign, commaSeparator;
	private JRadioButton addNums, substractNums, multNums, divideNums;
	private JSlider howManyTimes;
	private JPanel principal, menuPanel;
	private ImageIcon img;
	private JMenuBar menu;
	private JMenu archivo, editar, ayuda;
	private JMenuItem itemArchivo, archivoNuevo;
	
	double number1, number2, totalCalc;
	
	public static void main(String[] args){
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Falla en asignacion de"
					+ " estilo", JOptionPane.WARNING_MESSAGE);
		}

		new AppTwo().setVisible(true);
		txtCampo1.requestFocus();
	}
	
	public AppTwo(){
		//Frame
		this.setSize(400, 250);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Operaciones. CopyLeft(L) JFV");
		this.setResizable(false);
		img = new ImageIcon(getClass().getResource("/img/photo.jpg"));
		this.setIconImage(img.getImage());
		
		//Listeners
		ListenForButton lForButton = new ListenForButton();
		ListenForSlider lForSlider = new ListenForSlider();
		
		
		//Panel Principal
		principal = new JPanel(new FlowLayout());
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(lForButton);
		
		lblTexto1 = new JLabel("Número 1");
		txtCampo1 = new JTextField("", 5);
		
		lblTexto2 = new JLabel("Número 2");
		txtCampo2 = new JTextField("", 5);
		
		dollarSign = new JCheckBox("Dolar");
		commaSeparator = new JCheckBox("Coma");
		
		addNums = new JRadioButton("Suma");
		substractNums = new JRadioButton("Resta");
		multNums = new JRadioButton("Multiplicación");
		divideNums = new JRadioButton("División");
		
		ButtonGroup operaciones = new ButtonGroup();
		operaciones.add(addNums);
		operaciones.add(substractNums);
		operaciones.add(multNums);
		operaciones.add(divideNums);
		
		JPanel operPanel = new JPanel();
		Border operBorder = BorderFactory.createTitledBorder("Operaciones");
		operPanel.setBorder(operBorder);
		operPanel.add(addNums);
		operPanel.add(substractNums);
		operPanel.add(multNums);
		operPanel.add(divideNums);

		addNums.setSelected(true);
		
		lblTexto3 = new JLabel("¿Cuantas veces lo quieres ejecutar?");
		
		howManyTimes = new JSlider(0, 99, 1);
		howManyTimes.setMinorTickSpacing(1);
		howManyTimes.setMajorTickSpacing(10);
		howManyTimes.setPaintTicks(true);
		howManyTimes.setPaintLabels(true);
		howManyTimes.addChangeListener(lForSlider);
		
		//Menu
		menuPanel = new JPanel(new BorderLayout());
		menu = new JMenuBar();
		archivo = new JMenu("archivo");
		editar = new JMenu("editar");
		ayuda = new JMenu("aYuda");
		
		itemArchivo = new JMenuItem("Cargar archivo...");
		archivoNuevo = new JMenuItem("Nuevo");
		archivo.add(archivoNuevo);
		archivo.add(itemArchivo);
		
		menu.add(archivo);
		menu.add(editar);
		menu.add(ayuda);
		menuPanel.add(menu);
		//Añadir componentes al panel principal
		//principal.add(menu);
		principal.add(btnCalcular);
		principal.add(lblTexto1);
		principal.add(txtCampo1);
		principal.add(lblTexto2);
		principal.add(txtCampo2);
		principal.add(dollarSign);
		principal.add(commaSeparator);
		principal.add(operPanel);
		principal.add(lblTexto3);
		principal.add(howManyTimes);
		
		
		//Añadir componentes al frame
		this.add(menuPanel, BorderLayout.NORTH);
		this.add(principal, BorderLayout.CENTER);
		this.getRootPane().setDefaultButton(btnCalcular);
	}
	
	
	//Implementacion de Listeners
	private class ListenForButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnCalcular){
				try{
					number1 = Double.parseDouble(txtCampo1.getText());
					number2 = Double.parseDouble(txtCampo2.getText());
					
					if(addNums.isSelected()){
						totalCalc = addNumbers(number1, number2, howManyTimes.getValue());
					} else if(substractNums.isSelected()){
						totalCalc = substractNumbers(number1, number2, howManyTimes.getValue());
					} else if(multNums.isSelected()){
						totalCalc = multNumbers(number1, number2, howManyTimes.getValue());
					} else{
						totalCalc = divideNumbers(number1, number2, howManyTimes.getValue());
					}
					
					if(dollarSign.isSelected()){
						NumberFormat numFormat = NumberFormat.getCurrencyInstance();
						JOptionPane.showMessageDialog(AppTwo.this, numFormat.format(totalCalc),
								"Respuesta", JOptionPane.INFORMATION_MESSAGE);
					} else if(commaSeparator.isSelected()){
						NumberFormat numFormat = NumberFormat.getNumberInstance();
						JOptionPane.showMessageDialog(AppTwo.this, numFormat.format(totalCalc),
								"Respuesta", JOptionPane.INFORMATION_MESSAGE);
					} else{
						JOptionPane.showMessageDialog(AppTwo.this, totalCalc,
								"Respuesta", JOptionPane.INFORMATION_MESSAGE);
					}
					
					txtCampo1.setText("");txtCampo2.setText("");
					txtCampo1.requestFocus();
				} catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(AppTwo.this, "Por favor ingresa la información"
							+ " correcta", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		}
	}
	
	private class ListenForSlider implements ChangeListener{
		@Override
		public void stateChanged(ChangeEvent e) {
			if(e.getSource() == howManyTimes){
				howManyTimes.setToolTipText(Integer.toString(howManyTimes.getValue()));
			}
		}
	}
	
	private Double addNumbers(Double number1, Double number2, int ejec){
		double total = 0;
		int i = 1;
		
		while(i <= ejec){
			total += (number1 + number2);
			i++;
		}
		
		return total;
	}
	
	private Double substractNumbers(Double number1, Double number2, int ejec){
		double total = 0;
		int i = 1;
		
		while(i <= ejec){
			total += (number1 - number2);
			i++;
		}
		
		return total;
	}
	
	private Double multNumbers(Double number1, Double number2, int ejec){
		double total = 0;
		int i = 1;
		
		while(i <= ejec){
			total += (number1 * number2);
			i++;
		}
		
		return total;
	}
	
	private Double divideNumbers(Double number1, Double number2, int ejec){
		double total = 0;
		int i = 1;
		
		while(i <= ejec){
			total += (number1 / number2);
			i++;
		}
		
		return total;
	}
}
