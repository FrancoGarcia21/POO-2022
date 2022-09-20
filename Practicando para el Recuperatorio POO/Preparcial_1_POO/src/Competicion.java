import java.util.ArrayList;

public abstract class Competicion {

	private String nombreCompeticion;
	protected ArrayList<Participante> participantes = new ArrayList<Participante>();//especifico que tinee un atributo que es un arraylsit
	//que tiene participantes siempre el array especificalo en la clase padre NO TE OLVIDES
	// puse protected para que el array pueda heredarlo en las clases hijos
	
	public Competicion(String nombreCompeticion, ArrayList<Participante> participantes) {
		super();
		this.nombreCompeticion = nombreCompeticion;
		this.participantes = participantes;
	}

	public String getNombreCompeticion() {
		return nombreCompeticion;
	}
	public void setNombreCompeticion(String nombreCompeticion) {
		this.nombreCompeticion = nombreCompeticion;
	}
	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}
	
	public abstract void armarFixture();
}
