import java.util.ArrayList;
import java.util.Iterator;

public class Materia {
	private String nombre;
	private String codigo;
	private Integer anio;
	private String profesor;
	private ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

	
	
	public Materia(String nombre, String codigo, Integer anio, String profesor, ArrayList<Alumno> listaAlumnos) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.anio = anio;
		this.profesor = profesor;
		this.listaAlumnos = listaAlumnos;
	}



	
	@Override
	public String toString() {
		return "El nombre de la materia es: " + nombre + " El codigo de la materia es: " + codigo + " El anio de dictado es: " + anio + "-El profesor que dicta la materia es: " + profesor
				+ "Los alumnos que cursan la materia son: " + listaAlumnos;
	}

	
public Boolean inscribirAlumno (Alumno alumno) {
	if(!this.getListaAlumnos().contains(alumno)) {
		this.getListaAlumnos().add(alumno);//aca agrego al alumno en la lista
		System.out.println("El alumno fue inscripto con exito");
		return true;
	}
	System.out.println("El alumno no pudo inscribirse a la materia");
	return false;
}



public void listadoAlumnos() {
	Iterator<Alumno> alumnos = this.getListaAlumnos().iterator();
	while (alumnos.hasNext()) {
		Alumno alum = ((Iterator<Alumno>) listaAlumnos).next();// no se si use bien el iterador fijate bien sino cambialo
		System.out.println("Nombre alumno: " + alum.getNombre() + "Apellido: " + alum.getApellido() + "DNI: "+ alum.getDNI());
	}
}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public Integer getAnio() {
		return anio;
	}


	public void setAnio(Integer anio) {
		this.anio = anio;
	}


	public String getProfesor() {
		return profesor;
	}


	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}


	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}


	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	
	

}
