import java.util.ArrayList;

public class Grupos extends Competicion {

	public Grupos(String nombreCompeticion, ArrayList<Participante> participantes) {
		super(nombreCompeticion, participantes); // bien!
		// TODO Auto-generated constructor stub
	}

	@Override
	public void armarFixture() {
		Integer contador=0;
		for (Integer i = 1; i <= 4; i++) {
			System.out.println("GRUPO " + i +": ");
			for (Integer j = 0; j<4; j++) {
				System.out.println(participantes.get(contador));
				contador ++;
			}
			
		}

	}		
	}