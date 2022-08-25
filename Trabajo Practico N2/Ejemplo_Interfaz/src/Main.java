import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<Pagable> aPagar = new ArrayList<>();

		Random rand = new Random();

		for(int i=0; i<20 ;i++) {
	
			if (rand.nextBoolean()) {

				aPagar.add(new Factura(rand.nextDouble(400.0), 20.0));
			}
			else { 
				aPagar.add(new Empleado(100,40));



			}
			}

			for(Pagable pagable : aPagar) {
				System.out.println("Pago?" + pagable.pagar()); 
			}
		}
	}


// para formatear el codigo es control  + i
