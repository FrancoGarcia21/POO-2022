import java.time.LocalDate;
import java.util.Random;

public class Main {

	public static void main(String[] args){
		
		Banco banco = new Banco("El chubut");
		Random rnd = new Random();
		for (int i = 0; i < 3; i++) {
			Persona per = new Persona ("Persona"+i, "F", "fffgmail.com", "1234", LocalDate.of(rnd.nextInt(1970)+1970, rnd.nextInt(12)+1, rnd.nextInt(31)));
			banco.agregarCuenta(per,rnd.nextDouble()*1000); 
				
		}
		banco.listarClientes();
	}
	
}
