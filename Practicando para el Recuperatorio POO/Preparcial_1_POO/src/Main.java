import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Participante> listaParticipantes = new ArrayList<Participante>();
		
		for (Integer i=0; i<16; i++) {//aca genero los participantes 
			Participante participan = new Participante(i,"NombreParticipante"+i);
			listaParticipantes.add(participan);			
		}
      Collections.shuffle(listaParticipantes);// en este punto mezclo la lista de los participantes acordate bien de esto
//      Liga compeLiga = new Liga("Copa Libertadores", listaParticipantes);
//      compeLiga.armarFixture();
//      
//      Grupos grupos = new Grupos("Champion Leageu",listaParticipantes);
//      grupos.armarFixture();

       Eliminacion eliminacion = new Eliminacion ("Judo competicion", listaParticipantes);
       eliminacion.armarFixture();
      
	}
	}

