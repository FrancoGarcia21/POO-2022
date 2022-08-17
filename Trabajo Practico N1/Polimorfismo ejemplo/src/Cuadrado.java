
public class Cuadrado extends Figura{
	private Double lado;
	
	
	public Cuadrado (String color, Double lado) {
		super(color);
		this.lado = lado;
	}
	
	public void setLado(Double lado) {
		this.lado = lado;
	}
	public Double area() {
		return lado*lado;
	}
	
	}

