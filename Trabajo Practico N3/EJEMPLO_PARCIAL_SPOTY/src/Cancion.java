
public class Cancion extends Sonido {
	
	
private String nombreAlbum;
private String letra;
private Integer anoPublicacion;

public Cancion (String titulo, Integer duracion, Integer cantidadRepro, String nombreAlbum) {
	
	super();
}



public String getNombreAlbum() {
	return nombreAlbum;
}
public void setNombreAlbum(String nombreAlbum) {
	this.nombreAlbum = nombreAlbum;
}
public String getLetra() {
	return letra;
}
public void setLetra(String letra) {
	this.letra = letra;
}
public Integer getAnoPublicacion() {
	return anoPublicacion;
}
public void setAnoPublicacion(Integer anoPublicacion) {
	this.anoPublicacion = anoPublicacion;
}


}
