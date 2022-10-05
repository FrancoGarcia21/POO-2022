import java.util.ArrayList;

public class Sube {
	private Double saldo;
	private Integer dni;
	private String password;
	private ArrayList<Viaje> viajes = new ArrayList<Viaje>();
	
	public Sube(Double saldo, Integer dni, String password, ArrayList<Viaje> viajes) {//si dice el nombre de la clase es el constructor
		super();
		this.saldo = saldo;
		this.dni = dni;
		this.password = password;//todo esto es el constructor
		this.viajes = viajes;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(ArrayList<Viaje> viajes) {
		this.viajes = viajes;
	}

	public void acreditarSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double consultarSaldo() {
		return this.saldo;
	}
	
	public Boolean pagarViaje(Viaje viaje) {
		viajes.add(viaje);	
		if (viajes.size()<=10) {			
			viaje.setDescuento(0.0);		
		}	
		else {		
			if(viajes.size()>10 && viajes.size()<=20) {			
				viaje.setDescuento(0.25);	
			}	
			else {
				if(viajes.size()>20 && viajes.size()<=30) {
					viaje.setDescuento(0.5);
				}
				else {
					viaje.setDescuento(0.65);
				}
			}
		}	
		if(saldo-(viaje.getValor()-(viaje.getValor()*viaje.getDescuento())) < -30) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String informeMensual() {
		return "La cantidad de viajes realizados es: " + this.viajes.size();
	}

	public String toString() {
		return "Sube [saldo=" + saldo + ", dni=" + dni + ", password=" + password + ", viajes=" + viajes + "]";
	}
	
}

