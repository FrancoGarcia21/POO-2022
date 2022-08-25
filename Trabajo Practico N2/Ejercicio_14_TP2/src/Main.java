
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Botones");/*estoy creando la ventana vacia */
		JPanel panel = new JPanel(); /*estoy creando la variable panel, que seria lo que se ve pero vacio*/
		JButton boton1= new JButton("Boton1");/*aca estoy creando el boton 1*/
		boton1.addActionListener(e -> { /*aca le doy un accion al boton */
		JOptionPane.showMessageDialog(frame, "Presionaste el botón 1");
		});
		panel.add(boton1);/*estoy agregando un boton al panel*/
		JButton boton2= new JButton("Boton2");/*aca estoy creando el boton 2*/
		panel.add(boton2);
		boton2.addActionListener(e -> {
		JOptionPane.showMessageDialog(frame, "Repito. Presionaste el botón 2");
		});
		boton2.addActionListener(e -> {
		JOptionPane.showMessageDialog(frame, "Presionaste el botón 2");
		});
		frame.add(panel);
		frame.setSize(600,200);
		frame.setVisible(true);// puede ser visible e invisible

	}

}
