import java.util.ArrayList;
 
public class Liga extends Competicion{

	public Liga(String nombreCompeticion, ArrayList<Participante> participantes) {
		super(nombreCompeticion, participantes); // bien!
	}

	@Override
	public void armarFixture() {
		System.out.println("Fecha 1");
		/*
		 * Esto esta mal. El primer partido va a ser
		 * 0 vs 1
		 * el segundo
		 * 1 vs 2
		 * el tercero
		 * 2 vs 3
		 * 
		 * Proba la ejecución quitando del main el shuffle para que sea mas claro el orden y vas a darte cuenta enseguida del error en consola
		 * */
		for(Integer i=0 ; i< this.participantes.size()-1; i++) {
			System.out.println("Partido " + i + ":");
			System.out.println(this.participantes.get(i).getNombreParticipante()+" VS "+this.participantes.get(i+1).getNombreParticipante());
		}
		/* Para entregas, por favor nada de codigo comentado. Confunde y quien lo lee no sabe
		 * las razones de que esté comentado
		 *  */
//		for(Participante nombre : participantes) {
//			System.out.println();
			
			
		}
		
}

