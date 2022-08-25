
public class Persona {
private Integer edad;
private Character genero;
private Boolean trabaja;
private Boolean estudia;

public Persona(Integer edad, Character genero, Boolean trabaja, Boolean estudia) {
	super();
	this.edad = edad;
	this.genero = genero;
	this.trabaja = trabaja;
	this.estudia = estudia;
}

public Integer getEdad() {
	return edad;
}

public void setEdad(Integer edad) {
	this.edad = edad;
}

public Character getGenero() {
	return genero;
}

public void setGenero(Character genero) {
	this.genero = genero;
}

public Boolean getTrabaja() {
	return trabaja;
}

public void setTrabaja(Boolean trabaja) {
	this.trabaja = trabaja;
}

public Boolean getEstudia() {
	return estudia;
}

public void setEstudia(Boolean estudia) {
	this.estudia = estudia;
}




}
