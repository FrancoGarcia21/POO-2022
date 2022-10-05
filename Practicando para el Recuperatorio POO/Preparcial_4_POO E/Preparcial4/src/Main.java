import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random ran = new Random();
		ArrayList<Viaje> viajesSube = new ArrayList<Viaje>();
		ArrayList<Viaje> totalViajes = new ArrayList<Viaje>();
		Integer cantViajes;
		Sube tarjeta = new Sube(0.0, 41956718, "mutan2504", viajesSube);
		tarjeta.acreditarSaldo(ran.nextDouble(100.0)+100.0);
		
		System.out.println("El saldo actual es: " + tarjeta.consultarSaldo());
		System.out.println("Desde la ultima recarga se realizaron " + tarjeta.getViajes().size() + " viaje/s");
		cantViajes = tarjeta.getViajes().size();
		System.out.println("La tarjeta sube pertenece a " + tarjeta.getDni());
		System.out.println("-----------------------------------------------------");
		
		Integer viajesSubte = ran.nextInt(31);
		Integer viajesCole = ran.nextInt(31);
		Integer viajesTren = ran.nextInt(31);
		
		for(int i=0; i<viajesSubte; i++) {
			Viaje s = new Subte(null, null, ran.nextInt(4)+1, ran.nextInt(4)+1);
			s.setValor(s.calcularPrecio());
			totalViajes.add(s);
		}
		for(int i=0; i<viajesCole; i++) {
			Viaje c = new Colectivo(null, null, ran.nextInt(40));
			c.setValor(c.calcularPrecio());
			totalViajes.add(c);
		}
		for(int i=0; i<viajesTren; i++) {
			Viaje t = new Tren(null, null, ran.nextInt(6)+1);
			t.setValor(t.calcularPrecio());
			totalViajes.add(t);
		}
		Collections.shuffle(totalViajes);
		Double valorTotal = 0.0;
		for(Viaje viaje : totalViajes) {
			if(tarjeta.pagarViaje(viaje)) {
				tarjeta.acreditarSaldo(tarjeta.consultarSaldo()-(viaje.getValor()-(viaje.getValor()*viaje.getDescuento())));
				System.out.println("Viaje numero " + viajesSube.size() + ", se le realizo " + viaje.getDescuento() + "% de descuento");
				valorTotal = valorTotal + viaje.getValor()-(viaje.getValor()*viaje.getDescuento());
			}
			else {
				System.out.println("A la tarjeta no le alcanzo el saldo, debe recargar.");
				Double recarga = ran.nextDouble(100.0)+100.0;
				System.out.println("Usted a hecho una recarga de " + recarga);
				tarjeta.acreditarSaldo(tarjeta.getSaldo()+recarga);// se puede usar el set no mas mucho textoo
				System.out.println("Su saldo actual es " + tarjeta.consultarSaldo());
				cantViajes = tarjeta.getViajes().size() - cantViajes - 1;
				System.out.println("Desde la ultima recarga se realizaron " + cantViajes + " viaje/s.");
				System.out.println("Ya puede pagar este viaje.");
				tarjeta.acreditarSaldo(tarjeta.consultarSaldo()-(viaje.getValor()-(viaje.getValor()*viaje.getDescuento())));
				System.out.println("Viaje numero " + viajesSube.size() + ", se le realizo " + viaje.getDescuento() + "% de descuento");
				valorTotal = valorTotal + viaje.getValor()-(viaje.getValor()*viaje.getDescuento());
			}
		}
		System.out.println("La cantidad de viajes que se realizaron es: " + tarjeta.getViajes().size());
		System.out.println("El valor total de los viajes es " + valorTotal);
	}
}
