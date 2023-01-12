import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class Calculadora {

	private JFrame frmPrincipalWindow;
	private JTextField txtOperando1;
	private JTextField txtOperando2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmPrincipalWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrincipalWindow = new JFrame();
		frmPrincipalWindow.setTitle("Calculadora");
		frmPrincipalWindow.setBounds(100, 100, 450, 300);
		frmPrincipalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrincipalWindow.getContentPane().setLayout(null);
		
		JLabel lblOperando1 = new JLabel("Operando 1:");
		lblOperando1.setBounds(101, 56, 90, 15);
		frmPrincipalWindow.getContentPane().add(lblOperando1);
		
		JLabel lblOperando2 = new JLabel("Operando 2:");
		lblOperando2.setBounds(101, 110, 90, 15);
		frmPrincipalWindow.getContentPane().add(lblOperando2);
		
		txtOperando1 = new JTextField();
		txtOperando1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOperando1.setBounds(221, 51, 114, 30);
		frmPrincipalWindow.getContentPane().add(txtOperando1);
		txtOperando1.setColumns(10);
		
		txtOperando2 = new JTextField();
		txtOperando2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOperando2.setColumns(10);
		txtOperando2.setBounds(221, 105, 114, 30);
		frmPrincipalWindow.getContentPane().add(txtOperando2);
		
		JButton btnSuma = new JButton("+");
		btnSuma.setBounds(101, 151, 50, 25);
		frmPrincipalWindow.getContentPane().add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.setBounds(163, 151, 50, 25);
		frmPrincipalWindow.getContentPane().add(btnResta);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setBounds(226, 151, 50, 25);
		frmPrincipalWindow.getContentPane().add(btnMultiplicar);
		
		JButton btnDividir = new JButton(":");
		btnDividir.setBounds(289, 151, 50, 25);
		frmPrincipalWindow.getContentPane().add(btnDividir);
		
		txtResultado = new JTextField();
		txtResultado.setBorder(null);
		txtResultado.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResultado.setDisabledTextColor(new Color(51, 51, 51));
		txtResultado.setEditable(false);
		txtResultado.setEnabled(false);
		txtResultado.setFont(new Font("Dialog", Font.BOLD, 12));
		txtResultado.setBounds(129, 206, 205, 19);
		frmPrincipalWindow.getContentPane().add(txtResultado);
		txtResultado.setColumns(10);
		
		btnSuma.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae){
			 // Aquí tú código
			 int operando1 = Integer.parseInt(txtOperando1.getText());
			 int operando2 = Integer.parseInt(txtOperando2.getText());
			 int resultado = operando1 + operando2;
			 txtResultado.setText(String.valueOf(resultado));
			 }
		});	 
		
		btnResta.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae){
			 // Aquí tú código
			 int operando1 = Integer.parseInt(txtOperando1.getText());
			 int operando2 = Integer.parseInt(txtOperando2.getText());
			 int resultado = operando1 - operando2;
			 txtResultado.setText(String.valueOf(resultado));
			 }
		});
		
		btnMultiplicar.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae){
			 // Aquí tú código
			 int operando1 = Integer.parseInt(txtOperando1.getText());
			 int operando2 = Integer.parseInt(txtOperando2.getText());
			 int resultado = operando1 * operando2;
			 txtResultado.setText(String.valueOf(resultado));
			 }
		});
		
		btnDividir.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent ae){
			 // Aquí tú código
			 int operando1 = Integer.parseInt(txtOperando1.getText());
			 int operando2 = Integer.parseInt(txtOperando2.getText());
			 
			 	if (operando2 == 0) {
			 		txtResultado.setText("No se puede dividir por 0");
			 	} else {
			 		int resultado = operando1 / operando2;
			 		txtResultado.setText(String.valueOf(resultado));
			 	}
			 }
		});	 
	}
}
