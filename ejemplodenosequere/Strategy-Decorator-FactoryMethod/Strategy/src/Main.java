import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	try {	 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Random ran = new Random();
		Double monto = ran.nextInt(5000)+ran.nextDouble();
		System.out.println("Debe pagar "+monto);
		System.out.println("Seleccione forma de pago:\n 1- MercadoPago \n 2-Debito \n");
		String metodoPago;
		
			metodoPago = reader.readLine();
		
		PagoStrategy formaPago = metodoPago.equals("1")? new MercadoPago(): new Debito();
		
		formaPago.pedirDetallePago();
		formaPago.pago(monto);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	}

}
