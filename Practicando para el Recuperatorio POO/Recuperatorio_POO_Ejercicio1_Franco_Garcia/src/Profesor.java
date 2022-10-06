
public class Profesor extends Persona {
	
	private Integer nroLegajo;

	public Profesor(String nombre,
			        String apellido,
			        Integer dNI, 
			        Integer nroLegajo
			        ) {
		super(nombre, apellido, dNI);
		this.setNroLegajo(nroLegajo);
		
	}

	
	
	@Override
	public String toString() {
		return "Profesor: su nroLegajo es: " + nroLegajo + " su nombre es: " + nombre + " el apellido es: " + apellido + "el numero de DNI es: " + DNI;
	}

	public Integer getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(Integer nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	
	

}
