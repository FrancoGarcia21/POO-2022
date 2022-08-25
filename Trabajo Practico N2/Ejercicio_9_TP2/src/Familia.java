import java.util.ArrayList;

public class Familia {
	
private ArrayList<Persona> grupoFamiliar = new ArrayList<Persona>();

public Familia() {               
}

public ArrayList<Persona> getGrupoFamiliar() {
	return grupoFamiliar;
}

public void setGrupoFamiliar(ArrayList<Persona> grupoFamiliar) {
	this.grupoFamiliar = grupoFamiliar;
}
 public void agregoPariente(Persona pariente) {
	grupoFamiliar.add(pariente);
	System.out.println("El pariente fue agregado con exito"); 
	System.out.println(grupoFamiliar.size());
 }

}
