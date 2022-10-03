package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class OpcionesVista extends JFrame {

	private JPanel contentPane;
	private JButton btnAtrasOpciones;

	public OpcionesVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Opciones");
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aca pueden ir las configuraciones del juego");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(220, 216, 386, 129);
		contentPane.add(lblNewLabel);
		
		btnAtrasOpciones = new JButton("Atras");
		btnAtrasOpciones.setBounds(333, 355, 85, 21);
		contentPane.add(btnAtrasOpciones);
	}

	public JButton getBtnAtrasOpciones() {
		return btnAtrasOpciones;
	}

	public void setBtnAtrasOpciones(JButton btnAtrasOpciones) {
		this.btnAtrasOpciones = btnAtrasOpciones;
	}

}
