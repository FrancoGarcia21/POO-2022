import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String genero;
	private String email;
	private String contrasena;
	private LocalDate fechaNacimiento;

	public Persona(String nombre, String genero, String email, String contrasena, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.email = email;
		this.contrasena = contrasena;
		this.fechaNacimiento = fechaNacimiento;
	}















	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContrasena() {
		return contrasena;
	}








	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}








	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}








	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}








	@Override
	public String toString() {
		return "Persona  el nombre es: " + nombre + ", el genero es:" + genero + ", el correo de email es: " + email + ", su contrasena es: " + contrasena
				+ ", su fecha de naciemiento es: " + fechaNacimiento + "]";
	}


	
	

}
