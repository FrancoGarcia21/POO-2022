import java.util.ArrayList;

public abstract class Competicion {
	/* para mi, y aca es una opinion personal. Ale y Pablo a veces no concuerdan
	 * no deberia de ser private sino protected ya que sino no se heredan realmente
	 * eta bien, le das el getter y setter para que acceda la clase hija
	 * pero no tiene sentido que una clase no pueda acceder a su propio atributo sin un getter o setter
	 * De todas formas no esta mal, es debatible
	 * */
	private String nombreCompeticion;
	protected ArrayList<Participante> participantes = new ArrayList<Participante>();//especifico que tinee un atributo que es un arraylsit
	//que tiene participantes siempre el array especificalo en la clase padre NO TE OLVIDES
	// puse protected para que el array pueda heredarlo en las clases hijos
	
	public Competicion(String nombreCompeticion, ArrayList<Participante> participantes) {
		super(); // no tiene sentido llamar al super
		this.nombreCompeticion = nombreCompeticion;
		this.participantes = participantes;
	}

	
	/* Sé que estaba asi en el diseño de clases pero a partir de este año
	 * estamos insistiendo en que solo se generen setters y getters si finalmente se van a utilizar
	 * esto es para que se entienda que a no siempre vamos a querer ofrecer metodos para setear nuestros atributos
	 * podriamos querer atributos privados y exclusivos para la clase internamente
	 *  
	 *  */
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
