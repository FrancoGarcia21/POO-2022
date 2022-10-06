import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

	
	public static void main(String[] args) {
    ArrayList<Alumno> listaAlumnos0 = new ArrayList<Alumno>(); 
    ArrayList<Alumno> listaAlumnos1 = new ArrayList<Alumno>();
    ArrayList<Alumno> listaAlumnos2 = new ArrayList<Alumno>();
    ArrayList<Alumno> listaAlumnos3 = new ArrayList<Alumno>();
    ArrayList<Alumno> listaAlumnos4 = new ArrayList<Alumno>();
    ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>(); 
    
    
//    
//	Materia materia1 = new Materia ("POO","1234",1999,"Uberto",listaAlumnos0);
//	Materia materia2 = new Materia ("Algo","2134",2022,"BETO",listaAlumnos1);
//	Materia materia3 = new Materia ("Ingles","1344",2019,"Maxi",listaAlumnos2);
//	Materia materia4= new Materia ("matemicas","00234",2015,"ariel",listaAlumnos3);
//	Materia materia5 = new Materia ("base de datos","1234",2000,"raul",listaAlumnos4);
//	
	
	Profesor profesor1 = new Profesor ("Uberto" ,"Bonavide",3028493,123);
	Profesor profesor2 = new Profesor ("BETO" ,"videl",3028493,123);
	Profesor profesor3 = new Profesor ("Maxi" ,"Boes",3028493,123);
	Profesor profesor4 = new Profesor ("ariel" ,"Bone",3028493,123);
	Profesor profesor5 = new Profesor ("raul" ,"vide",3028493,123);
	
	Random rnd = new Random();
	for (int i = 0; i < 30; i++) {
		Alumno alum = new Alumno("Alumno"+i ,"Apellido"+i, rnd.nextInt(90000),null);
		listaAlumnos.add(alum);
	}
	}
}
//		for(int j=0; j<5;i++) {
//			alum.ingresarNota(mat, rnd.nextInt(7));
//			
//		}
//		//listaAlumnos.add(alum);
//	}
//   }

//Collections.shuffle(listaAlumnos);
//for(int j = 0; j <5; j++) {
//for(int i = 0; i <6; i++) {
//	 inscribirAlumno(alum+i);
//	 