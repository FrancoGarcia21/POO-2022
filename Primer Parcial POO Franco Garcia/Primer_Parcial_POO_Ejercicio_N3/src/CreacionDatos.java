import java.util.ArrayList;
import java.util.Random;

public class CreacionDatos {

	public static ArrayList<Electrodomestico> unificarListas(ArrayList<Electrodomestico> heladeras, ArrayList<Electrodomestico> cocinas, ArrayList<Electrodomestico> lavarropas){
		// unificamos las tres listas en una sola de electrodomesticos
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		electrodomesticos.addAll(heladeras);
		electrodomesticos.addAll(cocinas);
		electrodomesticos.addAll(lavarropas);
		return electrodomesticos;
		}

		public static ArrayList<Electrodomestico> generarHeladeras (Integer cantidad){
			ArrayList <Electrodomestico> heladeras = new ArrayList<Electrodomestico>();
			for(int i=1; i<= cantidad; i++) {
				heladeras.add( new Heladera(
						"Heladera" + i , 
						new Random().nextInt(1000),
						"marca " +i,
						"color"+i,
						300,
						200
						));
			}
			return heladeras;
		}
		
		
		public static ArrayList<Electrodomestico> generarCocinas (Integer cantidad){
			ArrayList <Electrodomestico> cocinas = new ArrayList<Electrodomestico>();
			for(int i=1; i<= cantidad; i++) {
				cocinas.add(new Cocina(
						"Cocina"+i,
						new Random().nextInt(1500),//esto es el precio
						"marca"+i,
						"color"+i,
						new Random().nextBoolean()
						));
			}
			return cocinas;
			
		}
			
		public static ArrayList<Electrodomestico> generarLavarropas (Integer cantidad){
			ArrayList<Electrodomestico> lavarropas = new ArrayList<Electrodomestico>();
			for(int i=1; i<= cantidad; i++) {
				lavarropas.add(new Lavarropa(
						"Lavarropa" + i,
						new Random().nextInt(30000),
						"marca"+i,
						"color"+i,
						 new Random().nextBoolean(),
						340
						));
				
			}
			return lavarropas;
		
		}
		
		public static void imprimirElectrodomestico(String modelo, ArrayList<Electrodomestico> electrodomesticos) {
			System.out.println("Las mejores"+ modelo);
			for(int i=0; i<3 ; i++) {
				System.out.println("El modelo es "+electrodomesticos.get(i).getModelo() + " " +"la marca es " +electrodomesticos.get(i).getMarca() + " el precio es "+ electrodomesticos.get(i).getPrecio() +" el color del producto es "+ electrodomesticos.get(i).getColor());
			}
		}
}
