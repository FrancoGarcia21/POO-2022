package Controlador;

import Vista.MenuPrincipalVista;

public class MenuController {
	
	MenuPrincipalVista vista;
	
	public MenuController() {
		this.vista = new MenuPrincipalVista();
		this.vista.setTitle("Juego de Prueba");
		this.vista.setResizable(false);
		this.vista.setVisible(true);
		this.vista.setLocationRelativeTo(null);
		
		this.vista.getBtnSalir().addActionListener(e->{System.exit(0);});
		this.vista.getBtnOpciones().addActionListener(e->this.opciones());
		this.vista.getBtnJuegoNuevo().addActionListener(e->this.nuevoJuego());
	}
	
	protected void opciones() {
		this.vista.dispose();
		new OpcionesController();
	}
	
	protected void nuevoJuego() {
		this.vista.dispose();
		new JuegoController();
	}
	
}
