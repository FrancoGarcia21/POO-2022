
public class Materia {
	private String nombre;

	private String codigo;

	public Materia(String nombre, String i) {
		this.nombre = nombre;
		this.codigo = i;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCodigo(String string) {
		this.codigo = string;
	}

}
