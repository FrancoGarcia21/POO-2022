import java.util.Scanner;

public class solucion_ejercicio_5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Escriba el primer numero:");
		Integer numero1 = in.nextInt();
		System.out.println("Escriba un segundo numero porfavor");
		Integer numero2 = in.nextInt();
		Integer resultado = numero1 + numero2;
		System.out.println("La suma de los dos numeros ingresados es:"+ resultado);
		
		
	}
}
