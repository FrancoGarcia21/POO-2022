import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Paladin pala1 = new Paladin(50,80);
		Paladin pala2 = new Paladin(50,80);
		Paladin pala3 = new Paladin(50,80);
		
		Barbaro barb1 = new Barbaro(20,50);
		Barbaro barb2 = new Barbaro(20,50);
		Barbaro barb3 = new Barbaro(20,50);
		
		
		
		ArrayList<Personaje> luchadores = new ArrayList<>();
		
		luchadores.add(pala1);
		luchadores.add(pala2);
		luchadores.add(pala3);
		luchadores.add(barb1);
		luchadores.add(barb2);
		luchadores.add(barb3);
		
		
		Integer jugador1;
		Integer jugador2;
		
		for (Integer i=0; i < luchadores.size(); i++) {
			Random rnd = new Random();
			jugador1 = i;
			jugador2 = i++;
			if(rnd.nextBoolean()) {
				jugador1 = i++;
				jugador2 = i;
			}
			
			for (Integer j=0; j < 3;++j) {
				luchadores.get(jugador2).defender(luchadores.get(jugador1).atacar());
				System.out.println("LUCHADOR 1 "+luchadores.get(i).getVida());
				System.out.println("LUCHADOR 2 "+luchadores.get(i+1).getVida());
				if(luchadores.get(jugador2).getVida()<=0){
					luchadores.get(jugador2).setVida(0);
					System.out.println("jugador2: AYYYYY ME MORIII ");
					j=3;
					
					
				}
				luchadores.get(jugador1).defender(luchadores.get(jugador2).atacar());
				System.out.println("LUCHADOR 1 "+luchadores.get(i).getVida());
				System.out.println("LUCHADOR 2 "+luchadores.get(i+1).getVida());
				
				if(luchadores.get(jugador2).getVida()<=0){
					System.out.println("jugador1: AYYYYY ME MORIII ");
					j=3;
				}
				
			}
			
			i++;
		}
	
	
	}

}
