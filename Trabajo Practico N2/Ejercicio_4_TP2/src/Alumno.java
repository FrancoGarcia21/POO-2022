
public class Alumno {
	private String nombre;
	private String apellido;
	private int dni;
	

	public Alumno(String nombre, String apellido) {
	this.nombre = nombre;
	this.apellido = apellido;
	}

	public Alumno() {
	}

	public String getNombreYApellido() {
		return (nombre + " " +apellido);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	

}
