import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Paladin pala1 = new Paladin(50,80);
		Paladin pala2 = new Paladin(50,80);
		Paladin pala3 = new Paladin(50,80);
		
		Barbaro barb1 = new Barbaro(80,50);
		Barbaro barb2 = new Barbaro(80,50);
		Barbaro barb3 = new Barbaro(80,50);
		
		
		
		ArrayList<Personaje> luchadores = new ArrayList<>();
		
		luchadores.add(pala1);
		luchadores.add(pala2);
		luchadores.add(pala3);
		luchadores.add(barb1);
		luchadores.add(barb2);
		luchadores.add(barb3);
		
		for (int i =0; i<luchadores.size(); i++) {
			
			luchadores.get(i+1).defender(luchadores.get(i).atacar());
			System.out.println("lUCHADOR 1"+luchadores.get(i).getVida());
			System.out.println("lUCHADOR 2"+luchadores.get(i+1).getVida());
		}
	
	
	}

}
