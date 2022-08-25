import java.util.Random;

public class Empleado implements Pagable {
	
	private int horaTrabajadas;
	private Double valorHora;
	
	
	
	public int getHoraTrabajadas() {
		return horaTrabajadas;
	}

	public void setHoraTrabajadas(int horaTrabajadas) {
		this.horaTrabajadas = horaTrabajadas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Empleado(int horaTrabajadas, int i) {
		super();
		this.horaTrabajadas = horaTrabajadas;
		this.valorHora = (double) i;
	}

	
	
	public Boolean pagar(){
	
	Random rand = new Random();
	Double sueldo = (horaTrabajadas* valorHora) + rand.nextInt();
    System.out.println("EL sueldo de el empleado es "+ sueldo);
    rand.nextInt();
    
    return rand.nextInt()> 0.15;

	}
	
	
	

}
