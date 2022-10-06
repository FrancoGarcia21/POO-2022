import java.util.HashMap;
import java.util.Iterator;

public class HistoriaAcademica {
	
	private HashMap<Materia,Integer> historialAcademico = new HashMap<Materia,Integer>();
	private Object nota;

	public HistoriaAcademica(HashMap<Materia, Integer> historialAcademico) {
		super();
		this.setHistorialAcademico(new HashMap<Materia,Integer>());
	}

	
public Boolean agregarMateria(Materia materia , Integer nota) {
	if(!this.getHistorialAcademico().containsKey(materia)) {
		this.getHistorialAcademico().put(materia, nota);
		System.out.println("La materia fue agregada con exito al historia academico del alumno");
		return true;
	}
	System.out.println("La materia no se agrego al historial academico del alumno");
	return false;
	}
	
	
//	public void imprimirHistorial() {
//		Iterator<Materia> materias= this.getHistorialAcademico().keySet().iterator();
//		while(materias.hasNext()) {
//			Materia mat = materias.next();
//			System.out.println("Nombre de materia:" + mat.historialAcademico + " nota :" + this.getNota(nota));
//		}
//	}
//	decidi imprimir el historial en el alumno porque tenia problemas
	
	
	
	public Integer getNota (HistoriaAcademica historiaAcademica) {
		if (this.getHistorialAcademico().containsKey(historiaAcademica));
		return this.getHistorialAcademico().get(nota);

		
	}
	
	
	public HashMap<Materia, Integer> getHistorialAcademico() {
		return historialAcademico;
	}

	public void setHistorialAcademico(HashMap<Materia, Integer> historialAcademico) {
		this.historialAcademico = historialAcademico;
	}


	

	

}
