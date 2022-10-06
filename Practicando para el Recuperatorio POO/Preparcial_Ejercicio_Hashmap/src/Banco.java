import java.util.HashMap;
import java.util.Iterator;

public class Banco {

	private String nombre;
	private HashMap<Persona,Double> cuentas = new HashMap<Persona, Double>();
	private Object persona;
	
	

	public Banco(String nombre, HashMap<Persona, Double> cuentas) {
		super();
		this.setNombre(nombre);
		this.setCuentas(new HashMap<Persona, Double>());
	}
	
	public Banco(String string) {
		// TODO Auto-generated constructor stub
	}

	public Boolean agregarCuenta(Persona persona, Double saldo) {
		if(!this.getCuentas().containsKey(persona)) {// preguunta para que es el signo d !
			this.getCuentas().put(persona, saldo);// aca agrego la cuenta en el hashmap
			System.out.println("La cuenta del cliente fue agregada con extio");
		return true;
		}
		System.out.println("Este cliente ya tiene una cuenta");
		return false;
	}
	
	public Boolean eliminarCuenta(Persona persona) {
		if(this.getCuentas().containsKey(persona)) {
			this.getCuentas().remove(persona);
			System.out.println("La cuenta del cliente feu dada de baja cone exito");
			return true;
		}
		System.out.println("El cliente no tiene cuenta en el banco");
		return false;
	}
	public void listarClientes() {
		Iterator<Persona> personas = this.getCuentas().keySet().iterator();
		while(personas.hasNext()) {// el hasNext me dice si hay siguiente y me devuelve un  boolean
			Persona per = personas.next();
			System.out.println("Nombre del cliente =" + per.getNombre() + "Saldo = " + this.getSaldo(per));
		}
		
	}
	
	public Double getSaldo(Persona persona) {
		if(this.getCuentas().containsKey(persona));
		return this.getCuentas().get(persona);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public HashMap<Persona, Double> getCuentas() {
		return cuentas;
	}
	public void setCuentas(HashMap<Persona, Double> cuentas) {
		this.cuentas = cuentas;
	}
	
	
}
while