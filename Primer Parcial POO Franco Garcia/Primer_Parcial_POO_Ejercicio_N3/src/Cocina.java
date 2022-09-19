
public class Cocina extends Electrodomestico{
	
	private Boolean electrica;

	public Cocina(
			String modelo,
			Integer precio, 
			String marca, 
			String color,
			Boolean electrica)
	{
		super(modelo, precio, marca, color);
		this.setElectrica(getElectrica());
		
	}

	public Boolean getElectrica() {
		return electrica;
	}

	public void setElectrica(Boolean electrica) {
		this.electrica = electrica;
	}

	
}
