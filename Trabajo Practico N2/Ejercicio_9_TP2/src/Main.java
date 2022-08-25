
public class Main {

	public static void main(String[] args) {
		/*Persona persona = new Persona(18,'M', false , false);
		Familia monada = new Familia();
		monada.agregoPariente(persona);
		monada.agregoPariente(persona);
		
		Censo censo = new Censo();
		censo.agregoFamilia(monada);
		
		censo.cantidadFamilias();*/
		Censo censo = new Censo();
		censo.censar();
		censo.cantidadFamilias();
		
		
		
	}

}
