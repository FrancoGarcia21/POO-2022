import java.security.SecureRandom;
import java.util.Scanner;
public class solucion_ejercicio_8 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Ingrese un numero entero");
	Integer numero = in.nextInt();
	SecureRandom random = new SecureRandom();
	Integer aleatorio = random.nextInt(10);
	if (numero.equals(aleatorio)) 
	{
		System.out.println("El numero ingresado que fue " +numero+ " es igual al numero que se genero aleatoriamente " +aleatorio);
	} else 
	{
		System.out.println("El numero que ingreso " +numero+" no es igual al numero que se genero aleatoriamente que fue " +aleatorio);
	}
	if(numero>= aleatorio)
	{
	System.out.println("El numero que usted ingreso que fue "+numero+ " es mayor o igual que el numero que se genero que fue "+ aleatorio);
	}
//	switch (numero) {
//	case numero > aleatorio : System.out.println("El numero ingreso que fue "+numero+ " es mayor que el numero aleatorio generado "+aleatorio); break;
//	case numero >= aleatorio: System.out.println("El numero que ingreso fue " +numero+ " es menor o igual al numero que se genero aleatoriamente"+aleatorio); break;
//	}2
	
	}
}
