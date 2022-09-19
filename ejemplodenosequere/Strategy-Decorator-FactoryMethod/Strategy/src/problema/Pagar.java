package problema;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pagar {
	String metodo;
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	public Pagar(String metodo) {
		this.metodo = metodo;
	}
	
	void pagar(Double monto) throws IOException {
		if(metodo.equals("MercadoPago")) {
			System.out.println("Ingrese Email: ");
			String email = READER.readLine();
			System.out.println("Ingrese Contraseña: ");
			String contrasenia = READER.readLine();
			//evaluar datos...
			
		}
		if(metodo.equals("Debito")) {
			 System.out.print("Ingrese numero de tarjeta: ");
	            String numero = READER.readLine();
	            System.out.print("Ingrese vencimiento 'mm/yy': ");
	            String vencimiento = READER.readLine();
	            System.out.print("Ingrese CVV : ");
	            String cvv = READER.readLine();
	            // crear tarjeta, validar datos etc...
		}
		System.out.println("Se realiza el pago de "+monto+ " con "+metodo);
	}

}
