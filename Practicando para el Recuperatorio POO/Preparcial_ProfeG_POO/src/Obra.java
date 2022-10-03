import java.text.DecimalFormat;

public abstract class Obra {
	
	protected String titulo;
	protected Double duracion;
	protected Double calificacion;
	
	
	public Obra(String titulo, Double duracion, Double calificacion) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.calificacion = calificacion;
	}


	@Override
	public String toString() {
		DecimalFormat decimalFormat =  new DecimalFormat("0.00");
		return this.titulo + " - Duracion " + this.duracion + " minutos - Calificacion: " + decimalFormat.format(this.calificacion);
	}


	public Double getDuracion() {
		return this.duracion;
	}
	public Double getCalificacion() {
		return this.calificacion;
	}

	
	

	
	
}
