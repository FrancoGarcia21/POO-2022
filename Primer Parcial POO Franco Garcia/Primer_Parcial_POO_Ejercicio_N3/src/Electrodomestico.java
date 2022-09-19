
public class Electrodomestico {
	
	protected String modelo;
	protected Integer precio;
	protected String marca;
	protected String color;
	
	public Electrodomestico(String modelo, Integer precio, String marca ,String color) {
	this.setModelo(modelo);
	this.setPrecio(precio);
	this.setMarca(marca);
	this.setColor(color);
	
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
