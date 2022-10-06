
public abstract class Persona {
	
	protected String nombre;
	protected String apellido;
	protected Integer DNI;
	
	
	public Persona(String nombre, String apellido, Integer dNI) {
		super();
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setDNI(dNI);
	}

	

	@Override
	public String toString() {
		return "Persona - El nombre es: " + nombre + " su apellido es: " + apellido + " su DNI es: " + DNI;
	}




	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getDNI() {
		return DNI;
	}


	public void setDNI(Integer dNI) {
		DNI = dNI;
	}
	
	
	
	

}
