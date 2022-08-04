import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 0;
	    int numero2= 0;
				
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("ingrese un numero");
		numero1 = in.nextInt();
		
		System.out.println("Ingrese un segundo numero");
		numero2 = in.nextInt();
		
		Integer resultado = numero1+numero2;
		System.out.println("la suma del numero "+numero1+ "con el numero" +numero2+ "es el numero"+resultado+);
		
	}

}
