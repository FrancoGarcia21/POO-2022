import java.util.ArrayList;

public class Liga extends Competicion{

	public Liga(String nombreCompeticion, ArrayList<Participante> participantes) {
		super(nombreCompeticion, participantes);
	}

	@Override
	public void armarFixture() {
		// TODO Auto-generated method stub
		System.out.println("Fecha 1");
		
		
		for(int i ; i< participantes.size(); i++) {
			System.out.println("Partido" + i, );
		}
		
//		for(Participante nombre : participantes) {
//			System.out.println();
			
			
		}
		
		
	}
	
	

	
	
	
	

}
