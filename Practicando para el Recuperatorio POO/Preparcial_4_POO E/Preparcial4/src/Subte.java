
public class Subte extends Viaje{
	
	private Integer origen, llegada;

	public Subte(Double valor, Double descuento, Integer origen, Integer llegada) {
		super(valor, descuento);
		this.origen = origen;
		this.llegada = llegada;
	}

	public Integer getOrigen() {
		return origen;
	}

	public void setOrigen(Integer origen) {
		this.origen = origen;
	}

	public Integer getLlegada() {
		return llegada;
	}

	public void setLlegada(Integer llegada) {
		this.llegada = llegada;
	}

	public Double calcularPrecio() {
		Integer resu = llegada - origen;
		if (resu==0) {
			return 12.5;
		}
		else {
			if(resu == 1 || resu == -1) {
				return 10.0;
			}
			else {
				if(resu == 2 || resu == -2) {
					return 8.75;
				}
				else {
					return 7.5;
				}
			}
		}
	}

	public String toString() {
		return "Subte [origen=" + origen + ", llegada=" + llegada + "]" + " Valor= " + valor + ", Descuento= " + descuento;
	}
	
	
}
