import java.util.ArrayList;

public class Usuario {

	private  String nombreUsuario;
	private ArrayList<ArchivoDescargable> archivoDescargable = new ArrayList<ArchivoDescargable>();
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	

	public ArrayList<ArchivoDescargable> getArchivoDescargable() {
		return archivoDescargable;
	}
	

	public void setArchivoDescargable(ArrayList<ArchivoDescargable> archivoDescargable) {
		this.archivoDescargable = archivoDescargable;
	}

	
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", archivoDescargable=" + archivoDescargable + "]";
	}
	
	public void addArchivoDescargable() {
		
	}

}
 