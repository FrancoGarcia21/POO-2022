import java.util.Scanner;

public class solucion_ejercicio_7 {

	public static void main(String[] args) {
	 
		Scanner in = new Scanner(System.in);
	    System.out.println("Ingrese una frase de los simpson");
		String frase1 = in.nextLine();
		System.out.println("Ingrese otra frase de los simpson");
		String frase2 = in.nextLine();
		String resul = frase1 + " " + frase2;
		System.out.println("La frase que quedo es " + resul );

	}

}