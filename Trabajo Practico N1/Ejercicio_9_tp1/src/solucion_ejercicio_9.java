import java.util.Scanner;

public class solucion_ejercicio_9 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println(" Ingrese una palabra");
		String palabra1 = in.nextLine();
		System.out.println(" Ingresa otra palabra ");
		String palabra2 = in.nextLine();
		Boolean igualdad = palabra1 == palabra2;
		System.out.println("Comparada con == "+igualdad);
		System.out.println("Comparado con .equals():"+ palabra1.equals(palabra2));
		
		
			
		}
	}



