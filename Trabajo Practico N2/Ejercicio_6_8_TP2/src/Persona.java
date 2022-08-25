import java.time.LocalDate;
import java.time.Period;

public class Persona {
private String nombre;
private String apellido;
private LocalDate fechaNacimiento;

public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNacimiento = fechaNacimiento;
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
public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
@Override
public String toString() {
	return "Nombre:" + this.nombre + "\nApellido" + this.apellido + "\nFecha Nacimiento:" + this.fechaNacimiento;
}
public Integer getEdad () {
	LocalDate fechaActual = LocalDate.now();
	Period periodo = fechaActual.until(this.fechaNacimiento);
	return periodo.getYears();
			}


}
