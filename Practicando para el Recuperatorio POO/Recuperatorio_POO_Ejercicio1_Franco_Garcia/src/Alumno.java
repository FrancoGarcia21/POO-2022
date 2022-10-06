import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class Alumno extends Persona{
	
	private HistoriaAcademica historiaAcademica;

	
	
	public Alumno(String nombre, String apellido, Integer dNI, HistoriaAcademica historiaAcademica) {
		super(nombre, apellido, dNI);
		this.historiaAcademica = historiaAcademica;
	}

	
	
public Boolean ingresarNota (Materia materia , Integer nota) {
	if (!this.getHistoriaAcademica().getHistorialAcademico().containsKey(materia)) {
		this.getHistoriaAcademica().agregarMateria(materia, nota);
		System.out.println("La nota fue agregada con exito");
		return true;
	}
	System.out.println("Este alumno ya tiene nota en la materia");
	return false;
}



public void imprimirHistorialAcademico () {
	Iterator<Materia> materias = ((Map<Materia, Integer>) this.getHistoriaAcademica()).keySet().iterator();
	while(materias.hasNext()) {
		Materia mat = materias.next();
		System.out.println("Nombre del alumno" + mat.getNombre()+ " nota de la materia"+ this.getHistoriaAcademica().getNota(historiaAcademica));
	}
	
}



	public HistoriaAcademica getHistoriaAcademica() {
		return historiaAcademica;
	}



	public void setHistoriaAcademica(HistoriaAcademica historiaAcademica) {
		this.historiaAcademica = historiaAcademica;
	}
	
	
	
	
	
}
