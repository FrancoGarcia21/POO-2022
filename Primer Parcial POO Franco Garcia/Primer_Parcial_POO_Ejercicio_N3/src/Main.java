import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	System.out.println("MercadoManolo");
	
	ArrayList<Electrodomestico> cocinas = CreacionDatos.generarCocinas(10);
	ArrayList<Electrodomestico> heladeras = CreacionDatos.generarHeladeras(10);
	ArrayList<Electrodomestico> lavarropas = CreacionDatos.generarHeladeras(10);
	ArrayList<Electrodomestico> electrodomesticos = CreacionDatos.unificarListas( heladeras, cocinas, lavarropas);
	
	
	CreacionDatos.imprimirElectrodomestico("Heladera", heladeras);
	CreacionDatos.imprimirElectrodomestico("Cocinas", cocinas);
	CreacionDatos.imprimirElectrodomestico("Lavarropas", lavarropas);
	CreacionDatos.imprimirElectrodomestico("General electrodomesticos", electrodomesticos);
	}

}
