
public abstract class Viaje {
	
	protected Double valor, descuento;

	public Viaje(Double valor, Double descuento) {
		super();
		this.valor = valor;
		this.descuento = descuento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getDescuento() {
		return descuento;
	}

	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	public abstract Double calcularPrecio();
}
