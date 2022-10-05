
public class Colectivo extends Viaje{
	
	private Integer kms;

	public Colectivo(Double valor, Double descuento, Integer kms) {
		super(valor, descuento);
		this.kms = kms;
	}
	
	public Integer getKms() {
		return kms;
	}

	public void setKms(Integer kms) {
		this.kms = kms;
	}

	public Double calcularPrecio() {
		if(kms<=3) {
			return 11.0;
		}
		else {
			if(kms>3 && kms<=6) {
				return 11.75;
			}
			else {
				if (kms>6 && kms<=12) {
					return 12.25;
				}
				else {
					if(kms>12 && kms<=27) {
						return 13.0;
					}		
					else {												
						return 13.75;
					}
				}
			}
		}
	}

	public String toString() {
		return "Colectivo [kms=" + kms + "]" + " Valor= " + valor + ", Descuento= " + descuento;
	}
	
	
}
