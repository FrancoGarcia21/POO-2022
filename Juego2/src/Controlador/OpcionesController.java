package Controlador;

import Vista.OpcionesVista;

public class OpcionesController {

	OpcionesVista vista;
	
	public OpcionesController() {
		this.vista = new OpcionesVista();
		this.vista.setLocationRelativeTo(null);
		this.vista.setVisible(true);
		this.vista.getBtnAtrasOpciones().addActionListener(e->this.atras());
	}
	
	public void atras() {
		this.vista.dispose();
		new MenuController();
	}
	
}
