import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
		
		for (Integer i=0; i<16; i++) {//aca genero los participantes
			
			/*
			 * Se entiende que participan es un participante
			 * pero no hay ninguna razón para no usar la palabra completa
			 * tenemos que buscar siempre nombres de variables claros
			 * */
			Participante participan = new Participante(i,"NombreParticipante"+i);
			listaParticipantes.add(participan);			
		}
      
		/* Comenta este shuffle para ver resultados mas claros
		 * solo cuando sin desordenar veas que el resultado es el esperado
		 * comenzas a desordenarlos para obtener el resultado final
		 * yo creo que haber impleentado el desordenamiento no te permitió ver
		 * que el resultado final tenia errores
		 *  
		 *  */
		Collections.shuffle(listaParticipantes);// en este punto mezclo la lista de los participantes acordate bien de esto
      //Liga compeLiga = new Liga("Copa Libertadores", listaParticipantes);
      //compeLiga.armarFixture();
//      
      //Grupos grupos = new Grupos("Champion Leageu",listaParticipantes);
      //grupos.armarFixture();

       Eliminacion eliminacion = new Eliminacion ("Judo competicion", listaParticipantes);
       eliminacion.armarFixture();
      
	}
	}

