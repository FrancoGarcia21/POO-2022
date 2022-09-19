
public class Lavarropa extends Electrodomestico {
	

	private Boolean cargaFrontal;
	private Integer capacidadKg;
	
	public Lavarropa(
			String modelo,
			Integer precio,
			String marca,
			String color,
			Boolean cargaFrontal,
			Integer capacidadkg) 
	{
		super(modelo, precio, marca, color);
		this.setCargaFrontal(cargaFrontal);
		this.setCapacidadKg(capacidadKg);
	
	}
	
	public Boolean getCargaFrontal() {
		return cargaFrontal;
	}
	public void setCargaFrontal(Boolean cargaFrontal) {
		this.cargaFrontal = cargaFrontal;
	}
	public Integer getCapacidadKg() {
		return capacidadKg;
	}
	public void setCapacidadKg(Integer capacidadKg) {
		this.capacidadKg = capacidadKg;
	}
	
	
	
	

}
