import java.text.DecimalFormat;

public class Pelicula extends Obra {
	
	private Double recaudacion;
	private String pais;
	
	

	public Pelicula(String titulo, Double duracion, Double calificacion, Double recaudacion , String pais) {
		super(titulo, duracion, calificacion);
		this.recaudacion = recaudacion;
		this.pais = pais;
		
	}



	@Override
	public String toString() {
		DecimalFormat decimalFormat =  new DecimalFormat("0,000.00");
		return super.toString() + " Recaudacion " + decimalFormat.format(this.recaudacion) + " - Pais " + this.pais;
		
	}
	
	
	
	
	
	

}
