package ej2Parcial2022;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Familia> listaFamilias = new ArrayList<Familia>();
		ArrayList<String> nombres = new ArrayList<String>();
		ArrayList<String> apellidos = new ArrayList<String>();

		Random ran = new Random();
		String apellido;
		Integer integrantes;
		
		for(int i=0; i<20; i++) {
			nombres.add("Nombre " + i);
			apellidos.add("Apellido " + i);
		}
		
		for(int i=0; i<3; i++) {
			ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
			apellido = apellidos.remove(ran.nextInt(20));
			integrantes = ran.nextInt(7) + 1;
			for (int j=0; j<integrantes; j++) {
				Persona p1 = new Persona(nombres.get(ran.nextInt(20)), ran.nextInt(100));
				listaPersonas.add(p1);
			}
			Familia f1 = new Familia (listaPersonas, apellido);
			listaFamilias.add(f1);
		}
		for (Familia unaFamilia : listaFamilias) {
			unaFamilia.imprimirFamilia();
		}
	}

}
