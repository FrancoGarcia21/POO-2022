import java.util.ArrayList;
 
public class Liga extends Competicion{

	public Liga(String nombreCompeticion, ArrayList<Participante> participantes) {
		super(nombreCompeticion, participantes);
	}

	@Override
	public void armarFixture() {
		// TODO Auto-generated method stub
		System.out.println("Fecha 1");
		
		
		for(Integer i=1 ; i< participantes.size(); i++) {
			System.out.println("Fecha 1");
			System.out.println(participantes.indexOf(i));
		}
		
//		for(Participante nombre : participantes) {
//			System.out.println();
			
			
		}
		
}

