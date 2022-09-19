import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main extends Exception {

	public static void main(String[] args) {
		
		Paladin pala1 = new Paladin(400,200);
		Barbaro barb1 = new Barbaro(500,300);
		
		Random rnd = new Random();
		
		
		System.out.println("La pelea comienza");
	    for (Integer i=1; i<4; i++) {
		System.out.println("ROUND "+ i);
		if (rnd.nextBoolean()){
			System.out.println("Inicia el combate el Paladin");
			barb1.defender(pala1.atacar());
			
		}
		else { 
				System.out.println("Inicia el combate el Barbaro");
				pala1.defender(barb1.atacar());	
		}
	    System.out.println("En el turno " + i + " la vida de los jugadores quedaron");
	    System.out.println("la vida del paladin es " + pala1.getVida());
	    System.out.println("la vida del barbaro es " + barb1.getVida());
	}
	}
}









































//		Paladin pala3 = new Paladin(80,60);
//		Barbaro barb1 = new Barbaro(70,10);
//		Barbaro barb2 = new Barbaro(70,10);
//		Barbaro barb3 = new Barbaro(70,10);
//		
//		
//		ArrayList<Personaje> luchadores = new ArrayList<>();
//		
//		luchadores.add(pala1);
//		luchadores.add(pala2);
//		luchadores.add(pala3);
//		luchadores.add(barb1);
//		luchadores.add(barb2);
//		luchadores.add(barb3);
//		
//		System.out.println(" La cantidad de luchadores que hay en el torneo son " + luchadores.size());
//
//		Integer jugador1;
//		Integer jugador2;
//		
//		for (Integer i=0; i < luchadores.size()-1; i=i+2) {
//			Random rnd = new Random();
//			jugador1 = i;
//			jugador2 = i+1;
//				for (Integer j=0; j < 3;++j) {
//					if(rnd.nextBoolean()) {
//
//						System.out.println("Ataca jugador 1");
//					luchadores.get(jugador2).defender(luchadores.get(jugador1).atacar());
//					//System.out.println("La vida del luchador 1 es de "+luchadores.get(i).getVida());
//					System.out.println("La vida del jugador 2 es de "+luchadores.get(i+1).getVida());
//					if(luchadores.get(jugador2).getVida()<=0) {
//						luchadores.get(jugador2).setVida(0);
//						System.out.println("jugador2: AYYYYY ME MORIII ");
//						j=3;	
//					}
//			
//				
//			
//			}
//			else {
//			System.out.println("Ataca jugador 2");
//				luchadores.get(jugador1).defender(luchadores.get(jugador2).atacar());
//				//System.out.println("La vida del luchador 2 es de "+luchadores.get(i).getVida());
//				System.out.println("La vida del jugador 1 es de "+luchadores.get(i+1).getVida());
//				
//					try { if(luchadores.get(jugador1).getVida()<=0){
//						luchadores.get(jugador1).setVida(0);
//
//						System.out.println("jugador1: AYYYYY ME MORIII... ");
//						
//					}
//					} catch (Exception e) {
//					}
//			}
//				}
//		}	
//	}
//			
//	}
//	
//	
//	
