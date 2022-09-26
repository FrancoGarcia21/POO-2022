import java.time.LocalDate;

public abstract class ArchivoDescargable {
private String nombre;
private String empresa;
private Double taminio;
private LocalDate fechaLanzamiento;
private String genero;
private Double ratings;
private Double precio;
private Integer descuento;



public ArchivoDescargable(String nombre, String empresa, Double taminio, LocalDate fechaLanzamiento, String genero,
		Double ratings, Double precio, Integer descuento) {
	super();
	this.nombre = nombre;
	this.empresa = empresa;
	this.taminio = taminio;
	this.fechaLanzamiento = fechaLanzamiento;
	this.genero = genero;
	this.ratings = ratings;
	this.precio = precio;
	this.descuento = descuento;
}


public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getEmpresa() {
	return empresa;
}

public void setEmpresa(String empresa) {
	this.empresa = empresa;
}

public Double getTaminio() {
	return taminio;
}

public void setTaminio(Double taminio) {
	this.taminio = taminio;
}

public LocalDate getFechaLanzamiento() {
	return fechaLanzamiento;
}

public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
	this.fechaLanzamiento = fechaLanzamiento;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public Double getRatings() {
	return ratings;
}


public void setRatings(Double ratings) {
	this.ratings = ratings;
}

public Double getPrecio() {
	return precio;
}


public void setPrecio(Double precio) {
	this.precio = precio;
}

public Integer getDescuento() {
	return descuento;
}

public void setDescuento(Integer descuento) {
	this.descuento = descuento;
}

@Override
public String toString() {
	return "ArchivoDescargable [nombre=" + nombre + ", empresa=" + empresa + ", taminio=" + taminio
			+ ", fechaLanzamiento=" + fechaLanzamiento + ", genero=" + genero + ", ratings=" + ratings + ", precio="
			+ precio + ", descuento=" + descuento + "]";
}


public abstract void calcularPrecio();



}
