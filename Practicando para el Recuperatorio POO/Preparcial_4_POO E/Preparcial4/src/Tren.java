
public class Tren extends Viaje{
	
	private Integer tramos;

	public Tren(Double valor, Double descuento, Integer tramos) {
		super(valor, descuento);
		this.tramos = tramos;
	}
	
	public Integer getTramos() {
		return tramos;
	}
	
	public void setTramos(Integer tramos) {
		this.tramos = tramos;
	}

	public Double calcularPrecio() {
		switch (tramos) {
		case 1: return 3.75;
		case 2: return 4.5;
		case 3: return 6.25;
		case 4: return 6.5;
		case 5: return 7.75;
		case 6: return 9.25;
		}
		return null;
	}

	public String toString() {
		return "Tren [tramos=" + tramos + "]" +  " Valor= " + valor + ", Descuento= " + descuento;
	}
	
	
}
