import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MercadoPago implements PagoStrategy {

	private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
	private Boolean logueado = false;
	private Map<String, String> db = new HashMap<String, String>();

	public MercadoPago() {
		super();
		db.put("usuario1", "qwerty");
		db.put("usuario2", "123456");
	}

	@Override
	public boolean pago(double monto) {
		if(logueado) {
			System.out.println("Se realiza el pago de "+monto+ " con MercadoPago");
		}
		return logueado;
	}

	@Override
	public void pedirDetallePago() {
		try {
			System.out.println("Ingrese Email: ");
			String email = READER.readLine();
			System.out.println("Ingrese Contraseña: ");
			String contrasenia = READER.readLine();
			
			logueado = contrasenia.equals(db.get(email));
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
