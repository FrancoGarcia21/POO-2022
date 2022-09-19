
public class Heladera extends Electrodomestico {
	
	private Integer capacidadTotal;
	private Integer capacidadFrezzer;
	
	public Heladera(
			String modelo,
			Integer precio,
		    String marca,
			String color,
			Integer capacidadTotal,
			Integer capaccidadFrezzer
			
			) {
		super(modelo,precio,marca,color);
		this.setCapacidadTotal(getCapacidadTotal());
		this.setCapacidadFrezzer(getCapacidadFrezzer());
		
		
	}

	public Integer getCapacidadTotal() {
		return capacidadTotal;
	}

	public void setCapacidadTotal(Integer capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}

	public Integer getCapacidadFrezzer() {
		return capacidadFrezzer;
	}

	public void setCapacidadFrezzer(Integer capacidadFrezzer) {
		this.capacidadFrezzer = capacidadFrezzer;
	}
	

}
