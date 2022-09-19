import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Debito implements PagoStrategy {
	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

	@Override
	public boolean pago(double monto) {
		System.out.println("Se realiza el pago de "+monto+ " con Tarjeta de debito");
		//validar montos... 
		return true;
	}

	@Override
	public void pedirDetallePago() {
		  try {
	            System.out.print("Ingrese numero de tarjeta: ");
	            String numero = READER.readLine();
	            System.out.print("Ingrese vencimiento 'mm/yy': ");
	            String vencimiento = READER.readLine();
	            System.out.print("Ingrese CVV : ");
	            String cvv = READER.readLine();
	            // crear tarjeta, validar datos etc...

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	}

}
