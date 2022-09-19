package ej2Parcial2022;

import java.util.ArrayList;

public class Familia {
	
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	private String apellido;
	
	public Familia(ArrayList<Persona> personas, String apellido) {
		super();
		this.personas = personas;
		this.apellido = apellido;
	}

	public Integer promedioEdades() {
		Integer promedio;
		Integer totalEdades = 0, cantIntegrantes = 0;
		for(Persona unFamiliar : personas) {
			totalEdades = totalEdades + unFamiliar.getEdad();
			cantIntegrantes = cantIntegrantes + 1;
		}
		return promedio = (totalEdades/cantIntegrantes);
	}
	
	public void imprimirFamilia() {
		System.out.println("Familia " + apellido);
		System.out.println("Promedio de edades: " + promedioEdades());
		System.out.println("Integrantes:");
		for (Persona unFamiliar : personas) {
			System.out.println("- " + unFamiliar.toString());
		}
	}
	
	
}
