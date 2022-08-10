import java.util.Random;
import java.util.Scanner;
import java.security.SecureRandom;

public class solucion_ejercicio_10 {

	public static void main(String[] args) {
    
	Scanner in = new Scanner(System.in);
	int opcion;
	do {
		System.out.println("Ingrese 1 o 2 segun el numero que desea apostar");
		opcion = in.nextInt();
	} while (opcion <1 || opcion>2);
	System.out.println("El numero mas alto es el ganador");
	System.out.println("Le jugaste al numero "+opcion);
	Random ran = new Random();
	int num1;
	int num2;
	do {
		num1 = ran.nextInt(101);
		num2 = ran.nextInt(101);
	}
	while (num1 == num2);
	System.out.println("El numero 1 es:"+ num1);
	System.out.println("El numero 2 es: "+num2);
	int mayor;
	if (num1 > num2) {
		mayor = 1;
	}else {
		mayor = 2;
	}
	{if (opcion == mayor) {
		System.out.println("Usted se gano el viaje al Mundial");
	}else {
		System.out.println("Has perdido la escritura de tu casa");
	}
	}
	}
}
	
