import java.util.ArrayList;

public class Profesor {
	private String nombre;
	private String apellido;
	private ArrayList<Materia> materia;

	public Profesor(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.materia = new ArrayList<Materia>();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido = apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
		
	}

	public ArrayList<Materia> getMateria() {
		return materia;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materia = materias;
	}

	public void anadirMateria(Materia materia) {
		this.materia.add(materia);
	}

}
