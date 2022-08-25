import java.util.ArrayList;
import java.util.Scanner;

public class Censo {
	private ArrayList<Familia> poblacion = new ArrayList<Familia>();

	public Censo() {               
	}

	 public void agregoFamilia(Familia familia) {
		poblacion.add(familia);
		System.out.println("La familia fue agregado con exito"); 
		System.out.println(poblacion.size());
	 }
	 


	public ArrayList<Familia> getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(ArrayList<Familia> poblacion) {
		this.poblacion = poblacion;
	}
 public void cantidadFamilias(){
	 System.out.println("La cantidad de familias censadas es " + poblacion.size());
 }
 public void censar() {
	 System.out.println("Cuantas familias quiere censar");
	 Scanner in = new Scanner(System.in);
	 int num = in.nextInt();
	 
	 while (num <3||num>5){
		 System.out.println("La cantidad de familia es correcto ingrese entre 3 y 5");
		 in = new Scanner(System.in);
		 num = in.nextInt();
	 }
	 System.out.println("Ingreso "+ num + " Familia");
	 
	 for (int i=0;i<num; i++) {
		 Boolean respuesta = true;
		 Boolean trabaja;
		 Boolean estudia;
		 
		 Familia family = new Familia();
		 
		 while (respuesta) {
			 System.out.println("Por favor ingrese la informacion correspondiente al censo");
			 System.out.println("Ingrese la edad del integrante");
			 in = new Scanner(System.in);
			 int edad = in.nextInt();
			 
			 System.out.println("Ingrese el sexo M si es masculino F si es femenino");
			 Character sexo = in.next().charAt(0); 
			 
			 System.out.println("Ingrese 'S' si el integrante trabaja si no el caso ingrese 'N' ");
			 Character rta = in.next().charAt(0);
				 while (rta != 'S' && rta !=  'N') {
				 System.out.println("Ingrese S o N dependiendo si trabaja o no");
			 }
				 if (rta == 'S') {
				 trabaja = true;
			 }else {
				 trabaja = false;
			 }
			 
			 
			 System.out.println("Ingrese 'S' si el integrante estudia si no el caso ingrese 'N' ");
			 Character respus = in.next().charAt(0);
			 while (rta != 'S' && rta !=  'N')  {
				 System.out.println("Ingrese 'S' o 'N' dependiendo si estudia o no");
			 }
			 if (respus=='S') {
				 estudia = true;
			 }else {
				 estudia = false;
			 }
			 
			
			Persona persona = new Persona(edad,sexo,trabaja,estudia);
		    family.agregoPariente(persona);
		    System.out.println("Quiere seguir ingresando integrantes de la familia ingrese 'S' si es asi y ingrese 'N' si no quiere ingresar mas ");
		   Character respu = in.next().charAt(0);
		    while (respu != 'S' && respu !=  'N') {
				 System.out.println("Ingrese 'S' o 'N' tarao");
			 }
			 if (respu=='S') {
				 respuesta = true;
			 }else {
				 respuesta = false;
			 }
			 
		 }
		 this.agregoFamilia(family);
		 
		 
	 }
	 
	
	 
	
	 
	 
 }
}
