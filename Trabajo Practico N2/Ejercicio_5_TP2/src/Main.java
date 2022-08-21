import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Materia poo= new Materia("POO", "IF153");
		Materia algebra= new Materia("Algebra", "183");
		Materia introduccion= new Materia("Introducción a la computación" ,"-");
		introduccion.setCodigo("IF300");
		
		Materia algoritmica= new Materia("Algoritmica", "500");
		
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		
		Profesor profesor1 = new Profesor("Pedro", "Hernandez");
		
		profesor1.anadirMateria(poo);
		profesor1.anadirMateria(algebra);
		profesores.add(profesor1);
		
		Profesor profesor2 = new Profesor("Romina", "Alvarez");
		
		profesor2.anadirMateria(introduccion);
		profesor2.anadirMateria(algoritmica);
		profesores.add(profesor2);
		
		Profesor profesor3 = new Profesor("Laura", "Perez");
		
		profesores.add(profesor3);

		for (int i=0;i<profesores.size();i++) {
			System.out.println("Profesor: " + profesores.get(i).getNombre() + " " +
					profesores.get(i).getApellido());
			System.out.println("Materias: ");
            
		for (int j=0; j<profesores.get(i).getMateria().size(); j++) {
				System.out.println(profesores.get(i).getMateria().get(j).getNombre());
			}
		}
	}
}
