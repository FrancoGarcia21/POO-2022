package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MenuPrincipalVista extends JFrame {

	private JPanel contentPane;
	private JButton btnJuegoNuevo;
	private JButton btnSalir;
	private JButton btnOpciones;

	public MenuPrincipalVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Juego de Prueba");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(280, 50, 141, 73);
		contentPane.add(lblNewLabel);
		
		btnJuegoNuevo = new JButton("Nuevo");
		btnJuegoNuevo.setBounds(290, 133, 109, 21);
		contentPane.add(btnJuegoNuevo);
		
		btnOpciones = new JButton("Opciones");
		btnOpciones.setBounds(290, 164, 109, 21);
		contentPane.add(btnOpciones);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(290, 195, 109, 21);
		contentPane.add(btnSalir);
	}

	public JButton getBtnJuegoNuevo() {
		return btnJuegoNuevo;
	}

	public void setBtnJuegoNuevo(JButton btnJuegoNuevo) {
		this.btnJuegoNuevo = btnJuegoNuevo;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JButton getBtnOpciones() {
		return btnOpciones;
	}

	public void setBtnOpciones(JButton btnOpciones) {
		this.btnOpciones = btnOpciones;
	}
	
}
