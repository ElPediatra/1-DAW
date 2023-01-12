import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Departamentos {

	private JFrame frmPrincipalWindow;
	private JTextField txtCodDep;
	private JTextField txtNombDep;
	private JTextField txtLocDep;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Departamentos window = new Departamentos();
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
	public Departamentos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrincipalWindow = new JFrame();
		frmPrincipalWindow.setTitle("PRUEBA DE VENTANAS");
		frmPrincipalWindow.setBounds(100, 100, 450, 300);
		frmPrincipalWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrincipalWindow.getContentPane().setLayout(null);
		
		JLabel lblDatDep = new JLabel("DATOS DE DEPARTAMENTOS");
		lblDatDep.setFont(new Font("Dialog", Font.PLAIN, 10));
		lblDatDep.setBounds(137, 12, 193, 15);
		frmPrincipalWindow.getContentPane().add(lblDatDep);
		
		JPanel panelTexto = new JPanel();
		panelTexto.setBackground(Color.YELLOW);
		panelTexto.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panelTexto.setBounds(67, 44, 321, 135);
		frmPrincipalWindow.getContentPane().add(panelTexto);
		panelTexto.setLayout(null);
		
		JLabel lblCodDep = new JLabel("Código Departamento");
		lblCodDep.setBounds(12, 31, 138, 15);
		lblCodDep.setFont(new Font("Dialog", Font.PLAIN, 9));
		panelTexto.add(lblCodDep);
		
		JLabel lblNombDep = new JLabel("Nombre Departamento");
		lblNombDep.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblNombDep.setBounds(12, 58, 138, 15);
		panelTexto.add(lblNombDep);
		
		JLabel lblLocDep = new JLabel("Localidad Departamento");
		lblLocDep.setFont(new Font("Dialog", Font.PLAIN, 9));
		lblLocDep.setBounds(12, 89, 138, 15);
		panelTexto.add(lblLocDep);
		
		txtCodDep = new JTextField();
		txtCodDep.setBounds(150, 31, 70, 19);
		panelTexto.add(txtCodDep);
		txtCodDep.setColumns(10);
		
		txtNombDep = new JTextField();
		txtNombDep.setBounds(150, 58, 160, 19);
		panelTexto.add(txtNombDep);
		txtNombDep.setColumns(10);
		
		txtLocDep = new JTextField();
		txtLocDep.setBounds(150, 89, 160, 19);
		panelTexto.add(txtLocDep);
		txtLocDep.setColumns(10);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), null));
		panelBotones.setBounds(1, 180, 450, 40);
		frmPrincipalWindow.getContentPane().add(panelBotones);
		panelBotones.setLayout(null);
		
		JButton btnInsertar = new JButton("Insertar Datos");
		btnInsertar.setFont(new Font("Dialog", Font.PLAIN, 8));
		btnInsertar.setBounds(100, 7, 100, 20);
		panelBotones.add(btnInsertar);
		
		JButton btnLimpiar = new JButton("Limpiar Datos");
		btnLimpiar.setBounds(250, 7, 90, 20);
		panelBotones.add(btnLimpiar);
		btnLimpiar.setFont(new Font("Dialog", Font.PLAIN, 8));
	}
}
