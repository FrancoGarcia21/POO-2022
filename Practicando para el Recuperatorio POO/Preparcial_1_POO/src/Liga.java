import java.util.ArrayList;
 
public class Liga extends Competicion{

	public Liga(String nombreCompeticion, ArrayList<Participante> participantes) {
		super(nombreCompeticion, participantes);
	}

	@Override
	public void armarFixture() {
		System.out.println("Fecha 1");
		for(Integer i=0 ; i< this.participantes.size()-1; i++) {
			System.out.println("Partido " + i + ":");
			System.out.println(this.participantes.get(i).getNombreParticipante()+" VS "+this.participantes.get(i+1).getNombreParticipante());
		}
		
//		for(Participante nombre : participantes) {
//			System.out.println();
			
			
		}
		
}

