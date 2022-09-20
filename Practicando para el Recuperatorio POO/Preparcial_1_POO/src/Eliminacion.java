import java.util.ArrayList;
import java.util.Random;

public class Eliminacion extends Competicion {

	public Eliminacion(String nombreCompeticion, ArrayList<Participante> participantes) {
		super(nombreCompeticion, participantes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void armarFixture() {
	 Random rnd = new Random();
	 String fases[]= {"Octavos de final", "Cuartos de final", "Semi final", "FINALIZIMA"};
	 
	 for(Integer j=0; j<4;j++) {
		 System.out.println(fases[j]);
		for (Integer i=0; i <participantes.size()-1; i++) {
			System.out.println(participantes.get(i)+" versus " + participantes.get(i+1));
			if (rnd.nextBoolean()) {
				participantes.remove(i);
			}else {
				participantes.remove(i+1);
			}i++;
		}
		
	   }
     }

}
