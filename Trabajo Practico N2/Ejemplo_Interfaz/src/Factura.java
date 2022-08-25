import java.util.Random;

public class Factura implements Pagable {
	private Double consumo,valorUnidad;
	
	public Factura(Double consumo, Double valorUnidad) {
		super();
		this.consumo = consumo;
		this.valorUnidad = valorUnidad;
	}

	public Double getConsumo() {
		return consumo;
	}

	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}

	public Double getValorUnidad() {
		return valorUnidad;
	}

	public void setValorUnidad(Double valorUnidad) {
		this.valorUnidad = valorUnidad;
	}
	
	public Boolean pagar() {
		Double monto = consumo * valorUnidad * 1.21;
		Random ran = new Random();
		System.out.println("El valor a pagar es "+ monto);
		
		return ran.nextDouble() <0.45;
	}

	

}
