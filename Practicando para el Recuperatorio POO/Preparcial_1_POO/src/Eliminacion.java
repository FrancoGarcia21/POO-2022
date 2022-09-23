import java.util.ArrayList;
import java.util.Random;

public class Eliminacion extends Competicion {

	public Eliminacion(String nombreCompeticion, ArrayList<Participante> participantes) {
		super(nombreCompeticion, participantes);
		// TODO Auto-generated constructor stub
	}

	@Override
	/*este esta mal, probá la ejecución sacando el shuffle del main para que sea mas claro
	 * los octavos te quedan asi
	 * 
	 
	 Octavos de final
Paticipante N°0 NombreParticipante0 versus Paticipante N°1 NombreParticipante1

fijate que acá pasa directo al 3, falta el participante 2
Paticipante N°3 NombreParticipante3 versus Paticipante N°4 NombreParticipante4
Paticipante N°5 NombreParticipante5 versus Paticipante N°6 NombreParticipante6
fijate que acá pasa directo al 8, falta el participante 7
Paticipante N°8 NombreParticipante8 versus Paticipante N°9 NombreParticipante9
Paticipante N°10 NombreParticipante10 versus Paticipante N°11 NombreParticipante11
Paticipante N°12 NombreParticipante12 versus Paticipante N°13 NombreParticipante13
	 
	 * 
	 * */
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
